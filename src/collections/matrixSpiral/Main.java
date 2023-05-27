package collections.matrixSpiral;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 4;
        int columns = 4;
        int[][] matrix = initialiseMatrix(scanner);

        printSpiral(rows, columns, matrix);

    }


    private static int[][] initialiseMatrix(Scanner scanner) {
        int rows = 4;
        int columns = 4;
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = array;
        }
        return matrix;
    }

    private static void printSpiral(int m, int n, int[][] mat){
        int k =0, l =0;
        int lastRow = m - 1, lastCol = n - 1;
        while (k <= lastRow && l <= lastCol) {
            for (int i = l; i <= lastCol; i++) {
                System.out.print(mat[k][i] + " ");
            }
            k++;

            for (int i = k; i <= lastRow; i++) {
                System.out.print(mat[i][lastCol] + " ");
            }
            lastCol--;

            if (k <= lastRow) {
                for (int i = lastCol; i >= l; i--) {
                    System.out.print(mat[lastRow][i] + " ");
                }
                lastRow--;
            }
            if (l <= lastCol){
                for (int i = lastRow; i >= k; i--) {
                    System.out.print(mat[i][l] + " ");
                }
                l++;
            }
        }
    }

}
