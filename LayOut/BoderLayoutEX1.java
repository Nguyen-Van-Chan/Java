import javax.swing.*;
import java.awt.*;

public class BoderLayoutEX1 extends JFrame {
    public BoderLayoutEX1(String tieude)
    {
        super(tieude);
        addControls();
    }
    public void showWindow()
    {
        this.setSize(600,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void addControls() {
        Container con = getContentPane();

        JPanel pnBorderLayout = new JPanel();
        pnBorderLayout.setLayout(new BorderLayout());

        JPanel pnNorth = new JPanel();
        pnNorth.setBackground(Color.BLUE);
        pnBorderLayout.add(pnNorth, BorderLayout.NORTH);
        pnNorth.setPreferredSize(new Dimension(0, 100));//width,height

        JPanel pnSouth = new JPanel();
        pnSouth.setBackground(Color.PINK);
        pnBorderLayout.add(pnSouth, BorderLayout.SOUTH);
        pnSouth.setPreferredSize(new Dimension(0, 100));

        JPanel pnEast = new JPanel();
        pnEast.setBackground(Color.RED);
        pnBorderLayout.add(pnEast, BorderLayout.EAST);
        pnEast.setPreferredSize(new Dimension(200, 0));

        JPanel pnWest = new JPanel();
        pnWest.setBackground(Color.GREEN);
        pnBorderLayout.add(pnWest, BorderLayout.WEST);
        pnWest.setPreferredSize(new Dimension(200, 0));

        JPanel pnCenter = new JPanel();
        pnCenter.setBackground(Color.CYAN);
        pnBorderLayout.add(pnCenter, BorderLayout.CENTER);
        con.add(pnBorderLayout);
    }

    public static void main(String[] args) {
        BoderLayoutEX1 bd = new BoderLayoutEX1("Học border layout");
        bd.showWindow();
    }
}
