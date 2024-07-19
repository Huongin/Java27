package src.entity;

import java.util.Arrays;

public class NhanVienBanHang {

    private Staff staff;
    private NhanVienBanHangDetail[] details;
    private int totalQuantity;

    public NhanVienBanHang(Staff staff, NhanVienBanHangDetail[] details) {
        this.staff = staff;
        this.details = details;
    }

    public NhanVienBanHang(Staff staff, NhanVienBanHangDetail[] details, int totalQuantity) {
        this.staff = staff;
        this.details = details;
        this.totalQuantity = totalQuantity;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public NhanVienBanHangDetail[] getDetails() {
        return details;
    }

    public void setDetails(NhanVienBanHangDetail[] details) {
        this.details = details;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    @Override
    public String toString() {
        return "NhanVienBanHang{" +
                "staff=" + staff +
                ", details=" + Arrays.toString(details) +
                ", totalQuantity=" + totalQuantity +
                '}';
    }
}
