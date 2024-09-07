public class Student implements Comparable<Student> {
    public String fullName;
    public int age;
    public int GPA;

    public Student(String fullName, int age, int GPA) {
        this.fullName = fullName;
        this.age = age;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", GPA=" + GPA +
                '}';
    }

    @Override
    //#3 Sắp xếp theo tên. (Ví dụ là Hoàng Văn A, thì chỉ xét A thôi)
    public int compareTo(Student o) {
        String thisLastName = this.fullName.substring(this.fullName.lastIndexOf(" ")+1);
        String otherLastName = o.fullName.substring(o.fullName.lastIndexOf(" ")+1);
        int nameCompare = thisLastName.compareTo(otherLastName);
        return nameCompare;
    }

    //#1 Sắp xếp theo FullName, nếu trùng thì sắp xếp theo tuổi giảm dần
//    public int compareTo(Student o) {
//        // So sánh theo FullName tăng dần
//        int nameCompare = this.fullName.compareTo(o.fullName);
//        if (nameCompare != 0){
//            return nameCompare;
//        }
//        return o.age - this.age;
//    }

    //#2  Sắp xếp học sinh theo tuổi tăng dần, nếu bằng tuổi thì xếp theo GPA giảm dần
//    public int compareTo(Student o) {
//        if (this.age != o.age){
//            return o.age - this.age;
//        }
//        return o.GPA - this.GPA;
//    }
}
