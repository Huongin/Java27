package BTVN4va5;

import java.util.Arrays;
import java.util.Scanner;


public class bai20 {
    public static void main(String[] args) {
        int[]mang = inputArray();
        System.out.println(Arrays.toString(mang));
        minMax(mang);
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
    public static void minMax(int[]a){
        int min = a[0];
        int max = a[a.length-1];
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[1];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Số nhỏ nhất trong mảng là: " + min);
        System.out.println("Số lớn nhất trong mảng là: "+ max);
    }
}
    // 1 vòng lặp for
//    public static void  minMax(int[]a){
//        int min = a[0];
//        int max = a[0];
//        for (int i = 1; i <a.length ; i++) {
//            if (a[i] < min){
//                min = a[i];
//            }
//            if (a[i] > max){
//                max = a[i];
//            }
//        }
//        System.out.println("Số nhỏ nhất trong mảng là: " + min);
//        System.out.println("Số lớn nhất trong mảng là: "+ max);
//    }
//}
