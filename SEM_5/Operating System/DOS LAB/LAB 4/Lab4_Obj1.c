#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
int main() {
    pid_t pid;
    pid = fork();  // Create a child process
    if (pid == 0) {  // Child process
        while (1) {
            printf("Child process: PID = %d\n", getpid());
            sleep(1);  // Sleep for 1 second to prevent overloading the terminal
        }
    } else if (pid > 0) {  // Parent process
        while (1) {
            printf("Parent process: PID = %d\n", getpid());
            sleep(1);  // Sleep for 1 second to prevent overloading the terminal
        }
    } else {
        // Fork failed
        perror("fork failed");
        return 1;
    }
    return 0;
}

