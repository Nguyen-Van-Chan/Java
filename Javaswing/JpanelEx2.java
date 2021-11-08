import javax.swing.*;
import java.awt.*;

public class JpanelEx2 extends JFrame {
    public JpanelEx2(String title) {
        super(title);
        addControls();
    }
    public void showWindow() {
        this.setSize(500, 400);//kích thước của cửa sổ
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//bấm dấu x đóngchương trình
        this.setLocationRelativeTo(null);//cho cửa sổ nằm giữa màn hình
        this.setVisible(true);//hiển thị lên màn hình desktop
        //this.setResizable(false);//không cho phép thay đổi kích thước cửa sổ
    }
    private void addControls() {
        {//JPanel là lớp chứa các control
            //lấy lớp chứa cửa sổ bằng lệnh getContentPane
            //Container con = getContentPane();
            JPanel pn = new JPanel();//tạo 1 lớp chứa control
            pn.setBackground(Color.GRAY);
            //con.add(pn);//đưa panel lên giao diện
            JButton btn = new JButton("Đây là nút lệnh");//đưa button vào cửasổ
            pn.add(btn);
            add(pn);

            JLabel jl = new JLabel("Username");
            pn.add(jl);
            JTextField jf = new JTextField(20);
            pn.add(jf);
            setSize(300,300);
            setVisible(true);
        }
    }
    public static void main(String[] args) {
        JpanelEx2 cuaso = new JpanelEx2("Cửa sổ");
        cuaso.showWindow();
    }
}
