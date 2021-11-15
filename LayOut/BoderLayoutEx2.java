import javax.swing.*;
import java.awt.*;

public class BoderLayoutEx2 extends JFrame {
    public BoderLayoutEx2(String title) {
        super(title);
        addControls();
    }
    private void addControls() {
        this.setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel l1 = new JLabel("Nhập vào một câu");
        JTextField jt = new JTextField(20);
        p1.add(l1);
        p1.add(jt);
        this.add(p1,BorderLayout.NORTH);
        JTextArea ta = new JTextArea(10, 10);
        this.add(ta, BorderLayout.CENTER);
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton b2 = new JButton("OK");
        p2.add(b2);
        this.add(p2,BorderLayout.SOUTH);
    }
    public void showWindows(){
        this.setSize(500,400);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        BoderLayoutEx2 bd = new BoderLayoutEx2("Ví dụ borderlayout");
        bd.showWindows();
    }
}
