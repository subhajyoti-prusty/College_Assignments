#include <stdio.h>

int main() {
    int n1, n2, i, j;
    printf("Enter the length of the first array: ");
    scanf("%d", &n1);

    int a[n1];
    printf("Enter %d elements in the first array:\n", n1);
    for (i = 0; i < n1; i++) {
        scanf("%d", &a[i]);
    }

    printf("Enter the length of the second array: ");
    scanf("%d", &n2);

    int b[n2]; 
    printf("Enter %d elements in the second array:\n", n2);
    for (i = 0; i < n2; i++) {
        scanf("%d", &b[i]);
    }

    printf("The common elements in the two arrays are:\n");
    for (i = 0; i < n1; i++) {
        for (j = 0; j < n2; j++) {
            if (a[i] == b[j]) {
                printf("%d ", a[i]);  
                break;
            }
        }
    }

    printf("\n");
    return 0;
}
