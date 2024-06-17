package BTVN2;

import java.util.Scanner;

public class giaiphuongtrinhbac2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so a (a khac 0): ");
        float a = input.nextFloat();

        System.out.println("Nhap so b: ");
        float b = input.nextFloat();

        System.out.println("Nhap so c: ");
        float c = input.nextFloat();

        Double delta = Double.valueOf(b * b - 4 * a * c);
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 *a );

        System.out.println("Nghiem x1: " + x1);
        System.out.println("Nghiem x2 " + x2);

    }
}
