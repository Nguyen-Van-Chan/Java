import javax.swing.*;
import java.awt.*;

public class JavaTexxtfiel extends JFrame {
    public JavaTexxtfiel() {
        super("Ví dụ JTextField");
        addControls();
    }

    private void addControls() {
        JLabel lblUserName = new JLabel("Username");
        JTextField txtUserName = new JTextField(20);
        JLabel lblPassword = new JLabel("Password");
        JPasswordField txtPassword = new JPasswordField(20);
        JButton btnLogin = new JButton("Login");
        JButton btnForgot = new JButton("Forgot password");
        add(lblUserName);
        add(txtUserName);
        add(lblPassword);
        add(txtPassword);
        add(btnLogin);
        add(btnForgot);

    }
    public void showWindows() {
        setLayout(new FlowLayout());
        setSize(350, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        JavaTexxtfiel jtexxt = new JavaTexxtfiel();
        jtexxt.showWindows();
    }
}
