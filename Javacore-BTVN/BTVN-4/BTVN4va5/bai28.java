package BTVN4va5;

import java.util.Scanner;

public class bai28 {
    public static void main(String[] args) {
        System.out.print("Nhập kích thước n = ");
        int n = new Scanner(System.in).nextInt();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a [" + i + "][" + j + "]:");
                matrix[i][j] = new Scanner(System.in).nextInt();
            }
        }
        printMatrix(matrix);

        int Sum = 0;
        for (int i = 0; i < n; i++) {
            Sum += matrix[i][i];
        }
        System.out.println("Tổng đường chéo chính của ma trận là:" + Sum);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix.length - 1) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
