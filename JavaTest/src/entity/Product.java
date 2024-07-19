package src.entity;

import src.constant.ProductType;

import java.util.Scanner;

public class Product {

    private static int AUTO_ID = 1000;

    private int id;
    private String productname;
    private ProductType producttype;
    private float giaban;
    private int soluong;

    public Product(){
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public Product(int id, String productname, ProductType producttype, float giaban, int soluong) {
        this.id = id;
        this.productname = productname;
        this.producttype = producttype;
        this.giaban = giaban;
        this.soluong = soluong;
    }

    public int getId() {
        return id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public ProductType getProducttype() {
        return producttype;
    }

    public void setProducttype(ProductType producttype) {
        this.producttype = producttype;
    }

    public float getGiaban() {
        return giaban;
    }

    public void setGiaban(float giaban) {
        this.giaban = giaban;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productname='" + productname + '\'' +
                ", producttype=" + producttype.getValue()+
                ", giaban=" + giaban +
                ", soluong=" + soluong +
                '}';
    }

    public void inputInfo(){
        System.out.println("Nhập tên mặt hàng: ");
        this.setProductname(new Scanner(System.in).nextLine());
        System.out.println("Nhập giá bán: ");
        this.setGiaban(new Scanner(System.in).nextFloat());
        System.out.println("Nhập số lượng bán: ");
        this.setSoluong(new Scanner(System.in).nextInt());
        System.out.println("Lựa chọn loại mặt hàng: ");
        System.out.println("1.Điện tử");
        System.out.println("2.Điện lạnh");
        System.out.println("3.Máy Tính");
        System.out.println("4.Thiết bị Văn Phòng");
        int productlist;
        while(true) {
            productlist = new Scanner(System.in).nextInt();
            if (productlist >= 1 && productlist <= 4) {
                break;
            }
            System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
            switch (productlist) {
                case 1:
                    this.setProducttype(ProductType.DIENTU);
                    break;
                case 2:
                    this.setProducttype(ProductType.DIENLANH);
                    break;
                case 3:
                    this.setProducttype(ProductType.MAYTINH);
                    break;
                case 4:
                    this.setProducttype(ProductType.THIETBIVANPHONG);
                    break;
            }
        }
    }
}
