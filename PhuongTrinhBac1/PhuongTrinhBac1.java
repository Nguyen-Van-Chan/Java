package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhuongTrinhBac1 extends JFrame {
    JTextField txtHeSoa,txtHeSob,txtKetqua;
    JButton btnGiai,btnThoat,btnHelp;
    public PhuongTrinhBac1(String title)
    {
        super(title);
        addControls();
        addEvents();
    }
    private void addEvents() {
        {
            btnThoat.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    xulythoat();
                }
            });
        }
        btnGiai.addActionListener(eventGiai);
        btnHelp.addActionListener(new HelpEvent());
    }
    private void xulythoat(){
        int cont = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát chương trình?","",JOptionPane.YES_NO_OPTION);
        if (cont == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }
    class HelpEvent implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
            JOptionPane.showMessageDialog(null, "Mọi chi tiết xin liên hệ");
        }
    }

    ActionListener eventGiai=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
            xuLyGiaiPhuongTrinh();
        }
    };
    private void xuLyGiaiPhuongTrinh() {
        String hsa=txtHeSoa.getText();
        String hsb=txtHeSob.getText();
        double a=Double.parseDouble(hsa);
        double b=Double.parseDouble(hsb);
        if(a==0 && b==0)
        {
            txtKetqua.setText("Vô số nghiệm");
        }
        else if(a==0 &&b!=0)
        {
            txtKetqua.setText("Vô nghiệm");
        }
        else
        {
            double x=-b/a;
            txtKetqua.setText("x="+x);
        }
    }
    private void addControls() {
        Container con=getContentPane();
        JPanel pnMain=new JPanel();
        pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
        con.add(pnMain);

        JPanel pnTitle=new JPanel();
        pnTitle.setLayout(new FlowLayout());
        JLabel lblTieuDe=new JLabel("Giải phương trình bậc 1");

        lblTieuDe.setForeground(Color.BLUE);
        //tuỳ chỉnh kểu chữ và kích thước
        Font fontTieuDe=new Font("arial", Font.BOLD, 20);
        lblTieuDe.setFont(fontTieuDe);//thêm thuộc tính font
        pnTitle.add(lblTieuDe);//thêm nhãn tiêu đề
        pnMain.add(pnTitle);//thêm pn title vào main
        //panel hệ số a
        JPanel pnHeSoa=new JPanel();
        pnHeSoa.setLayout(new FlowLayout());
        JLabel lblHeSoa=new JLabel("Hệ số a:");
        txtHeSoa=new JTextField(15);
        pnHeSoa.add(lblHeSoa);
        pnHeSoa.add(txtHeSoa);
        pnMain.add(pnHeSoa);
        //panel hệ số B
        JPanel pnHeSob=new JPanel();
        pnHeSob.setLayout(new FlowLayout());
        JLabel lblHeSob=new JLabel("Hệ số b:");
        txtHeSob=new JTextField(15);
        pnHeSob.add(lblHeSob);
        pnHeSob.add(txtHeSob);
        pnMain.add(pnHeSob);
        //tạo panel pmbuton
        JPanel pnButton=new JPanel();
        pnButton.setLayout(new FlowLayout());
        btnGiai=new JButton("Giải");
        btnGiai.setIcon(new ImageIcon("Hinh/cal.png"));
        btnThoat=new JButton("Thoát");
        btnThoat.setIcon(new ImageIcon("Hinh/exit.png"));
        btnHelp=new JButton("Help");
        btnHelp.setIcon(new ImageIcon("Hinh/Help.png"));
        pnButton.add(btnGiai);
        pnButton.add(btnThoat);
        pnButton.add(btnHelp);
        pnMain.add(pnButton);
        //tạo panel két quả
        JPanel pnKetQua=new JPanel();
        pnKetQua.setLayout(new FlowLayout());
        JLabel lblKetQua=new JLabel("Kết quả :");
        txtKetqua=new JTextField(15);
        pnKetQua.add(lblKetQua);
        pnKetQua.add(txtKetqua);
        pnMain.add(pnKetQua);


    }

    public void showWindow()
    {
        this.setSize(400, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }




}
