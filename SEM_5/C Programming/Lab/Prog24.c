#include <stdio.h>
int main() {
    int n, i;
    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);

    int arr[n];     
    int *ptrs[n];         

    printf("Enter array elements:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);  
        ptrs[i] = &arr[i];     
    }

    int *min = ptrs[0];
    int *max = ptrs[0];

    for (i = 1; i < n; i++) {
        if (*ptrs[i] < *min) {
            min = ptrs[i];
        }
        if (*ptrs[i] > *max) {
            max = ptrs[i];
        }
    }

    printf("Minimum value in the array: %d\n", *min);
    printf("Maximum value in the array: %d\n", *max);

    return 0;
}
