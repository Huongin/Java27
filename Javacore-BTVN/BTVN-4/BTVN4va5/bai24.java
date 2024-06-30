package BTVN4va5;

import java.util.Arrays;
import java.util.Scanner;

public class bai24 {
    public static void main(String[] args) {
        int[]array = inputArray();
        System.out.println(Arrays.toString(array));
        sapXepTangDan(array);
        System.out.println(Arrays.toString(array));

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

    public static void sapXepTangDan (int[]myArray){
        for (int i = 0; i <myArray.length-1 ; i++) {
            for (int j = 0; j < myArray.length - 1 - i ; j++) {
                if (myArray[j]<myArray[j+1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }
    }
}
