package BTVN4va5;

public class bai18 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 9999999; i++) {
            if (prime(i) &&  reversedNumber(i) && khongchua4chuso(i)) {
                System.out.println(i);
            }
        }
    }

    //dieu kien la so nguyen to
    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // dieu kien la so thuan nghich
    public static boolean reversedNumber(int n) {
        int m = n;
        int soDao = 0;
        while (m > 0) {
            soDao = soDao * 10 + m % 10;
            m /= 10;
        }
        return soDao == n;
    }

    private static boolean khongchua4chuso(int n) {
        for (int i = 100000; i <= 9999999; i++) {
            if (n > 999 && n < 10000) {
                return false;
            }
        }
        return true;
    }
}


