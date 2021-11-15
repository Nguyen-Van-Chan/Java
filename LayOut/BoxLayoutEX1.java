import javax.swing.*;
import java.awt.*;

public class BoxLayoutEX1 extends JFrame {
    public BoxLayoutEX1(String title) {
        super(title);
        addControls();
    }
    public void showWindow()
    {
        this.setSize(600,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void addControls()
    {
       /* Container con=getContentPane();*/
        JPanel pnBox=new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
        JButton btn1=new JButton("button 0");
        JButton btn2=new JButton("button 1");
        JButton btn3=new JButton("button 2");
        pnBox.add(btn1);
        pnBox.add(btn2);
        pnBox.add(btn3);
        add(pnBox);

        JPanel pnBox2=new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox2, BoxLayout.Y_AXIS));
        JButton btn4=new JButton("button 0");
        JButton btn5=new JButton("button 1");
        JButton btn6=new JButton("button 2");
        pnBox2.add(btn4);
        pnBox2.add(btn5);
        pnBox2.add(btn6);
        add(pnBox2);
/*
        JPanel pnBox2 =new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox2, BoxLayout.X_AXIS));
        JButton btn4=new JButton("Demo button 0");
        JButton btn5=new JButton("Demo button 1");
        JButton btn6=new JButton("Demo button 2");
        JButton btn7=new JButton("Demo button 3");
        JButton btn8=new JButton("Demo button 4");
        pnBox2.add(btn4);
        pnBox2.add(btn5);
        pnBox2.add(btn6);
        pnBox2.add(btn7);
        pnBox2.add(btn8);
        con.add(pnBox2);
        */
    }

    public static void main(String[] args) {
        BoxLayoutEX1 bxl = new BoxLayoutEX1("vd box layout");
        bxl.showWindow();
    }
}
