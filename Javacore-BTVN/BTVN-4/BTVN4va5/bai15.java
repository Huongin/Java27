package BTVN4va5;

import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        System.out.print("Nhập các số tự nhiên n = ");
        int n = new Scanner(System.in).nextInt();
        tinhTongCacSo(n);
    }

    public static void tinhTongCacSo(int n){
        int sum = 0;
        for (int i = 1; i < n ; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println("Tổng các số chia hết cho 7 và nhỏ hơn n la: "+ sum);
    }
}
