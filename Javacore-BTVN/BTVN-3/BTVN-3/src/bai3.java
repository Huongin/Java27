import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {

     // Tim uoc chung lon nhat cua a va b

        System.out.print("Nhap so a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Nhap so b: ");
        int b = new Scanner(System.in).nextInt();
        int sonhonhat = Math.min(a,b);

        int uocChungLonNhat = 1;
        for (int i = 1; i <= sonhonhat; i++) {
            if (a % i == 0 &&  b % i == 0) {
                uocChungLonNhat = i;
            }
        }
        System.out.println("Uoc chung lon nhat cua" + a + "va" + b + "la : "+ uocChungLonNhat);

        // Tim boi chung nho nhat

        int boichung = a * b; // Tich a va b la boi chung cua a va b


        for (int i = 1; i <= boichung ; i++) {
            if (i % a == 0 && i % b == 0){
                System.out.println(i);
                boichung = i;
            }
        }
        System.out.println("Boi chung nho nhat cua" + a + "va" + b + "la : "+ boichung);
    }
}
