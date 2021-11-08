import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

public class Jcheckbox {
    public static void main(String[] args) {
// Create and set up a frame window
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Simple checkbox demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Define the panel to hold the checkbox
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JLabel lblMsg = new JLabel("", JLabel.CENTER);
        // Create checkbox with different constructors
        JCheckBox checkbox1 = new JCheckBox("Táo", true);
        JCheckBox checkbox2 = new JCheckBox("Đào");
        JCheckBox checkbox3 = new JCheckBox("Xoài", true);
        JCheckBox checkbox4 = new JCheckBox("Cam");
        JCheckBox checkbox5 = new JCheckBox("Mận", true);
        // Disable checkbox5
        checkbox5.setEnabled(false);
        // Thêm phím tắt Mneumonic Alt + C chọn Cam
        checkbox4.setMnemonic(KeyEvent.VK_C);
        //Thêm mô tả cho checkbox 4
        checkbox4.setToolTipText("Đây là Cam");
        // Set up the title for the panel
        panel.setBorder(BorderFactory.createTitledBorder("Fruits"));
        panel1.setBorder(BorderFactory.createTitledBorder("Output"));
        // Add the checkbox into the panels
        panel.add(checkbox1);
        panel.add(checkbox2);
        panel.add(checkbox3);
        panel.add(checkbox4);
        panel.add(checkbox5);
        panel1.add(lblMsg);
        // Add the panel into the frame
        frame.setLayout(new GridLayout(2, 2));
        frame.add(panel);
        frame.add(panel1);
        // Set the window to be visible as the default to be false
        frame.pack();
        frame.setVisible(true);
        //
        checkbox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1) {
                    lblMsg.setText("Đào được chọn");
                } else {
                    lblMsg.setText("Đào bị bỏ chọn");
                }
            }
        });
    }
}
