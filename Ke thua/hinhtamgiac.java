package Model;

import java.util.Scanner;

public class hinhtamgiac extends Hinh {

    public float getArea() {
        return 1/2*canhhuyen*chieucao;
    }


    public hinhtamgiac(float canhhuyen, float chieucao) {
        this.canhhuyen = canhhuyen;
        this.chieucao = chieucao;
    }

    private static float canhhuyen;
    private static float chieucao;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chiều dài cạnh: ");
        canhhuyen = scanner.nextFloat();
        System.out.println("nhập vào chiều dài cạnh: ");
        chieucao = scanner.nextFloat();
        hinhtamgiac htg = new hinhtamgiac(canhhuyen,chieucao);
        System.out.println("diện tích hình chữ nhật là: "+htg.getArea());
    }
}
