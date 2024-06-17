package BTVN2;

public class TimKiemVaThayThe {
    public static void main(String[] args) {

         String S = "Cho dù bạn không sinh ra và lớn lên tại Nhật, nhưng nếu đã trót yêu nền văn hóa giàu bản sắc này, thì bạn hoàn toàn có thể thiết kế căn nhà của mình theo kiểu Nhật";

         //Tìm vị trí xuất hiện đầu tiên
         System.out.println(S.indexOf("Cho"));

         //Tìm vị trí xuất hiện cuối cùng
         System.out.println(S.lastIndexOf("t"));

         //Thay thế xâu ký tự
        String S1 = "Nhật";
        String S2 = "Việt Nam";
        String replace = S.replace(S1,S2);
        System.out.println(replace);
    }
}
