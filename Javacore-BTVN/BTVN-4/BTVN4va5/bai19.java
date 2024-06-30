package BTVN4va5;

public class bai19 {
    public static void main(String[] args) {
        for (int i = 100000; i <=999999 ; i++) {
            if (Sum10(i) && reversedNumber(i)){
                System.out.println(i);
            }
        }
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


