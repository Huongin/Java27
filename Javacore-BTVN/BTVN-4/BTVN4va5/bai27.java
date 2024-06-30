package BTVN4va5;

import java.util.Scanner;

public class bai27 {
    public static void main(String[] args) {
        System.out.println("Nhập số phần tử :");
        int n = new Scanner(System.in).nextInt();

        //Khai báo mảng
        int[] arrayA = new int[n];
        int[] arrayB = new int[n];

        // Nhập mảng A
        System.out.println("Nhập các phần tử của mảng A: ");
        for (int i = 0; i < n; i++) {
            System.out.print("A [" + i + "]: ");
            arrayA[i] = new Scanner(System.in).nextInt();
        }

        // Nhập mảng B
        System.out.println("Nhập các phần tử của mảng B: ");
        for (int i = 0; i < n; i++) {
            System.out.print("B [" + i + "]: ");
            arrayB[i] = new Scanner(System.in).nextInt();
        }

        // Tính tổng hai mảng
        int[] sumArray = tinhTongHaiMang(arrayA, arrayB);

        // In mảng kết quả
        System.out.println("Mảng kết quả sau khi tính tổng: ");
        printArray(sumArray, "Sum");
    }

    public static int[] tinhTongHaiMang(int[] arrayA, int[] arrayB) {
        int n = arrayA.length;
        int[] sumArray = new int[n];
        for (int i = 0; i < n; i++) {
            sumArray[i] = arrayA[i] + arrayB[n - 1 - i];
        }
        return sumArray;
    }

    public static void printArray(int[] array, String arrayName) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(arrayName + " [" + i + "] = " + array[i]);
        }
    }
}