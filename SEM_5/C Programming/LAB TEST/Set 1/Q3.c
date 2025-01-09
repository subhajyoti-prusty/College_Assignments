#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <semaphore.h>
#include <fcntl.h>

void print_PID() {
    int PID = getpid();
    char str[100];

    sprintf(str, "My process id is %d\n", PID);

    for (int i = 0; i < strlen(str); i++) {
        fprintf(stderr, "%c", str[i]);
        sleep(1);
    }
}

int main() {
    sem_t *sem;
    
    sem = sem_open("/print_semaphore", O_CREAT, 0644, 1);
    if (sem == SEM_FAILED) {
        perror("sem_open");
        exit(1);
    }

    pid_t pid;
    int num_children = 3;

    for (int i = 0; i < num_children; i++) {
        pid = fork();

        if (pid < 0) {
            perror("fork");
            exit(1);
        }

        if (pid == 0) { 
            sem_wait(sem);

            print_PID();
            
            sem_post(sem);

            exit(0);
        }
    }

    for (int i = 0; i < num_children; i++) {
        wait(NULL);
    }

    sem_close(sem);
    sem_unlink("/print_semaphore");

    return 0;
}

