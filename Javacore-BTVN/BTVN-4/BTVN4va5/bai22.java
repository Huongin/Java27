package BTVN4va5;

import java.util.Arrays;
import java.util.Scanner;

public class bai22 {
    public static void main(String[] args) {
        int[] array = inputArray();
        System.out.println(Arrays.toString(array));
        array = newArray(array,array.length);
        System.out.print(Arrays.toString(array));
    }

    //Tạo mảng và khai báo biến
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

    public static int[] newArray(int[] myArray, int n) {

        System.out.print("Nhập vị trí k cần xóa k>=0,k<" + (n - 1) + "là :");
        int k = new Scanner(System.in).nextInt();

        if (k < 0 || k >= n) {
            System.out.println("vị trí k không hợp lệ");
            return  myArray;
        }

        int[] newArr = new int[n - 1]; //tạo mảng mới kích thước nhỏ hơn

        int index = 0;
        for (int i = 0; i < n; i++) {  // Sao chép các phần tử trừ phần tử vị trí k vào mảng mới
            if (i != k) {
                newArr[index] = myArray[i];
                index++;
            }
        }
        return newArr;
    }
}