package BTVN2;

import java.util.Scanner;

public class giaiphuongtrinhbac1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so a (a khac 0):   ");
        double a = input.nextDouble();

        System.out.println("Nhap so b:  ");
        double b = input.nextDouble();

        double x = -b / a;
        System.out.println("Phuong trinh bac nhat"+ a + "x + " + b + " = 0 co nghiem la" +  x);


    }
}
