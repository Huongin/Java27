import java.util.Scanner;

public class bai12 {

    // Kiem tra so chinh phuong

    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        int n =new Scanner(System.in).nextInt();
        System.out.print("Nhap m: ");
        int m =new Scanner(System.in).nextInt();


        if (m>=n){
            System.out.println("Nhap lai n va m sao cho (m<n)");
        } else {
            int S = 0;
            System.out.println("ac so chinh phuong có trong" + "["+ m +","+ n +"] la: ");
            for (int i = m;  i <= n ; i++) {
                double sqrti = (double) Math.sqrt(i);
                double lamTronGiam = (double) Math.floor(sqrti);
                if (sqrti - lamTronGiam ==0){
                    System.out.println(i);
                    S ++;
                }
            }
            System.out.println("Tong so cac so chinh phuong la: "+ S);
        }

    }
}
