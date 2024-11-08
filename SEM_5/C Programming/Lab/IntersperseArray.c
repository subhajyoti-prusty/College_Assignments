#include <stdio.h>

void intersperseArrays(int arr1[], int size1, int arr2[], int size2, int result[]) {
    int i = 0, j = 0, k = 0;

    while (i < size1 && j < size2) {
        result[k++] = arr1[i++];
        result[k++] = arr2[j++];
    }

    while (i < size1) {
        result[k++] = arr1[i++];
    }
    
    while (j < size2) {
        result[k++] = arr2[j++];
    }

}

int main() {
    int arr1[] = {5, 7, 4, 5, 8};
    int arr2[] = {12, 16, 20, 19, 14};
    int size1 = sizeof(arr1) / sizeof(arr1[0]);
    int size2 = sizeof(arr2) / sizeof(arr2[0]);
    int result[size1 + size2];

    intersperseArrays(arr1, size1, arr2, size2, result);

    printf("Interspersed array: ");
    for (int i = 0; i < size1 + size2; i++) {
        printf("%d ", result[i]);
    }

    return 0;
}
