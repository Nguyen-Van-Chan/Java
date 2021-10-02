package Model;

import java.util.Scanner;

public class BT2 {

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getSosanpham() {
        return sosanpham;
    }

    public void setSosanpham(int sosanpham) {
        this.sosanpham = sosanpham;
    }

    public BT2() {

    }

    private String ten;
    private String ma;
    private int sosanpham;


   public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã nhân viên: ");
        ma = sc.nextLine();
        System.out.print("Tên nhân viên: ");
        ten = sc.nextLine();
        System.out.print("Số sản phầm của nhân viên: ");
        sosanpham = sc.nextInt();

    }

   public void printInfo() {
        System.out.println("Thông tin chi tiết nhân viên:");
        System.out.println("Mã nhân viên: " + ma);
        System.out.println("Tên nhân viên: " + ten);
        System.out.println("Số sản phẩm của nhân viên: " + sosanpham);
        System.out.println("Lương nhân viên: " + getluong());

    }

    double getluong() {
        double luong;
        if (sosanpham < 200)
            luong = sosanpham * 0.5;
        else if (sosanpham >= 200 && sosanpham < 400)
            luong = sosanpham * 0.55;
        else if (sosanpham >= 400 && sosanpham < 600)
            luong = sosanpham * 0.6;
        else if (sosanpham > 600)
            luong = sosanpham * 0.65;
        else
            luong = 0;
        return luong;
    }
}













