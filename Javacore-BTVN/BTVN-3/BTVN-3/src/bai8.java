import java.util.Scanner;

public class bai8 {

    public static void main(String[] args) {
            System.out.print("Nhap kich thuoc chieu ngang n: ");
            int n =new Scanner(System.in).nextInt();
            System.out.print("Nhap kich thuoc chieu rong m: ");
            int m =new Scanner(System.in).nextInt();

            for (int i = 0; i <m; i++) {
                for (int j = 0; j < n ; j++) {
                    if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
    }

}
