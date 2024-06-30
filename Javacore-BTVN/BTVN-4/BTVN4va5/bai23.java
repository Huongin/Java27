package BTVN4va5;

import java.util.Arrays;
import java.util.Scanner;

public class bai23 {
    public static void main(String[] args) {
        int[] array = inputArray();
        System.out.println(Arrays.toString(array));
        sapXepTangDan(array);
        System.out.println(Arrays.toString(array));
        array= newArray(array);
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

    // Sắp xếp tăng dần
    public static void sapXepTangDan(int[] myArray) {
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

    public static int [] newArray (int[]myArray){
        int[]newArr = new int[myArray.length+1]; //tạo mảng mới kích thước lớn hơn

        for (int i = 0; i <myArray.length; i++) { //sao chép mảng cũ vào mảng mới
            newArr[i] = myArray[i];
        }

        //chèn x vào vị trí cần chèn
        System.out.print("Nhap so thuc x: ");
        float x = new Scanner(System.in).nextInt();
        int indexX = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (x <= myArray[i]) {
                indexX = i;
                break;
            }
        }
        for (int i = newArr.length - 1; i > indexX; i--) {
            newArr[i] = newArr[i - 1];
        }
        newArr[indexX]=(int) x;
        return newArr;
    }
}
