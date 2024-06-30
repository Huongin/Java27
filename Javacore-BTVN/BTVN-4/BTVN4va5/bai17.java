package BTVN4va5;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class bai17 {
    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhap m: ");
        int m = new Scanner(System.in).nextInt();

        if (uocSoChung(n,m) == 1){
            System.out.println(m + " va " + n + " la so nguyen to cung nhau");
        }else {
            System.out.println(m + " va " + n + " khong phai la so nguyen cung nhau");
        }
    }

    public static int uocSoChung(int n,int m) {
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }
     public static boolean ketqua(int n , int m){
        return uocSoChung(n,m) == 1;
    }
}
