package Login_and_Register;

import GUI.Button;
import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import main.cs_frame3_2;
import main.pn_bookshow;
public class Login implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JTextField user;
    private JPasswordField pass;
    private JLabel head, user_txt, pas_txt;
    private Font supermarket;
    private Button button;
    
    public static void main(String[] args) {
        new Login();
    }
    public Login(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        Font supermarket = null;
        
        //set layout
        panel.setLayout(null);
        frame.add(panel);
        panel.setBackground(Color.WHITE);
        /*frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setUndecorated(true);*/
        frame.setBounds(300, 80, 780, 580);
        frame.setUndecorated(true);  //no exit button!!
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Coloer
        Color grayw = new Color(240, 240, 240);
        Color blue = new Color(48, 69, 102);
        Color blackblue = new Color(36, 54, 83);
        panel.setBackground(grayw);
        
        //
        button = new Button();
        button.getExit().setBounds(730, 1, 50, 50);
        button.getExit().setFont(new Font("supermarket", Font.BOLD, 15));
        button.getExit().setBackground(grayw);
        panel.add(button.getExit());
        
        //
        //head = new JLabel("yha luem khean");
        head = new JLabel("YHA LUEM KHEAN");
        user = new JTextField();
        pass = new JPasswordField();
        user_txt = new JLabel("Username");
        pas_txt = new JLabel("Possword");
        
        //
        head.setFont(supermarket);
        head.setFont(new Font("supermarket", Font.BOLD, 37));
        head.setForeground(blackblue);
        panel.add(head); 
        
        user.setFont(supermarket);
        user.setBorder(null);
        user.setForeground(Color.GRAY);
        panel.add(user);
        
        pass.setFont(supermarket);
        pass.setBorder(null);
        pass.setForeground(Color.GRAY);
        panel.add(pass);
        
        
        user_txt.setFont(supermarket);
        user_txt.setForeground(Color.GRAY);
        panel.add(user_txt);
        
        pas_txt.setFont(supermarket);
        pas_txt.setForeground(Color.GRAY);
        panel.add(pas_txt);
        
        button.getLogin().setFont(supermarket);
        button.getLogin().setFont(new Font("supermarket", Font.BOLD, 17));
        button.getLogin().setForeground(Color.white);
        button.getLogin().setBackground(blue);
        panel.add(button.getLogin());
        
        button.getRegis().setFont(supermarket);
        button.getRegis().setFont(new Font("supermarket", Font.BOLD, 17));
        button.getRegis().setForeground(Color.white);
        button.getRegis().setBackground(blue);
        panel.add(button.getRegis());
        
        //Locations!!
        head.setBounds(270, 150, 300, 50);
        user.setBounds(200, 220, 380, 45);
        pass.setBounds(200, 290, 380, 45);
        button.getLogin().setBounds(250, 360, 130, 40);
        button.getRegis().setBounds(400, 360, 130, 40);
        user_txt.setBounds(210, 190, 380, 40);
        pas_txt.setBounds(210, 260, 280, 40);
        
        button.getLogin().addActionListener(this);
        button.getRegis().addActionListener(this);
        button.getExit().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(button.getLogin())){
            new cs_frame3_2().setVisible(true);
        }
        if(e.getSource().equals(button.getRegis())){
            new Register().setVisible(true);
        }
        if(e.getSource().equals(button.getExit())){
            System.exit(0);
        }
    }
    public JTextField getUser(){
        return user;
    }
    public void setUser(JTextField user){
        this.user = user;
    }
    public JPasswordField getPass(){
        return pass;
    }
    public void setPass(JPasswordField pass){
        this.pass = pass;
    }
}
