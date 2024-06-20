import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {

        //Nhap so n va liet ke cac uoc so

        System.out.print("Nhap so n: ");
        int n = new Scanner(System.in).nextInt();

        int tongUocSo = 0;
        for (int i = 1; i <= n ; i++) {
            if ( n % i == 0){
                System.out.println(i);
                tongUocSo++;
            }
        }
        System.out.println("Tong so uoc so cua" + n  +  "la"  + tongUocSo);
        }
}
