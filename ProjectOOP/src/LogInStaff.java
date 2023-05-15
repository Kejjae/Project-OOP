import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class LogInStaff  implements FocusListener, ActionListener{
    private JFrame jframe;
    private JPanel p;
    private JTextField user;
    private JPasswordField pass;
    private JLabel l;
    private JButton btn;
   
    public LogInStaff(){
        
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
        jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jframe.setVisible(true);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(true);
        
        // Login Label
        l.setBounds(175,45,70,15);
        
        // Username
        user.setBounds(100, 85, 193, 28);
        user.addFocusListener(new FocusListener(){
            
        @Override
        public void focusGained(FocusEvent fe){
            if (user.getText().equals("Username")) {
                if (fe.getSource().equals(user)){
                user.setText("");
                user.setForeground(Color.BLACK);
                }
            }
        }

            @Override
            public void focusLost(FocusEvent e) {
            if (user.getText().equals("")){
                user.setText("Username");
                user.setForeground(new Color(153, 153, 153));
            }
            }
        });
   
        user.setForeground(new Color(153, 153, 153));
        p.add(l);
        p.add(user);
        
        // Password
        pass.setBounds(100, 125, 193, 28);
        pass.setForeground(new Color(153, 153, 153));
        pass.setEchoChar((char) 0);
        pass.addFocusListener(new FocusListener(){
                 @Override
        public void focusGained(FocusEvent fe){
            if (pass.getText().equals("Password")){
                if (fe.getSource().equals(pass)){
                pass.setText("");
                pass.setEchoChar('*');
                pass.setForeground(Color.BLACK);
                }
            }
        }

            @Override
            public void focusLost(FocusEvent e) {
            if (pass.getText().equals("")){
                pass.setText("Password");
                pass.setEchoChar((char) 0);
                pass.setForeground(new Color(153, 153, 153));
            }
            }
        });
        p.add(pass);
        
        // Button
        btn.setBounds(150, 170, 90, 25);
        btn.addActionListener(new ActionListener(){
            
                @Override
                
                    public void actionPerformed(ActionEvent e) {
                        if(user.getText().equals("Dream") && (pass.getText().equals("65070008"))){
                            jframe.setVisible(false);
                            Staff main = new Staff();
                            try {
                                 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                             } catch (Exception ex) {
                                    ex.printStackTrace();
                             }
                            SwingUtilities.invokeLater(() -> {new Staff();});
                            
                        }else if (user.getText().equals("Kew") && (pass.getText().equals("65070026"))){
                            jframe.setVisible(false);
                            Staff main = new Staff();
                            try {
                                 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                             } catch (Exception ex) {
                                    ex.printStackTrace();
                             }
                            SwingUtilities.invokeLater(() -> {new Staff();});
                        
                       }else if (user.getText().equals("Lotus") && (pass.getText().equals("65070050"))){
                            jframe.setVisible(false);
                            Staff main = new Staff();
                            try {
                                 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                             } catch (Exception ex) {
                                    ex.printStackTrace();
                             }
                            SwingUtilities.invokeLater(() -> {new Staff();});
                        
                       }else if (user.getText().equals("Bell") && (pass.getText().equals("65070086"))){
                            jframe.setVisible(false);
                            Staff main = new Staff();
                            try {
                                 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                             } catch (Exception ex) {
                                    ex.printStackTrace();
                             }
                            SwingUtilities.invokeLater(() -> {new Staff();});
                        
                       }else if (user.getText().equals("Park") && (pass.getText().equals("65070102"))){
                            jframe.setVisible(false);
                            Staff main = new Staff();
                            try {
                                 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                             } catch (Exception ex) {
                                    ex.printStackTrace();
                             }
                            SwingUtilities.invokeLater(() -> {new Staff();});
                        
                       }else{
                            JOptionPane.showMessageDialog(jframe, "Invalid username or password");
                        }
    }
    });
        p.add(btn);
        
        
        
        
    }
        @Override
        public void focusGained(FocusEvent fe){}
        @Override
        public void focusLost(FocusEvent fe){}
 

    @Override
    public void actionPerformed(ActionEvent e) {}

}
