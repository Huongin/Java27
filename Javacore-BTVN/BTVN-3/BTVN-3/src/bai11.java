import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class bai11 {

    public static void main(String[] args) {
        System.out.print("Nhap so n: ");
        int n = new Scanner(System.in).nextInt();

        int S = 0;
        int S1 = 0;
        int S2 = 0;

        for (int i = 0; i <n ; i++) {
            S += i;
            if (i % 2 ==0) {
                S2 += i;
            }else {
                S1 += i;
            }
        }
        System.out.println("Tong của các so tu nhien nho hon " + n + "la: " + S);
        System.out.println("Tong của các so tu nhien le nho hon " + n + "la: "+ S1);
        System.out.println("Tong của các so tu nhien chan nho hon " + n + "la: "+ S2);

    }
}
