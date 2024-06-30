package BTVN4va5;

import java.util.Scanner;

public class bai12 {

    public static void main(String[] args) {
        //Nhập kích thước ma trận A
        System.out.print("Nhập số dòng m = ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Nhập số cột n = ");
        int n = new Scanner(System.in).nextInt();

        int[][] matrixA = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a [" + i + "][" + j + "]:");
                matrixA[i][j] = new Scanner(System.in).nextInt();
            }
        }

        //Nhập kích thước ma trận B
        System.out.print("Nhập số cột k = ");
        int k = new Scanner(System.in).nextInt();

        int[][] matrixB = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("b [" + i + "][" + j + "]:");
                matrixB[i][j] = new Scanner(System.in).nextInt();
            }
        }
        //Tích ma trận A và B là ma trận AB cấp m, k
        int[][] matrixAB = new int[m][k];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < n; l++) {
                    matrixAB[i][j] += matrixA[i][l] * matrixB[l][j];
                }
            }
            printMatrix(matrixAB,m,k);
        }
    }
    public static void printMatrix ( int[][] matrixAB,int m,int k) {
        System.out.println("tích ma trận A và B là:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(matrixAB[i][j] + " ");
            }
            System.out.println();
        }
    }
}
