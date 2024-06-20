import java.util.Scanner;

public class bai13 {

    // Tinh tong cac so tu nhien khong lon hon n va chia het cho 7

    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        int n =new Scanner(System.in).nextInt();

        int Sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 7 ==0){
                System.out.println(i);
                Sum+=i;
            }

        }
        System.out.println("Tong cac so tu nhien khong lon hon" +  n + "la: " + Sum);

    }
}
