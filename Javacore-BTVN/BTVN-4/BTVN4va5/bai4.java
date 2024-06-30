package BTVN4va5;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int[] mang = inputArray();
        int count = countArray(mang);
        System.out.println("Số cặp phần tử liên tiếp bằng nhau trong dãy là : " + count);

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

    public static int countArray(int[]myArray){
        int count = 0;
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] == myArray[i + 1]) {
                count++;

                int j = i + 1;
                while ( j < myArray.length - 1 && myArray[j]==myArray[j+1]) {
                     count++;
                     j++;
                }
                i=j;
            }
        }
        return count;
    }
}
