package Model;

import java.util.Scanner;

public class hinhchunhat extends Hinh {
    public float getArea(){
        return dai * rong;
    }

    private static float dai;
    private static float rong;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chiều dài cạnh: ");
        dai = scanner.nextFloat();
        System.out.println("nhập vào chiều dài cạnh: ");
        rong = scanner.nextFloat();
        hinhchunhat hcn = new hinhchunhat();
        System.out.println("diện tích hình chữ nhật là: "+hcn.getArea());
    }
}
