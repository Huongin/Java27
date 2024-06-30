package BTVN4va5;

public class bai2 {

    public static void main(String[] args) {
        for (int i = 1000000; i <=9999999 ; i++) {
            if (prime(i) && allPrime(i) && prime(reversedNumber(i))){
                System.out.println(i);
            }
        }
    }

    public static boolean prime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n)  ; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return  true;
    }

    public static boolean allPrime(int n) {
        int soDu = 0;
        while (n > 0) {
            soDu = n % 10;
            if (soDu != 2 && soDu != 3 && soDu != 5 && soDu != 7) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static int reversedNumber(int n){
        int reversed = 0;
        while (n > 0){
        reversed = reversed * 10 + n % 10;
        n /= 10;
        }
        return reversed;
    }
}
