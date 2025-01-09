#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <ctype.h>
#include <sys/wait.h>

#define FILENAME "textfile.txt"
#define MAX_LINE_LENGTH 256

void writeToFile() {
    FILE *file = fopen(FILENAME, "w");
    if (file == NULL) {
        perror("Error opening file");
        exit(EXIT_FAILURE);
    }

    printf("Enter lines of text (type 'END' to stop):\n");
    char line[MAX_LINE_LENGTH];
    while (1) {
        fgets(line, sizeof(line), stdin);
        if (line[0] == 'E' && line[1] == 'N' && line[2] == 'D' && 
            (line[3] == '\n' || line[3] == '\0')) {
            break;
        }
        fputs(line, file);
    }
    fclose(file);
}

void convertToUppercase() {
    FILE *file = fopen(FILENAME, "r+");
    if (file == NULL) {
        perror("Error opening file");
        exit(EXIT_FAILURE);
    }

    char ch;
    long pos;

    while ((pos = ftell(file)) >= 0) {
        ch = fgetc(file);
        if (ch == -1) {
            break;
        }
        if (islower(ch)) {
            fseek(file, pos, SEEK_SET);
            fputc(toupper(ch), file);
        }
    }
    fclose(file);
}

void printFileContent() {
    FILE *file = fopen(FILENAME, "r");
    if (file == NULL) {
        perror("Error opening file");
        exit(EXIT_FAILURE);
    }

    char line[MAX_LINE_LENGTH];
    printf("\nFinal content of the file:\n");
    while (fgets(line, sizeof(line), file) != NULL) {
        printf("%s", line);
    }
    fclose(file);
}

int main() {
    pid_t pid1, pid2;

    writeToFile();

    pid1 = fork();
    if (pid1 == -1) {
        perror("Fork failed");
        exit(EXIT_FAILURE);
    } else if (pid1 == 0) {
        convertToUppercase();
        exit(EXIT_SUCCESS);
    }
    waitpid(pid1, NULL, 0);

    pid2 = fork();
    if (pid2 == -1) {
        perror("Fork failed");
        exit(EXIT_FAILURE);
    } else if (pid2 == 0) {
        printFileContent();
        exit(EXIT_SUCCESS);
    }
    waitpid(pid2, NULL, 0);

    return 0;
}

