package CSW;

public class Class29 {
    public static void main(String[] args) {
        // Multidimensional Arrays
        int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(array1[1][2]);
        int k = array1[2][2];
        System.out.println(k);
        array1[2][1] = 10;
        System.out.println(array1[2][1]);

        // printing an array
        int[][] array2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
        }
    }
}