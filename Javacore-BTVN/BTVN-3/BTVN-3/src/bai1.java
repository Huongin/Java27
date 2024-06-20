import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {

        // Nhap 4 so nguyen a,b,c,d va tim so lon nhat

        System.out.print("Nhap so a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhap so b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Nhap so c: ");
        int c = new Scanner(System.in).nextInt();
        System.out.print("Nhap so d: ");
        int d = new Scanner(System.in).nextInt();

        System.out.println("So lon nhat la: " + Math.max(Math.max(a,b),Math.max(c,d)));
    }
}
