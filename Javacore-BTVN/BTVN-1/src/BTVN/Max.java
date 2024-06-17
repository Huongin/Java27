package BTVN;

public class Max {
    public static void main(String[] args) {
      int x1 = 6, x2 = 7;
      double x3 = 10.6, x4 = 15.5;

      double max1 = Math.max(x1,x2);
      double max2 =  Math.max(x3,x4);
      double max = Math.max(max1,max2);

      System.out.println("So lon nhat trong 4 so Max = " + max);

    }
}
