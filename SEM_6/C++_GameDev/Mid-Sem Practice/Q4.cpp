//Create a program to generate a random 1D array of size 10.Then shift each element 2 position right and filled th beginning two place with random element from the range 20-30. Finally display both the array.

#include <stdio.h>
#include <stdlib.h>

#define SIZE 10

int main() {
    int arr[SIZE];
    int shiftedArr[SIZE];

    srand(1);

    printf("Original array:\n");
    for (int i = 0; i < SIZE; i++) {
        arr[i] = rand() % 100;
        printf("%d ", arr[i]);
    }

    for (int i = SIZE - 1; i >= 2; i--) {
        shiftedArr[i] = arr[i - 2];
    }

    for (int i = 0; i < 2; i++) {
        shiftedArr[i] = 20 + rand() % 11;
    }

    printf("\n\nShifted array:\n");
    for (int i = 0; i < SIZE; i++) {
        printf("%d ", shiftedArr[i]);
    }

    return 0;
}

