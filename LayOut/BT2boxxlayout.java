import javax.swing.*;
import java.awt.*;

public class BT2boxxlayout extends JFrame {
    public BT2boxxlayout(String title) {
        super(title);
        addControls();
    }
    public void showWindow()
    {
        this.setSize(800,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void addControls()
    {
        Container con = getContentPane();

        JPanel pnBox=new JPanel();
        JButton btn1=new JButton("button 0");
        JButton btn2=new JButton("button 1");
        JButton btn3=new JButton("button 2");
        pnBox.add(btn1);
        pnBox.add(btn2);
        pnBox.add(btn3);
        con.add(pnBox);

        JPanel pnBox2=new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox2, BoxLayout.Y_AXIS));
        JButton btn4=new JButton("button 0");
        JButton btn5=new JButton("button 1");
        JButton btn6=new JButton("button 2");
        pnBox2.add(btn4);
        pnBox2.add(btn5);
        pnBox2.add(btn6);
        con.add(pnBox2);

    }

    public static void main(String[] args) {
        BT2boxxlayout bt = new BT2boxxlayout("BT 2");
        bt.showWindow();
    }
}
