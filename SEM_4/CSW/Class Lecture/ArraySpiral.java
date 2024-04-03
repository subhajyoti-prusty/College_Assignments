package CSW_2.Class19;

public class ArraySpiral {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };
        spiralPrint(matrix);
    }

    public static void spiralPrint(int[][] matrix) {
        int topRow = 0;
        int bottomRow = matrix.length - 1;
        int leftColumn = 0;
        int rightColumn = matrix[0].length - 1;

        while (topRow <= bottomRow && leftColumn <= rightColumn) {
            // Print top row
            for (int i = leftColumn; i <= rightColumn; i++) {
                System.out.print(matrix[topRow][i] + " ");
            }
            topRow++;

            // Print right column
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightColumn] + " ");
            }
            rightColumn--;

            // Print bottom row
            if (topRow <= bottomRow) {
                for (int i = rightColumn; i >= leftColumn; i--) {
                    System.out.print(matrix[bottomRow][i] + " ");
                }
                bottomRow--;
            }

            // Print left column
            if (leftColumn <= rightColumn) {
                for (int i = bottomRow; i >= topRow; i--) {
                    System.out.print(matrix[i][leftColumn] + " ");
                }
                leftColumn++;
            }
        }
    }
}