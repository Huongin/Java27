import java.security.KeyStore;
import java.util.Scanner;

public class bai15 {
    
    // nhap n va kiem tra no co phai so nguyen to hay khong

    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        int n = new Scanner(System.in).nextInt();

        for (int i = 2; i <n-1 ; i++) {
            if (n % i == 0) {
                System.out.println(n + " khong la so nguyen to");
                break;
            } else {
                System.out.println(n + " la so nguyen to");
                break;
            }
        }
    }
}
