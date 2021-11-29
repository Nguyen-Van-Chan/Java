package ui;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HocJTree extends JFrame {
    DefaultMutableTreeNode root=null;
    JTree tree;
    public HocJTree (String title)
    {
        super(title);
        addControls();
        addEvents();
    }

    private void addControls() {
        //tạo node gốc và node con
        Container con=getContentPane();
        con.setLayout(new BorderLayout());
        JPanel pnTree=new JPanel();
        pnTree.setLayout(new BorderLayout());
        root=new DefaultMutableTreeNode("UPT");
        tree=new JTree(root);
        DefaultMutableTreeNode nodekcntt=new DefaultMutableTreeNode("Khoa CNTT");
                DefaultMutableTreeNode nodektcnh=new DefaultMutableTreeNode("Khoa TCNT");
                DefaultMutableTreeNode nodeknn=new DefaultMutableTreeNode("Khoa Ngoại ngữ");
                DefaultMutableTreeNode nodenv1=new DefaultMutableTreeNode("Trang Tử Vân");
                DefaultMutableTreeNode nodenv2=new DefaultMutableTreeNode("Tran Tử Di");
                DefaultMutableTreeNode nodenv3=new DefaultMutableTreeNode("Trang Tử Long");
        //thêm node gốc và node con vào root
        root.add(nodekcntt);
        root.add(nodektcnh);
        root.add(nodeknn);
        nodekcntt.add(nodenv1);
        nodektcnh.add(nodenv2);
        nodeknn.add(nodenv3);
        tree.expandRow(0);
        //tạo jpanel
        JScrollPane sc=new
                JScrollPane(tree,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnTree.add(sc,BorderLayout.CENTER);
        pnTree.setPreferredSize(new Dimension(200,0));
        //Tạo panel pnRight, jsplitpane sp, gán cho pnTree và pnRight
        JPanel pnRight=new JPanel();
        JSplitPane sp=new
                JSplitPane(JSplitPane.HORIZONTAL_SPLIT,pnTree,pnRight);
        sp.setOneTouchExpandable(true);
        //thêm sp vàp container
        con.add(sp,BorderLayout.CENTER);

    }

    private void addEvents() {
        tree.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Object obj=tree.getLastSelectedPathComponent();
                DefaultMutableTreeNode
                        nodeSelected=(DefaultMutableTreeNode) obj;
                JOptionPane.showMessageDialog(null,
                        nodeSelected.getUserObject()+"");
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

}
