import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class login_staff implements FocusListener{
    private JFrame jframe;
    private JPanel p;
    private JTextField user;
    private JPasswordField pass;
    private JLabel l;
    private JButton btn;
    public login_staff(){
        //containers component
        jframe = new JFrame("Login Page");
        btn = new JButton("Login");
        p = new JPanel();
        l = new JLabel("LOGIN");
        user = new JTextField("Username");
        pass = new JPasswordField("Password");
        
        // JPanel
        p.setLayout(null);
        
        // JFrame
        jframe.add(p);
        jframe.setSize(400,300);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(true);
        
        // Login Label
        l.setBounds(175,45,70,15);
        
        // Username
        user.setBounds(100, 85, 193, 28);
        user.setForeground(new Color(153, 153, 153));
        p.add(l);
        p.add(user);
        
        // Password
        pass.setBounds(100, 125, 193, 28);
        pass.setForeground(new Color(153, 153, 153));
        pass.setEchoChar((char) 0);
        p.add(pass);
        
        // Button
        btn.setBounds(150, 170, 90, 25);
        p.add(btn);
        
        // FocusEvent
        user.addFocusListener(this);
        pass.addFocusListener(this);
    }
        @Override
        public void focusGained(FocusEvent fe){
            if (user.getText().equals("Username")) {
                if (fe.getSource().equals(user)){
                user.setText("");
                user.setForeground(Color.BLACK);
                }
            }
            if (pass.getText().equals("Password")){
                if (fe.getSource().equals(pass)){
                pass.setText("");
                pass.setEchoChar('*');
                pass.setForeground(Color.BLACK);
                }
            }
        }
        @Override
        public void focusLost(FocusEvent fe){
            if (user.getText().equals("")){
                user.setText("Username");
                user.setForeground(new Color(153, 153, 153));
            }
            if (pass.getText().equals("")){
                pass.setText("Password");
                pass.setEchoChar((char) 0);
                pass.setForeground(new Color(153, 153, 153));
            }
        }
    public static void main(String[] args) {
        new login_staff();
    }
}