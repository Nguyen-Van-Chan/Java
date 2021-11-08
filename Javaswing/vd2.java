import javax.swing.*;

public class vd2 {
    public vd2() {
        JFrame f = new JFrame();// tạo thể hiện của JFrame
        JButton b = new JButton("click");// tạo thể hiện của JButton
        b.setBounds(130, 50, 100, 40);
        f.add(b);// thêm button vào JFrame
        f.setTitle("Vd 2");
        f.setSize(400, 200);// thiết lập kích thước cho của sổ
        f.setLayout(null);// không sử dụng trình quản lý bố cục
        f.setVisible(true);// hiển thị cửa sổ
    }

    public static void main(String[] args) {
            vd2 vd = new vd2();
    }
}
