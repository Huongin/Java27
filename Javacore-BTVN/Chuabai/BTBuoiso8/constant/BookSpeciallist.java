package BTBuoiso8.constant;

public enum BookSpeciallist {
    KHTN("Khoa học tự nhiên"),
    VHNT("Văn học nghệ thuật"),
    DTVT("Điện tử viễn thông"),
    CNTT("Công nghê thông tin");

    private String value;

    public String getValue() {
        return value;
    }

    BookSpeciallist(String value){
        this.value = value;
    }
}
