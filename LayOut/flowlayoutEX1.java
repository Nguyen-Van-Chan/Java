import javax.swing.*;
import java.awt.*;

public class flowlayoutEX1 extends JFrame {
    public flowlayoutEX1 (String tieude)//tạo contractor
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
        JButton btn1 = new JButton("Demo button 1");
        JButton btn2 = new JButton("Demo button 2");
        JButton btn3 = new JButton("Demo button 3");
        JButton btn4 = new JButton("Demo button 4");
        pnFlowLayout.add(btn1);//thêm các button và panel FlowLayout
        pnFlowLayout.add(btn2);
        pnFlowLayout.add(btn3);
        pnFlowLayout.add(btn4);
        con.add(pnFlowLayout);//đưa pnflowlayout vào lớp chứa cửa sổ
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        flowlayoutEX1 ui = new flowlayoutEX1("Học FlowLayOut");
        ui.showWindow();

    }

}
