#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <semaphore.h>
#include <fcntl.h>

#define TERM_COUNT 10

void calculate_and_print_series(int id, sem_t* sem_current, sem_t* sem_next) {
    for (int k = 0; k < TERM_COUNT; k++) {
        sem_wait(sem_current);

        int term = 3 * k + id;
        printf("%d ", term);

        sem_post(sem_next);
    }
}

int main() {
    pid_t p1, p2, p3;

    setvbuf(stdout, NULL, _IONBF, 0);

    sem_t* sem1 = sem_open("/sem1", O_CREAT | O_EXCL, 0666, 1);
    sem_t* sem2 = sem_open("/sem2", O_CREAT | O_EXCL, 0666, 0); 
    sem_t* sem3 = sem_open("/sem3", O_CREAT | O_EXCL, 0666, 0); 

    if (sem1 == SEM_FAILED || sem2 == SEM_FAILED || sem3 == SEM_FAILED) {
        perror("sem_open failed");
        exit(EXIT_FAILURE);
    }

    p1 = fork();
    if (p1 == 0) {
        calculate_and_print_series(1, sem1, sem2);
        exit(EXIT_SUCCESS);
    }

    p2 = fork();
    if (p2 == 0) {
        calculate_and_print_series(2, sem2, sem3);
        exit(EXIT_SUCCESS);
    }

    p3 = fork();
    if (p3 == 0) {
        calculate_and_print_series(3, sem3, sem1);
        exit(EXIT_SUCCESS);
    }

    wait(NULL);
    wait(NULL);
    wait(NULL);

    printf("\n");

    sem_close(sem1);
    sem_close(sem2);
    sem_close(sem3);
    sem_unlink("/sem1");
    sem_unlink("/sem2");
    sem_unlink("/sem3");

    return 0;
}

