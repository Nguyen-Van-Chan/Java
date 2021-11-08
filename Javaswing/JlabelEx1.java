import javax.swing.*;
import java.awt.*;

public class JlabelEx1 extends JFrame {
    public JlabelEx1() {
        super("JLabel Example");
        addControls();
    }
    public void showWindows() {
        setLayout(new FlowLayout());
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void addControls() {
        JLabel lbl = new JLabel("Xin chào upt");
        lbl.setVerticalAlignment(JLabel.TOP);
        lbl.setPreferredSize(new Dimension(100, 100));
        add(lbl);
        ImageIcon icon = new ImageIcon("res/java.png");
        JLabel lbl2 = new JLabel("Xin chào upt", icon, JLabel.CENTER);
        add(lbl2);
    }

    public static void main(String[] args) {
        JlabelEx1 jlb1 = new JlabelEx1();
        jlb1.showWindows();
    }
}
