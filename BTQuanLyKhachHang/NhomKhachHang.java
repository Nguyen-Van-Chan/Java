package model;

import java.util.Collection;
import java.util.Vector;

public class NhomKhachHang {
    private String ma;
    private String ten;
    private Vector<KhachHang> khachHangs;


    public void themKhachHang(KhachHang kh)
    {
        //khách hàng đưa vào nhóm nào thì nhóm đó biết bao nhiêu khách hàng
       //và khách hàng biết nó thuộc nhóm nào
        this.khachHangs.add(kh);
        kh.setNhom(this);
    }

    public NhomKhachHang() {
        super();
        //bổ sung cấp phát bộ nhớ cho khách hàng
        this.khachHangs = new Vector<KhachHang>();
    }

    public NhomKhachHang(String ma, String ten) {
        super();
        this.ma = ma;
        this.ten = ten;
      //bổ sung cấp phát bộ nhớ cho khách hàng
        this.khachHangs = new Vector<KhachHang>();

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

    @Override
    public String toString() {
        return this.ten;
    }

    public Collection<KhachHang> getKhachHangs() {
        return khachHangs;
    }
}
