import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JcomboBox {
    public static void main(String[] args) {
        // create a new frame
        JFrame f = new JFrame("Ví dụ JComboBox");
        // set layout of frame
        f.setLayout(new FlowLayout());
        // array of string contating cities
        String s1[] = {"Cam", "Đào", "Mận", "Xoài", "Chuối"};
        JLabel l = new JLabel("Chọn trái cây ");
        JLabel l1 = new JLabel("");
        l.setForeground(Color.red);
        l1.setForeground(Color.blue);
        // create checkbox
        JComboBox c1 = new JComboBox(s1);
        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == c1) {
                    l1.setText(c1.getSelectedItem() + " được chọn");
                }
            }
        });
        // create a new panel
        JPanel p = new JPanel();
        p.add(l);
        p.add(c1);
        p.add(l1);
        f.add(p);
        // set the size of frame
        f.setSize(350, 100);
        f.setVisible(true);
    }
}
