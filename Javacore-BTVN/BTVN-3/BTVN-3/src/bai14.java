import java.util.Scanner;

public class bai14 {

    //cac so chan nho hon n và cac so le nho hon n

    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        int n =new Scanner(System.in).nextInt();


        for (int i = 0; i <n; i++) {
            if (i % 2 == 0){
              System.out.println("So chan la: " + i);
            } else {
                System.out.println("So le la: " + i);
            }
        }
    }
}
