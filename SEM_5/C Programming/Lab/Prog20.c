#include <stdio.h>

int main() {
    int a[100], b[100];
    int i, j, isPresent;
    printf("Enter elements of array a (enter -1 to stop):\n");
    i = 0;
    while (1) {
        int temp;
        scanf("%d", &temp);
        if (temp == -1) {
            break;
        }
        a[i] = temp;
        i++;
    }
    int sizeA = i;
    printf("Enter elements of array b (enter -1 to stop):\n");
    i = 0;
    while (1) {
        int temp;
        scanf("%d", &temp);
        if (temp == -1) {
            break;
        }
        b[i] = temp;
        i++;
    }
    int sizeB = i;
    printf("Elements in a but not in b are: ");
    for (i = 0; i < sizeA; i++) {
        isPresent = 0;
        for (j = 0; j < sizeB; j++) {
            if (a[i] == b[j]) {
                isPresent = 1;  
                break;
            }
        }

        if (isPresent == 0) {
            printf("%d ", a[i]);
        }
    }

    printf("\n");
    return 0;
}
