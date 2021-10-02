package Model;

import java.util.Scanner;

public class nhanvien {
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getTongsogiolam() {
        return tongsogiolam;
    }

    public void setTongsogiolam(int tongsogiolam) {
        this.tongsogiolam = tongsogiolam;
    }

    private String ten;
    private String tuoi;
    private String diachi;
    private double luong;
    private int tongsogiolam;

    public nhanvien(String ten, String tuoi, String diachi, double luong, int tongsogiolam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.luong = luong;
        this.tongsogiolam = tongsogiolam;
    }

   public nhanvien () {
        ten = "Trần Thị Kim Anh";
        tuoi = "18";
        diachi = "Hà Nội";
        luong = 10000000;
        tongsogiolam = 200;
    }

   public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên nhân viên: ");
        ten = sc.nextLine();
        System.out.print("Tuổi nhân viên: ");
        tuoi = sc.nextLine();
        System.out.print("Địa chỉ nhân viên: ");
        diachi = sc.nextLine();
        System.out.print("Lương nhân viên: ");
        luong = sc.nextDouble();
        System.out.print("Tổng số giờ làm của nhân viên: ");
        tongsogiolam = sc.nextInt();
    }

   public void printtInfo() {
        System.out.println("Thông tin chi tiết nhân viên:");
        System.out.println("Tên nhân viên: " + ten);
        System.out.println("Tuổi nhân viên: " + tuoi);
        System.out.println("Địa chỉ nhân viên: " + diachi);
        System.out.println("Lương nhân viên: " + luong);
        System.out.println("Tổng số giờ làm của nhân viên: " + tongsogiolam);
        System.out.println("Thưởng: " + tinhThuong());
        System.out.println("Tổng lương: " + (luong + tinhThuong()));
    }

    double tinhThuong() {
        double thuong;
        if (tongsogiolam >= 200)
            thuong = luong * 0.2;
        else if (tongsogiolam >= 100 && tongsogiolam < 200)
            thuong = luong * 0.1;
        else
            thuong = 0;
        return thuong;

    }
}