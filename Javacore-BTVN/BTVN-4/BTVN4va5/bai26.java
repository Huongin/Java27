package BTVN4va5;

import java.util.Scanner;

public class bai26 {
    public static void main(String[] args) {
        int[]array = inputArray();
        int x = inputX();
        int countx = demTanxuatSoX(array, x);
        System.out.println("Só lần xuất hiện của x trong mảng là:" + countx );

    }
    public static int[] inputArray() {
        System.out.print("Nhập vào số lượng phần tử: "); // Nhập số lượng phần tử của mảng
        int n = new Scanner(System.in).nextInt();

        int[] myArray = new int[n];// Khởi tạo mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("a [" + i + "]=");
            myArray[i] = new Scanner(System.in).nextInt();
        }
        return myArray;
    }

    public static int inputX () {
        System.out.print("Nhập số nguyên cần đếm X =");
        int x = new Scanner(System.in).nextInt();
        return x;
    }


    public static int demTanxuatSoX (int[] myArray, int x){
        int count = 0;
        for (int i = 0; i <myArray.length ; i++) {
            if (x == myArray[i]) {
                count++;
            }
        }
        return count;
    }
}
