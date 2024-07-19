package src.constant;

public enum ProductType {
    DIENTU("Điện tử"),
    DIENLANH("Điện lạnh"),
    MAYTINH("Máy tính"),
    THIETBIVANPHONG("Thiết bị văn phòng");

    public String value;

    public String getValue() {
        return value;
    }

    ProductType(String value) {
        this.value = value;
    }
}
