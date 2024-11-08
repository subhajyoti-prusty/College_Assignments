#include <stdio.h>

void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void sort(int arr[], int size) {
    for (int i = 0; i < size - 1; i++) {
        for (int j = i + 1; j < size; j++) {
            if (arr[i] > arr[j]) {
                swap(&arr[i], &arr[j]);
            }
        }
    }
}

int main() {
    int n[5];

    printf("Enter 5 integers: ");
    for (int i = 0; i < 5; i++) {
        scanf("%d", &n[i]);
    }

    sort(n, 5);

    printf("Sorted numbers in ascending order: ");
    for (int i = 0; i < 5; i++) {
        printf("%d ", n[i]);
    }
    printf("\n");

    return 0;
}
