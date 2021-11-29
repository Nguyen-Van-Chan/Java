package ui;

import model.KhachHang;
import model.NhomKhachHang;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

public class KhachHangUI extends JFrame {
    DefaultMutableTreeNode root=null;
    JTree treeNhom;
    DefaultTableModel dtm;
    JTable tblKhach;
    JTextField txtMa,txtTen,txtPhone,txtEmail;
    JButton btnLuu,btnXoa;
    ArrayList<NhomKhachHang> dsNhom;
    ArrayList<KhachHang>dsKhach;
    NhomKhachHang nhomSelected=null;
    public KhachHangUI(String title)
    {
        super(title);
        addControls();
        addEvents();
        fakeData();
    }
    private void fakeData() {
        dsNhom=new ArrayList<NhomKhachHang>();
        NhomKhachHang vip=new NhomKhachHang("n1", "Khách hàng VIP");
        NhomKhachHang tiemnang=new NhomKhachHang("n2", "Khách hàng Tiềm Năng");
                NhomKhachHang khotinh=new NhomKhachHang("n3", "Khách hàng Trung Thành");
        dsNhom.add(vip);dsNhom.add(tiemnang);dsNhom.add(khotinh);
        vip.getKhachHangs().add(new KhachHang("k1", "Trang Đăng Khải", "0999999999",
                "dangkhai@gmail.com"));
        vip.getKhachHangs().add(new KhachHang("k2", "Trang Tử Vân", "0976543210",
                "tuvan@gmail.com"));
        vip.getKhachHangs().add(new KhachHang("k3", "Trang Tử Di",
                "0954321091", "tudi@gmail.com"));
        vip.getKhachHangs().add(new KhachHang("k4", "Trang Tử Long", "0967891011",
                "tulong@gmail.com"));
        for(NhomKhachHang nhom : dsNhom)
        {
            DefaultMutableTreeNode nodeNhom=new
                    DefaultMutableTreeNode(nhom);
            root.add(nodeNhom);
            for(KhachHang khach : nhom.getKhachHangs())
            {
                DefaultMutableTreeNode nodeKhach=new
                        DefaultMutableTreeNode(khach);
                nodeNhom.add(nodeKhach);
            }
        }
        treeNhom.expandRow(0);
    }
    private void hienThiDanhSachKhachHangTheoNhom() {
        dtm.setRowCount(0);
        for(KhachHang kh: nhomSelected.getKhachHangs())
        {
            Vector<String> vec=new Vector<String>();
            vec.add(kh.getMa());
            vec.add(kh.getTen());
            vec.add(kh.getPhone());
            vec.add(kh.getEmail());
            dtm.addRow(vec);
        }
    }
    private void addEvents() {
        treeNhom.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                DefaultMutableTreeNode nodeSelected=
                        (DefaultMutableTreeNode)
                                treeNhom.getLastSelectedPathComponent();
                if(nodeSelected!=null && nodeSelected.getLevel()==1)
                {
                    nhomSelected=(NhomKhachHang)
                            nodeSelected.getUserObject();
                    hienThiDanhSachKhachHangTheoNhom();
                }

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

        btnLuu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                KhachHang kh=new KhachHang(
                        txtMa.getText(),
                        txtTen.getText(),
                        txtPhone.getText(),
                        txtEmail.getText());
                nhomSelected.themKhachHang(kh);
            }
        });
        //Khi click vào item trong bảng danh sách khách hàng thì
        // thông tin khách hàng đó sẽ được truyền xuống text field ở panel BottomOfRight.
        tblKhach.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int rowSelected=tblKhach.getSelectedRow();
                if(rowSelected==-1)return;
                String ma=tblKhach.getValueAt(rowSelected, 0)+"";
                String ten=tblKhach.getValueAt(rowSelected, 1)+"";
                String phone=tblKhach.getValueAt(rowSelected, 2)+"";
                String email=tblKhach.getValueAt(rowSelected, 3)+"";
                txtMa.setText(ma);
                txtTen.setText(ten);
                txtPhone.setText(phone);
                txtEmail.setText(email);

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
        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row=tblKhach.getSelectedRow();
                if(row==-1)return;
                int ret=JOptionPane.showConfirmDialog(null, "Bạn muốn xóa?","Xác nhận xóa",JOptionPane.YES_NO_OPTION);
                if(ret==JOptionPane.YES_OPTION)
                    dtm.removeRow(row);
            }
        });
    }

    private void addControls() {
        Container con=getContentPane();
        //panel trái
        JPanel pnLeft=new JPanel();
        pnLeft.setPreferredSize(new Dimension(300, 0));
        //panel phải, split pane để chia giao diện theo chiều dọc
        JPanel pnRight=new JPanel();
        JSplitPane sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,pnLeft,pnRight);
        con.setLayout(new BorderLayout());
        con.add(sp,BorderLayout.CENTER);
        //chia màn hình bên trái ra làm 2
        pnRight.setLayout(new BorderLayout());
        JPanel pnTopOfRight=new JPanel();
        pnTopOfRight.setPreferredSize(new Dimension(0,300));
        JPanel pnBottomOfRight=new JPanel();
        JSplitPane spRight=new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                pnTopOfRight,pnBottomOfRight);
        pnRight.add(spRight,BorderLayout.CENTER);
        //tạo cây
        pnLeft.setLayout(new BorderLayout());
        root=new DefaultMutableTreeNode("Đại học upt");//tạo node gốc
        treeNhom=new JTree(root);
        JScrollPane scTree=new JScrollPane(treeNhom,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);//Tạo scrollpane cho cây thư mục
        pnLeft.add(scTree,BorderLayout.CENTER);//đưa vào pnLeft
        //tạo bảng bên phải bằng topofright
        pnTopOfRight.setLayout(new BorderLayout());
        dtm=new DefaultTableModel();
        dtm.addColumn("Mã khách hàng");
        dtm.addColumn("Tên khách hàng");
        dtm.addColumn("Số điện thoại");
        dtm.addColumn("Thư điện tử");
        tblKhach=new JTable(dtm);
        JScrollPane scTable=new JScrollPane(tblKhach,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnTopOfRight.add(scTable,BorderLayout.CENTER);
        //Tạo label và textfield bên dưới phải
        pnBottomOfRight.setLayout(new BoxLayout(pnBottomOfRight, BoxLayout.Y_AXIS));
        JPanel pnMa=new JPanel();
        pnMa.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel lblMa=new JLabel("Mã khách hàng:");
        txtMa=new JTextField(20);
        pnMa.add(lblMa);
        pnMa.add(txtMa);
        pnBottomOfRight.add(pnMa);
        JPanel pnTen=new JPanel();
        pnTen.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel lblTen=new JLabel("Tên khách hàng:");
        txtTen=new JTextField(20);
        pnTen.add(lblTen);
        pnTen.add(txtTen);
        pnBottomOfRight.add(pnTen);
        JPanel pnPhone=new JPanel();
        pnPhone.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel lblPhone=new JLabel("Phone khách hàng:");
        txtPhone=new JTextField(20);
        pnPhone.add(lblPhone);
        pnPhone.add(txtPhone);
        pnBottomOfRight.add(pnPhone);
        JPanel pnEmail=new JPanel();
        pnEmail.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel lblEmail=new JLabel("Email khách hàng:");
        txtEmail=new JTextField(20);
        pnEmail.add(lblEmail);
        pnEmail.add(txtEmail);
        pnBottomOfRight.add(pnEmail);
        //tạo 2 nút lưu và xoá
        JPanel pnButton=new JPanel();
        pnButton.setLayout(new FlowLayout(FlowLayout.LEFT));
        btnLuu=new JButton("Lưu khách hàng");
        btnXoa=new JButton("Xóa khách hàng");
        pnButton.add(btnLuu);pnButton.add(btnXoa);
        pnBottomOfRight.add(pnButton);
        //căn đều label
        lblMa.setPreferredSize(lblPhone.getPreferredSize());
        lblTen.setPreferredSize(lblPhone.getPreferredSize());
        lblEmail.setPreferredSize(lblPhone.getPreferredSize());


    }
    public void showWindow()
    {
        this.setSize(700,500);//width x height
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }




}
