package BTVN4va5;

import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        int[]mang = inputArray();
        sapXepMang(mang);
        System.out.println("Mảng sau khi sắp xếp theo thứ tự tăng dần: ");
        for (int x : mang) {
            System.out.print(x + " ");
        }

    }
    public static int[] inputArray(){
        System.out.println("Nhập vào số lượng phần tử: "); // Nhập số lượng phần tử của mảng
        int n = new Scanner(System.in).nextInt();

        int[] myArray = new int[n];// Khởi tạo mảng
        System.out.println("Nhập các phần tử của mảng:" );
        for(int i = 0; i < n; i++){
            System.out.print("a [" + i + "]=");
            myArray[i] = new Scanner(System.in).nextInt();
        }
        return myArray;
    }
    // sắp xếp mảnh theo thứ tự tăng dần
    public static void sapXepMang(int [] myArray) {
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = 0; j < myArray.length - 1 - i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
    }
}
