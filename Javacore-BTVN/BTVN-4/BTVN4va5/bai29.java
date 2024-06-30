package BTVN4va5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class bai29 {
    public static void main(String[] args) {
        System.out.print("Nhập số dòng n = ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhập số cột m = ");
        int m = new Scanner(System.in).nextInt();

        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a [" + i + "]["+ j + "]:");
                matrix[i][j] = new Scanner(System.in).nextInt();
            }
        }
        printMatrix(matrix);

        int S = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                S += matrix[i][j];
            }
        }
        System.out.println("Tổng = " + S);
        System.out.println("Trung bình cộng =" + (float) S / (n + m));
    }

    public static void  printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print(matrix[i][j]);
                if (j<matrix.length-1){
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
