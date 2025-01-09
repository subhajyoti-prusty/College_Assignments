#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

#define FILE_NAME "input.txt"

int count_words(const char *filename) {
    FILE *file = fopen(filename, "r");
    if (!file) {
        perror("Unable to open file");
        exit(EXIT_FAILURE);
    }
    int count = 0;
    char word[256];
    while (fscanf(file, "%s", word) == 1) {
        count++;
    }
    fclose(file);
    return count;
}

int count_lines(const char *filename) {
    FILE *file = fopen(filename, "r");
    if (!file) {
        perror("Unable to open file");
        exit(EXIT_FAILURE);
    }
    int count = 0;
    char ch;
    while ((ch = fgetc(file)) != EOF) {
        if (ch == '\n') {
            count++;
        }
    }
    fclose(file);
    return count;
}

int count_characters(const char *filename) {
    FILE *file = fopen(filename, "r");
    if (!file) {
        perror("Unable to open file");
        exit(EXIT_FAILURE);
    }
    int count = 0;
    while (fgetc(file) != EOF) {
        count++;
    }
    fclose(file);
    return count;
}

int main() {
    pid_t p1, p2, p3;

    p1 = fork();
    if (p1 == 0) {
        int word_count = count_words(FILE_NAME);
        printf("Child 1 (Words): %d\n", word_count);
        exit(EXIT_SUCCESS);
    }

    p2 = fork();
    if (p2 == 0) {
        int line_count = count_lines(FILE_NAME);
        printf("Child 2 (Lines): %d\n", line_count);
        exit(EXIT_SUCCESS);
    }

    p3 = fork();
    if (p3 == 0) {
        int char_count = count_characters(FILE_NAME);
        printf("Child 3 (Characters): %d\n", char_count);
        exit(EXIT_SUCCESS);
    }

    wait(NULL);
    wait(NULL);
    wait(NULL);

    printf("Parent: All child processes have finished.\n");

    return 0;
}

