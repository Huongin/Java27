package src;

public enum CustomerStyle {
    CN("cá nhân"),
    TT("Tập thể"),
    DN("Doanh nghiệp");

   public String value;

    public String getValue() {
        return value;
    }

    CustomerStyle(String value) {
        this.value = value;
    }
}
