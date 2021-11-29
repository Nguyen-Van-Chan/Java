package model;

public class KhachHang {
    private String ma;
    private String ten;
    private String phone;
    private String email;

    public NhomKhachHang getNhom() {
        return nhom;
    }

    public void setNhom(NhomKhachHang nhom) {
        this.nhom = nhom;
    }

    private NhomKhachHang nhom;

    public KhachHang(String ma, String ten, String phone, String email) {
        this.ma = ma;
        this.ten = ten;
        this.phone = phone;
        this.email = email;
    }

    public KhachHang() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.ten;
    }

}
