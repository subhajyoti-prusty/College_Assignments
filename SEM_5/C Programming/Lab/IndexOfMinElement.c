#include <stdio.h>

int findMin(int *arr, int size) {
    int minIndex = 0;

    for (int i = 1; i < size; i++) {  
        if (arr[i] < arr[minIndex]) {
            minIndex = i;
        }
    }

    return minIndex;
}

int main() {
    int arr[10];
    printf("Enter 5 integers:\n");
    for (int i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);
    }

    int minIndex = findMin(arr, 5);

    printf("The minimum element is %d at index %d\n", arr[minIndex], minIndex);

    return 0;
}
