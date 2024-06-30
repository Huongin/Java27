package BTVN4va5;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        int[] array = inputArray();

        boolean doiChieu = checkMang(array);

        if (doiChieu) {
            System.out.println("Mảng là đối xứng.");
        } else {
            System.out.println("Mảng không phải là đối xứng.");
        }
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

    public static boolean checkMang(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            if (array[i] != array[n - i - 1]) {
                return false;
            }
        }
        return true;
    }

}

