package BTVN4va5;
// Đã chữa bài
import java.security.KeyStore;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        for (int i = 1000000; i <=999999999 ; i++) {
            if (include068(i) && Sum10(i) && reversedNumber(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean include068(int n){
        while (n > 0){
            int temp = n % 10;
            if (temp !=6 && temp != 8 && temp != 0){
                return false;
            }
            n /= 10;
        }
        return true;
    }

    private static boolean Sum10(int n){
        int S = 0;
        while (n > 0){
            S += n % 10;
            n /= 10;
        }
        return S % 10 == 0;
    }

    public static boolean reversedNumber(int n){
        int m = n;
        int soDao = 0;
        while (m > 0){
            soDao = soDao * 10 + m % 10;
            m /= 10;
        }
        return soDao == n;
    }
}

