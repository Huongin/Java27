package BTVN4va5;

import java.util.Arrays;
import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
        System.out.print("Nhập các số tự nhiên n = ");
        int n = new Scanner(System.in).nextInt();
        inSoChanLe(n);
    }
    public static void inSoChanLe(int n) {
        System.out.print("Dãy số chẵn < n là: ");
        for (int i = 0; i < n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Dãy số lẻ < n là: ");
        for (int i = 1; i < n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
