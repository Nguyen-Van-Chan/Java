package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

public class HocJSplitPaneJTableUI extends JFrame {
    DefaultTableModel dtm;
    JTable tblSinhVien;
    JButton btnThemMoi,btnXoa;
    public HocJSplitPaneJTableUI (String title)
    {
        super(title);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnThemMoi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vector<String>vec=new Vector<String>();
                vec.add("mã");
                vec.add("tên");
                vec.add("địa chỉ");
                dtm.addRow(vec);
            }
        });
        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row=tblSinhVien.getSelectedRow();
                if(row==-1)return;
                int ret=JOptionPane.showConfirmDialog(null, "Bạn muốn xóa?","Xác nhận xóa",JOptionPane.YES_NO_OPTION);
                if(ret==JOptionPane.YES_OPTION)
                    dtm.removeRow(row);
            }
        });
        tblSinhVien.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row=tblSinhVien.getSelectedRow();
                if(row==-1)return;
                String ma=tblSinhVien.getValueAt(row, 0)+"";
                String ten=tblSinhVien.getValueAt(row, 1)+"";
                String diaChi=tblSinhVien.getValueAt(row, 2)+"";
                JOptionPane.showMessageDialog(null,
                        "Mã="+ma+"\nTên="+ten+"\nĐịa chỉ="+diaChi);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }

    public void showWindow()
    {
        this.setSize(700,500);//width x height
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    private void addControls() {
// TODO Auto-generated method stub
        Container con = getContentPane();
        JPanel pnLeft = new JPanel();
        JPanel pnRight = new JPanel();
        JSplitPane sp = new
                JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pnLeft, pnRight);
        sp.setOneTouchExpandable(true);
        con.add(sp);
        //tạo table sinh viên và các cột
        dtm=new DefaultTableModel();
        dtm.addColumn("Mã");
        dtm.addColumn("Tên");
        dtm.addColumn("Địa chỉ");
        tblSinhVien=new JTable(dtm);
        JScrollPane scTable=new
                JScrollPane(tblSinhVien,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnLeft.setLayout(new BorderLayout());
        pnLeft.add(scTable,BorderLayout.CENTER);
        pnLeft.setPreferredSize(new Dimension(300,0));
        //thêm dữ liệu vào bảng
        String row1[]={"SV1","Trang Tử Vân","Hàm Thuận Bắc"};
        dtm.addRow(row1);
        String row2[]={"SV2","Trang Tử Di","Hàm Thuận Nam"};
        dtm.addRow(row2);
        //dùng vector
        Vector<String> vec3=new Vector<String>();
        vec3.add("SV3");
        vec3.add("Trang Tử Long");
        vec3.add("Phan Thiết");
        dtm.addRow(vec3);
        //thêm nút
        JPanel pnButton=new JPanel();
        pnButton.setLayout(new FlowLayout());
        btnThemMoi=new JButton("Thêm mới");
        btnXoa=new JButton("Xóa");
        pnButton.add(btnThemMoi);
        pnButton.add(btnXoa);
        pnLeft.add(pnButton,BorderLayout.SOUTH);






    }
}
