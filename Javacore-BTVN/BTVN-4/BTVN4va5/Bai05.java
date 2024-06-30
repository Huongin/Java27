package BTVN4va5;

// Đã chữa bài
import java.util.Scanner;

public class Bai05 {

    public static void main(String[] args) {
        int[] mang = inputArray();
        if (checkMang(mang)) {
            System.out.println("Không có so lon thu 2");
            return;
        }
        int max = findMax(mang);
        findSecond(mang, max);
    }

    private static void findSecond(int[] mang, int max) {
        int second = Integer.MIN_VALUE;
        int location = -1;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] > second && mang[i] != max) {
                second = mang[i];
                location = i;
            }
        }
        System.out.println("Số lớn thứ 2 là " + second + " tại vị trí " + location);
    }

    public static int[] inputArray() {
        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        int n = new Scanner(System.in).nextInt();

        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập giá trị cho phần tử thứ " + i + ": ");
            myArray[i] = new Scanner(System.in).nextInt();
        }
        return myArray;
    }

    public static boolean checkMang(int[] myArray) {
        int count = 0;
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] == myArray[i + 1]) {
                count++;
            }
        }
        return count == myArray.length - 1;
    }

    public static int findMax(int[] myArray) {
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;

    }

}
