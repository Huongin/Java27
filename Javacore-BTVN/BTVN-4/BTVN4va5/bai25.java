package BTVN4va5;

import java.util.Scanner;

public class bai25 {
    public static void main(String[] args) {
        int[]array = inputArray();
        int soLe = demCacSoLe(array);
        int soChan = demCacSoChan(array);

        hienThiKetQua(soLe, soChan);
    }

    public static int[] inputArray(){
        System.out.print("Nhập vào số lượng phần tử: "); // Nhập số lượng phần tử của mảng
        int n = new Scanner(System.in).nextInt();

        int[] myArray = new int[n];// Khởi tạo mảng
        System.out.println("Nhập các phần tử của mảng:" );
        for (int i = 0; i < n; i++) {
            System.out.print("a [" + i + "]=");
            myArray[i] = new Scanner(System.in).nextInt();
        }
        return myArray;
    }

    public static int demCacSoLe (int[]myArray) {
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    public static int demCacSoChan (int[]myArray) {
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void hienThiKetQua(int sole, int sochan){
        System.out.println("Số phần tử lẻ trong mảng:" + sole);
        System.out.println("Số phần tử chẳn trong mảng:" + sochan);
    }
}
