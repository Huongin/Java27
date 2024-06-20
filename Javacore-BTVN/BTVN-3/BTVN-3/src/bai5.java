import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {
        System.out.print("Nhap so n: ");
        int n = new Scanner(System.in).nextInt();

        int daoSo = 0; // Đảo số của n
        int soDoichieu = n;

        while (n>0){
            daoSo = daoSo * 10 + n % 10;
            n /= 10;
            System.out.println(daoSo);
        }
        if (soDoichieu==daoSo) {
            System.out.println(soDoichieu + "la so thuan nghich");
        } else {
            System.out.println(soDoichieu + "Khong phai la so thuan nghich");
        }
    }
}
