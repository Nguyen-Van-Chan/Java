import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class jTextAria extends Frame {
    JButton jButton;
    JLabel jLabel;
    JFrame jFrame;
    JTextArea jt;
    JPanel p;
    public jTextAria() {
        super("JTextArea Example");
        addControls();
        addEvents();
    }

    private void addEvents() {
        // Bat su kien button click
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText(jt.getText());
            }
        });

    }

    private void addControls() {
        jFrame = new JFrame("TextArea");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jLabel = new JLabel();
        jButton = new JButton("Submit");
        jt = new JTextArea(10, 10);
        p = new JPanel();
        p.add(jt);
        p.add(jButton);
        p.add(jLabel);
        jFrame.add(p);
    }
    public void showWindows() {
        setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setSize(300, 300);
        jFrame.setLocationRelativeTo(null);//căn giữa màn hình
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        jTextAria jta = new jTextAria();
        jta.showWindows();
    }
}
