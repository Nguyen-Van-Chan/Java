package ui;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChuongTrinhNhapThongTin extends JFrame {
    JTextField txtTen;
    JTextArea txtDiachi;
    JButton btnOK;
    JCheckBox chkDiBoi,chkDiXemPhim;
    JRadioButton radNam,radNu;
    ButtonGroup groupGioiTinh;
    public ChuongTrinhNhapThongTin(String title)
    {
        super(title);
        addControls();
        addEvents();
    }

    public void addEvents() {
           btnOK.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   xuLyLayThongTin();
               }
           });
    }
    private void xuLyLayThongTin(){
        String msg=txtTen.getText()+"\n";
        msg+=txtDiachi.getText()+"\n";
        String sothich="";
        if(chkDiBoi.isSelected())
            sothich+=chkDiBoi.getText()+"\n";
        if(chkDiXemPhim.isSelected())
            sothich+=chkDiXemPhim.getText()+"\n";
        msg+=sothich;
        String gioitinh="";
        if(radNam.isSelected())
            gioitinh=radNam.getText();
        else
            gioitinh=radNu.getText();
        msg+=gioitinh;
        JOptionPane.showMessageDialog(null,msg);
    }

    public void addControls() {
        Container con = getContentPane();
        JPanel pnMain = new JPanel();
        pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
        con.add(pnMain);
        //tạo jpanel thong tin
        JPanel pnThongTin = new JPanel();
        pnThongTin.setLayout(new BoxLayout(pnThongTin, BoxLayout.Y_AXIS));
        pnMain.add(pnThongTin);
        //tạo jpanel tên
        JPanel pnTen = new JPanel();
        pnTen.setLayout(new FlowLayout());
        pnThongTin.add(pnTen);
        //jlabel ten
        JLabel lblTen = new JLabel("Nhập tên:");
        pnTen.add(lblTen);
        txtTen = new JTextField(20);
        pnTen.add(txtTen);
        //tạo jpanel địa chỉ
        JPanel pnDiaChi = new JPanel();
        pnDiaChi.setLayout(new FlowLayout());
        pnThongTin.add(pnDiaChi);
        //label đị chỉ
        JLabel lblDiaChi = new JLabel("Địa chỉ");
        lblDiaChi.setPreferredSize(lblTen.getPreferredSize());
        pnDiaChi.add(lblDiaChi);

        txtDiachi = new JTextArea(5, 19);
        txtDiachi.setWrapStyleWord(true);
        txtDiachi.setLineWrap(true);
        JScrollPane sc = new JScrollPane(txtDiachi, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.
                HORIZONTAL_SCROLLBAR_ALWAYS);
        pnDiaChi.add(sc);
        //tạo nút ok
        JPanel pnOk=new JPanel();
        pnOk.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pnMain.add(pnOk);
        btnOK = new JButton("OK");
        pnOk.add(btnOK);
        //tạo line border
        Border borderThongTin=BorderFactory.createLineBorder(Color.BLUE);
        TitledBorder borderTitleThongTin=new
                TitledBorder(borderThongTin,"Thông tin:");
        borderTitleThongTin.setTitleJustification(TitledBorder.CENTER);
        borderTitleThongTin.setTitleColor(Color.RED);
        pnThongTin.setBorder(borderTitleThongTin);
        //tạo jpanel sở thích và giới tính
        JPanel pnSoThichVaGioiTinh=new JPanel();
        pnSoThichVaGioiTinh.setLayout(new GridLayout(1,2));
        pnMain.add(pnSoThichVaGioiTinh);
        //tạo jpanel sở thích
        JPanel pnSoThich=new JPanel();
        Border borderSoThich=BorderFactory.createLineBorder(Color.BLACK);
        TitledBorder titleBorderSoThich=new TitledBorder(borderSoThich,"Sở thích");
        pnSoThich.setBorder(titleBorderSoThich);
        pnSoThich.setLayout(new BoxLayout(pnSoThich, BoxLayout.Y_AXIS));
        pnSoThichVaGioiTinh.add(pnSoThich);
        chkDiBoi=new JCheckBox("Đi bơi");
        chkDiXemPhim=new JCheckBox("Đi xem phim");
        pnSoThich.add(chkDiBoi);
        pnSoThich.add(chkDiXemPhim);
        //jpanel giới tính
        JPanel pnGioiTinh=new JPanel();
        pnGioiTinh.setLayout(new BoxLayout(pnGioiTinh, BoxLayout.Y_AXIS));
        Border borderGioiTinh=BorderFactory.createLineBorder(Color.BLACK);
        TitledBorder titleBorderGioiTinh=new TitledBorder(borderGioiTinh,"Giới tính");
        pnGioiTinh.setBorder(titleBorderGioiTinh);
        pnSoThichVaGioiTinh.add(pnGioiTinh);
        radNam=new JRadioButton("Nam");
        radNu=new JRadioButton("Nữ");
        groupGioiTinh=new ButtonGroup();
        groupGioiTinh.add(radNam);
        groupGioiTinh.add(radNu);
        pnGioiTinh.add(radNam);
        pnGioiTinh.add(radNu);
    }
        public void showWindow()
    {
            this.setSize(400, 250);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setVisible(true);
    }


}
