#include <stdio.h>

int main() {
    int arr[100], n, element, position, choice;
    
    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);

    printf("Enter %d elements: ", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    while (1) {
        printf("\nMenu:\n");
        printf("1. Add element\n");
        printf("2. Delete element\n");
        printf("3. Display array\n");
        printf("4. Exit\n");
        
        printf("Enter your choice: ");
        scanf("%d", &choice);

        if (choice == 1) {
            printf("Enter the element to add: ");
            scanf("%d", &element);
            printf("Enter the position to insert the element (0 to %d): ", n);
            scanf("%d", &position);

            if (position >= 0 && position <= n) {
                for (int i = n; i > position; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[position] = element;
                n++;
            } else {
                printf("Invalid position!\n");
            }
        } 
        else if (choice == 2) {
            printf("Enter the position of element to delete (0 to %d): ", n - 1);
            scanf("%d", &position);

            if (position >= 0 && position < n) {
                for (int i = position; i < n - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                n--;
            } else {
                printf("Invalid position!\n");
            }
        } 
        else if (choice == 3) {
            printf("Array elements: ");
            for (int i = 0; i < n; i++) {
                printf("%d ", arr[i]);
            }
            printf("\n");
        } 
        else if (choice == 4) {
            break;
        } 
        else {
            printf("Invalid choice!\n");
        }
    }

    return 0;
}

