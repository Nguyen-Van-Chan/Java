package Test;

import Model.nhanvien;

import java.util.Scanner;

public class testnhanvien {
    public static void main(String[] args) {
        nhanvien a = new nhanvien();
        a.setHoten("kh");
        a.setGioitinh("nam");
        a.setQuequan("bình thuận");
        a.setChucvu("quản lý");
        a.setLuong(7000000);
        System.out.println(a);
        System.out.print("Bạn hãy nhập tên: ");
        String ht = new Scanner(System.in).nextLine();
        System.out.print("Bạn hãy nhập giới tính: ");
        String gt = new Scanner(System.in).nextLine();
        System.out.print("Bạn hãy nhập quê quán: ");
        String queqq = new Scanner(System.in).nextLine();
        System.out.print("Bạn hãy nhập chức vụ: ");
        String cv = new Scanner(System.in).nextLine();
        System.out.print("Bạn hãy nhập lương: ");
        double lu = new Scanner(System.in).nextDouble();
        a.setHoten(ht);
        a.setGioitinh(gt);
        a.setQuequan(queqq);
        a.setChucvu(cv);
        a.setLuong(lu);
        System.out.println(a);



    }
}
