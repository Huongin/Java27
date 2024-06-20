import java.util.Scanner;

public class bai6 {

    public static void main(String[] args) {
        System.out.print("Nhap so nguyen n: ");
        int n = new Scanner(System.in).nextInt();

        int Sum = 0;
        while (n>0) {
            Sum += n % 10;
            n /= 10;
        }
        System.out.println("Tong cua cac chu so cua n: " + Sum);
    }
}
