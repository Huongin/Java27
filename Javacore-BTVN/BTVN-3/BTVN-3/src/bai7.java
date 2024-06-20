import java.util.Scanner;

public class bai7 {

    public static void main(String[] args) {
        System.out.print("Nhap kich thuoc chieu ngang n: ");
        int n =new Scanner(System.in).nextInt();
        System.out.print("Nhap kich thuoc chieu rong m: ");
        int m =new Scanner(System.in).nextInt();

        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
