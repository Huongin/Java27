import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student[] student = new Student[5];
        student[0] = new Student("Trần Huyền Trâm", 25, 3);
        student[1] = new Student("Lưu Thị Kim Huyền", 24, 4);
        student[2] = new Student("Trần Huyền Trâm", 20, 3);
        student[3] = new Student("Lưu Hoàng Yến", 24, 2);
        student[4] = new Student("Phạm Thị Bích Ngọc", 25, 1);

        Arrays.sort(student);

        for (Student s : student) {
            System.out.println(s);
        }
    }
}
