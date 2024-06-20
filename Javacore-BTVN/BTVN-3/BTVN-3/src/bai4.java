import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        System.out.print("Nhap n so nguyen to can liet ke : ");
        int n = new Scanner(System.in).nextInt();

        int count = 0;
        int i = 2;
        while (count<n) {
            if (i == 2 || i % 1 == 0 && i % i == 0 && i % 2 != 0) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
