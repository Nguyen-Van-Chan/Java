import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JradioButton extends Frame {
    JFrame jFrame;
    JRadioButton option1, option2, option3;
    ButtonGroup buttonGroup;

    public JradioButton() {
        super("Swing JRadioButton Demo");
        addControls();
        addEvents();
    }

    private void addControls() {
        jFrame = new JFrame("Swing JRadioButton Demo");
        option1 = new JRadioButton("Linux");
        option2 = new JRadioButton("Windows");
        option3 = new JRadioButton("Macintosh");
        // Gom nhom 3 JRadioButton vao ButtonGroup
        buttonGroup = new ButtonGroup();
        buttonGroup.add(option1);
        buttonGroup.add(option2);
        buttonGroup.add(option3);
        // Them 3 JRadioButton vao JFrame
        jFrame.add(option1);
        jFrame.add(option2);
        jFrame.add(option3);
    }
    public void showWindows() {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new FlowLayout());
        //jFrame.pack();
        jFrame.setSize(300,100);
        jFrame.setVisible(true);
    }


    private void addEvents() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == option1) {
                    JOptionPane.showMessageDialog(jFrame, "Linux duoc chon");
                }
                if (e.getSource() == option2) {
                    JOptionPane.showMessageDialog(jFrame, "Windows duoc chon");
                }
                if (e.getSource() == option3) {
                    JOptionPane.showMessageDialog(jFrame, "Macintosh duoc chon");
                }
            }
        };
        option1.addActionListener(listener);
        option2.addActionListener(listener);
        option3.addActionListener(listener);
    }

    public static void main(String[] args) {
        JradioButton jrd = new JradioButton();
        jrd.showWindows();
    }
}
