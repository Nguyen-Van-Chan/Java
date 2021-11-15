import javax.swing.*;
import java.awt.*;

public class BT1flowlayout extends JFrame {
    public BT1flowlayout (String tieude)//tạo contractor
    {
        super(tieude);
        addControls();
    }
    public void showWindow()
    {
        this.setSize(600,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void addControls() {
        Container con = getContentPane();//lớp chứa cửa sổ
//tạo 1 JPanel:
        JPanel pnFlowLayout = new JPanel();
        pnFlowLayout.setLayout(new FlowLayout());
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        JButton btn6 = new JButton("Button 6");
        JButton btn7 = new JButton("Button 7");
        JButton btn8 = new JButton("Button 8");
        JButton btn9 = new JButton("Button 9");
        JButton btn10 = new JButton("Button 10");
        JButton btn11 = new JButton("Button 11");
        JButton btn12 = new JButton("Button 12");
        JButton btn13 = new JButton("Button 13");
        JButton btn14 = new JButton("Button 14");
        JButton btn15 = new JButton("Button 15");
        JButton btn16 = new JButton("Button 16");
        JButton btn17 = new JButton("Button 17");
        JButton btn18 = new JButton("Button 18");
        JButton btn19 = new JButton("Button 19");
        JButton btn20 = new JButton("Button 20");
        pnFlowLayout.add(btn1);//thêm các button và panel FlowLayout
        pnFlowLayout.add(btn2);
        pnFlowLayout.add(btn3);
        pnFlowLayout.add(btn4);
        pnFlowLayout.add(btn5);
        pnFlowLayout.add(btn6);
        pnFlowLayout.add(btn7);
        pnFlowLayout.add(btn8);
        pnFlowLayout.add(btn9);
        pnFlowLayout.add(btn10);
        pnFlowLayout.add(btn11);
        pnFlowLayout.add(btn12);
        pnFlowLayout.add(btn13);
        pnFlowLayout.add(btn14);
        pnFlowLayout.add(btn15);
        pnFlowLayout.add(btn16);
        pnFlowLayout.add(btn17);
        pnFlowLayout.add(btn18);
        pnFlowLayout.add(btn19);
        pnFlowLayout.add(btn20);
        con.add(pnFlowLayout);//đưa pnflowlayout vào lớp chứa cửa sổ
    }

    public static void main(String[] args) {
        BT1flowlayout bt = new BT1flowlayout("bt1");
        bt.showWindow();
    }
}
