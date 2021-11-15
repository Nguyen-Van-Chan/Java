import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EXCardLayout1 extends JFrame {
    public EXCardLayout1(String title) {
        super(title);
        addControl();
    }
    public void showWindows() {
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void addControl() {
        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth = new JPanel();
        JButton btnShowCard1 = new JButton("Show Card1");
        JButton btnShowCard2 = new JButton("Show Card2");
        pnNorth.add(btnShowCard1);
        pnNorth.add(btnShowCard2);
        pnBorder.add(pnNorth, BorderLayout.NORTH);

        final JPanel pnCenter = new JPanel();
        pnCenter.setLayout(new CardLayout());
        pnCenter.setBackground(Color.LIGHT_GRAY);

        final JPanel pnCard1 = new JPanel();
        pnCard1.setBackground(Color.LIGHT_GRAY);
        pnCard1.add(new JButton("Hello "));
        pnCard1.add(new JButton("I’m Card1"));

        final JPanel pnCard2 = new JPanel();
        pnCard2.setBackground(Color.PINK);
        pnCard2.add(new JButton("Hi "));
        pnCard2.add(new JCheckBox("CardLayout"));
        pnCard2.add(new JButton("I’m Card2"));
        pnCenter.add(pnCard1, "mycard1");
        pnCenter.add(pnCard2, "mycard2");
        pnBorder.add(pnCenter, BorderLayout.CENTER);
        this.add(pnBorder);
        btnShowCard1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                CardLayout cl = (CardLayout) pnCenter.getLayout();
                cl.show(pnCenter, "mycard1");
            }
        });
        btnShowCard2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                CardLayout cl = (CardLayout) pnCenter.getLayout();
                cl.show(pnCenter, "mycard2");
            }
        });
    }

    public static void main(String[] args) {
        EXCardLayout1 crl = new EXCardLayout1("vd card layout");
        crl.showWindows();
    }
}
