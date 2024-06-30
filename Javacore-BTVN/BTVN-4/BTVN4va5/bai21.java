package BTVN4va5;

import java.util.Arrays;
import java.util.Scanner;

public class bai21 {
    public static void main(String[] args) {
        int[]mang = inputArray();
        System.out.println(Arrays.toString(mang));
        mang = insertX(mang,mang.length);
        System.out.println(Arrays.toString(mang));

    }

    public static int[] inputArray() {
        System.out.print("Nhập vào số lượng phần tử: "); // Nhập số lượng phần tử của mảng
        int n = new Scanner(System.in).nextInt();

        int[] a = new int[n];     // Khởi tạo mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("a [" + i + "]=");
            a [i] = new Scanner(System.in).nextInt();
        }
        return a;
    }
    public static int [] insertX(int[]a, int n){
        System.out.print("Nhập số nguyên x cần chèn: ");
        int x = new Scanner(System.in).nextInt();

        System.out.print("Nhập vị trí k cần chèn x vào: ");
        int k = new Scanner(System.in).nextInt();

        //Tạo mảng mới và sao chép
        int[] newArray = new int[n+1];
        for (int i = 0; i <n; i++) {
            newArray [i] = a [i];
        }

        //Kiểm tra vị trí k
        if (k < 0 || k > n){
            System.out.print("vị trí k không hợp lệ");
            return a;
        }else {
            for (int i = 0; i < k ; i++) {
                a[i] = a[ i];
            }

            newArray[k] = x;
            for (int i = k; i < n; i++) {
                newArray[i+1] = a[i];
            }
        }
        return newArray;
    }
}
