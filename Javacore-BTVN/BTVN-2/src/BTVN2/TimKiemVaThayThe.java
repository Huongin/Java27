package BTVN2;

public class TimKiemVaThayThe {
    public static void main(String[] args) {

         String S = " Cho du ban khong sinh ra va lon len o Nhat, nhung neu trot yeu nen van hoa nay ban cung co the thiet ke can nha cua minh theo phong cach Nhat";

         //Tìm vị trí xuất hiện đầu tiên
         System.out.println(S.indexOf("Cho"));

         //Tìm vị trí xuất hiện cuối cùng
         System.out.println(S.lastIndexOf("Nhat"));

         //Thay thế xâu ký tự
        String S1 = "Nhat";
        String S2 = "Viet Nam";
        String replace = S.replace(S1,S2);
        System.out.println(replace);
    }
}
