#include <stdio.h>

int main() {
    int rows, cols, i, j;
    int countZero = 0;
    printf("Enter the number of rows: ");
    scanf("%d", &rows);
    printf("Enter the number of columns: ");
    scanf("%d", &cols);

    int matrix[rows][cols];

    printf("Enter the elements of the matrix:\n");
    for (i = 0; i < rows; i++) {
        for (j = 0; j < cols; j++) {
            scanf("%d", &matrix[i][j]);
            if (matrix[i][j] == 0) {
                countZero++;
            }
        }
    }

    printf("The number of zeros in the matrix is: %d\n", countZero);

    int totalElements = rows * cols;
    if (countZero > totalElements / 2) {
        printf("The matrix is a sparse matrix.\n");
    } else {
        printf("The matrix is not a sparse matrix.\n");
    }

    return 0;
}
