import javax.swing.*;

public class JpanelEx1 extends JFrame {
    public JpanelEx1() {
        super("Ví dụ JPanel");
        JPanel jp = new JPanel();
        JLabel jl = new JLabel("Username");
        jp.add(jl);
        JTextField jf = new JTextField(20);
        jp.add(jf);
        add(jp);
        setSize(300,300);
        setVisible(true);
    }


    public static void main(String[] args) {
        new JpanelEx1();
    }
}
