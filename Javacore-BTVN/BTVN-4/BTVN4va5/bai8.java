package BTVN4va5;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        int[] mang = inputArray();
        demSoLanXuatHien(mang);
    }

    public static int[] inputArray() {
        System.out.print("Nhập vào số lượng phần tử: "); // Nhập số lượng phần tử của mảng
        int n = new Scanner(System.in).nextInt();

        int[] a = new int[n];// Khởi tạo mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("array [" + i + "]=");
            a [i] = new Scanner(System.in).nextInt();
        }
        return a;
    }

    public static void demSoLanXuatHien(int[] a) {
        int[]count= new int[1000];
        int soLanDemNhieuNhat = 0;
        int phanTuXuatHienNhieuNhat = a[0];

        for (int i = 0; i < a.length ; i++) {
            count[a[i]]++;
            if (count[a[i]] > soLanDemNhieuNhat) {
                soLanDemNhieuNhat = count[a[i]];
                phanTuXuatHienNhieuNhat = a[i];
            }
        }
        System.out.println("Phần tử có số lần xuất hiện nhiều nhất trong mảng: " + phanTuXuatHienNhieuNhat);
    }
}



