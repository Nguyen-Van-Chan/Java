package Model;

import java.util.Scanner;

public class hinhbinhhanh extends Hinh {
    public float getArea() {
        return canhday*chieucao;
    }

    private static float canhday;
    private static float chieucao;

    public hinhbinhhanh(float canhday, float chieucao) {
        this.canhday = canhday;
        this.chieucao = chieucao;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chiều dài cạnh: ");
        canhday = scanner.nextFloat();
        System.out.println("nhập vào chiều dài cạnh: ");
        chieucao = scanner.nextFloat();
        hinhbinhhanh hbh = new hinhbinhhanh(canhday,chieucao);
        System.out.println("diện tích hình chữ nhật là: "+hbh.getArea());
    }
}
