package BTVN4va5;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int[]mang = inputArray();
        int b = inputNumber("b");
        int c = inputNumber("c");
        do {
            if (b >= c) {
                System.out.println("Giá trị b phải nhỏ hơn c. Vui lòng nhập lại");
            }
        }while (b >= c);

        double average = tinhTrungBinhCong( mang, b, c);

        System.out.println("Trung bình cộng các phần tử trong khoảng [ " + b + "," + c + "] là:" + average);
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

    public static int inputNumber(String integerName ){
        System.out.print("Nhập số nguyên" + integerName + ":");
        int number = new Scanner(System.in).nextInt();
        return number;
    }

    public static double tinhTrungBinhCong(int[]myArray, int b, int c) {
        int sum = 0;
        int count = 0;
        double trungbinhcong = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i]>=b && myArray[i] <= c) {
                sum += myArray[i];
                count++;
            }
        }
        if (count > 0){
            trungbinhcong = (double) sum/ count;
        } else {
            System.out.println("Không có phần tử nào trong khoảng [" + b +","+ c + "]");
            return 0;
        }
        return trungbinhcong;
    }
}
