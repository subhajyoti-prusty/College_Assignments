#include <stdio.h>

int main() {
    int n, isUnique;
    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);

    int arr[n];
    int i;
    printf("Enter %d elements in the array:\n", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    int j;
    printf("The unique elements in the array are:\n");
    for (i = 0; i < n; i++) {
        isUnique = 1;  
        for (j = 0; j < i; j++) {
            if (arr[i] == arr[j]) {
                isUnique = 0;
                break;
            }
        }

        if (isUnique) {
            printf("%d ", arr[i]);
        }
    }

    return 0;
}
