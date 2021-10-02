package Model;

public class nhanvien {
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String hoten;
    public String gioitinh;
    public String quequan;
    public String chucvu;
    private double luong;

    public nhanvien() {
    }

    public nhanvien(String hoten, String gioitinh, String quequan, String chucvu, double luong) {
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.quequan = quequan;
        this.chucvu = chucvu;
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "nhanvien{" +
                "hoten='" + hoten + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                ", quequan='" + quequan + '\'' +
                ", chucvu='" + chucvu + '\'' +
                ", luong=" + luong +
                '}';
    }
}
