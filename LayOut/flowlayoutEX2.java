import javax.swing.*;
import java.awt.*;

public class flowlayoutEX2 extends JFrame {
    JPanel pnFlowLayout;
    public flowlayoutEX2(String title) {
        this.setTitle(title);
        addControls();
    }
    private void addControls() {
        pnFlowLayout = new JPanel();
        pnFlowLayout.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        pnFlowLayout.add(b1);
        pnFlowLayout.add(b2);
        pnFlowLayout.add(b3);
        pnFlowLayout.add(b4);
        pnFlowLayout.add(b5);
        add(pnFlowLayout);
    }
    public void showWindows() {
        // thiet lap flow layout la can chinh trai
        this.setSize(400, 250);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        flowlayoutEX2 viDuFlowLayout = new flowlayoutEX2("Ví dụ flowlayout");
        viDuFlowLayout.showWindows();
    }
}
