package Model;

import java.util.Scanner;

public class sohoc {
    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public sohoc() {

    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public sohoc(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    private int number1;
    private int number2;

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số thứ nhất: ");
        number1 = sc.nextInt();
        System.out.print("Số thứ hai: ");
        number2 = sc.nextInt();
    }

    public void printInfo() {
        System.out.println("Thông tin chi tiết nhân viên:");
        System.out.println("Số thứ nhất là: " + number1);
        System.out.println("Số thứ hai là: " + number2);
        System.out.println("Các phép tính giữa hai số ");
        System.out.println(number1 + " + " + number2 + " = " + addition());
        System.out.println(number1 + " - " + number2 + " = " + subtract());
        System.out.println(number1 + " * " + number2 + " = " + multi());
        System.out.println(number1 + " / " + number2 + " = " + divition());

    }

    double addition() {
        double tong;
        tong = this.number1 + this.number2;
        return tong;
    }

    double subtract() {
        double hieu;
        hieu = this.number1 - this.number2;
        return hieu;
    }

    double multi() {
        double nhan;
        nhan = this.number1 * this.number2;
        return nhan;
    }

    double divition() {
        double chia;
        chia = this.number1 / this.number2;
        return chia;
    }

}
