#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <string.h>

void copy_file(const char *source, const char *destination) {
    FILE *src = fopen(source, "r");
    FILE *dest = fopen(destination, "w");
    if (!src || !dest) {
        perror("File open error");
        exit(EXIT_FAILURE);
    }
    char ch;
    while ((ch = fgetc(src)) != EOF) {
        fputc(ch, dest);
    }

    fclose(src);
    fclose(dest);
}

void display_file(const char *filename) {
    FILE *file = fopen(filename, "r");
    if (!file) {
        perror("File open error");
        exit(EXIT_FAILURE);
    }

    char ch;
    while ((ch = fgetc(file)) != EOF) {
        putchar(ch);
    }
    fclose(file);
}

void display_sorted_reverse(const char *filename) {
    FILE *file = fopen(filename, "r");
    if (!file) {
        perror("File open error");
        exit(EXIT_FAILURE);
    }

    char lines[100][256];
    int count = 0;

    while (fgets(lines[count], sizeof(lines[count]), file)) {
        count++;
    }
    fclose(file);

    // Sort lines
    for (int i = 0; i < count - 1; i++) {
        for (int j = i + 1; j < count; j++) {
            if (strcmp(lines[i], lines[j]) > 0) {
                char temp[256];
                strcpy(temp, lines[i]);
                strcpy(lines[i], lines[j]);
                strcpy(lines[j], temp);
            }
        }
    }

    // Display sorted lines in reverse order
    for (int i = count - 1; i >= 0; i--) {
        printf("%s", lines[i]);
    }
}

int main() {
    pid_t pid1, pid2, pid3;

    // First child: Copy content of file1 to file2
    if ((pid1 = fork()) == 0) {
        printf("First child (PID: %d, Parent PID: %d): Copying file1 to file2...\n", getpid(), getppid());
        copy_file("file1.txt", "file2.txt");
        printf("First child: File copy completed.\n");
        exit(0);
    }

    sleep(1); // Delay for 1 second after creating the first child

    // Second child: Display content of file2
    if ((pid2 = fork()) == 0) {
        printf("Second child (PID: %d, Parent PID: %d): Displaying content of file2...\n", getpid(), getppid());
        display_file("file2.txt");
        printf("\nSecond child: Content displayed.\n");
        exit(0);
    }

    sleep(1); // Delay for 1 second after creating the second child

    // Third child: Display sorted content of file2 in reverse order
    if ((pid3 = fork()) == 0) {
        printf("Third child (PID: %d, Parent PID: %d): Displaying sorted content of file2 in reverse order...\n", getpid(), getppid());
        display_sorted_reverse("file2.txt");
        printf("\nThird child: Sorted content displayed.\n");
        exit(0);
    }

    sleep(1); // Delay for 1 second after creating the third child

    // Parent process: Wait for all child processes to complete
    printf("Parent process (PID: %d): Waiting for children to complete...\n", getpid());
    waitpid(pid1, NULL, 0);
    waitpid(pid2, NULL, 0);
    waitpid(pid3, NULL, 0);
    printf("Parent process: All child processes completed. Exiting...\n");

    return 0;
}

