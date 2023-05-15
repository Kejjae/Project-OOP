
import GUI.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Main implements ActionListener{
    private JFrame frame;
    private JPanel panel;
    private JLabel name, type;
    private Button button;
    
    public Main(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        Font supermarket = null;
        
        panel.setLayout(null);
        frame.add(panel);
        panel.setBackground(Color.white);
        
        //Color
        Color blue = new Color(48, 69, 102);
        Color blackblue = new Color(36, 54, 83);
        
        //set name
        name = new JLabel("Welcom to yha luem khean!");
        name.setFont(supermarket);
        name.setFont(new Font("supermarket", Font.BOLD, 25));
        name.setBounds(100, 60, 380, 80);
        name.setForeground(blackblue);
        
        //set type
        type = new JLabel("Please select user type");
        type.setFont(supermarket);
        type.setBounds(170, 115, 200, 20);
        type.setForeground(Color.GRAY);
        
        //setcustomer button
        button = new Button();
        button.getCustomer().setFont(new Font("supermarket", Font.BOLD, 15));
        button.getCustomer().setBounds(130, 150, 100, 30);
        button.getCustomer().setBackground(blue);
        button.getCustomer().setForeground(Color.WHITE);
        
        
        //set staff button
        button.getStaff().setFont(new Font("supermarket", Font.BOLD, 15));
        button.getStaff().setBounds(240, 150, 100, 30);
        button.getStaff().setBackground(blue);
        button.getStaff().setForeground(Color.WHITE);
        
        
        //exit button
        
        button.getExit().setBounds(430, 1, 50, 50);
        button.getExit().setFont(new Font("supermarket", Font.BOLD, 15));
        button.getExit().setBackground(Color.WHITE);
        panel.add(button.getExit());
        
        //staff.setFont(font);
        panel.add(button.getCustomer());
        panel.add(button.getStaff());
        panel.add(name);
        panel.add(type);
        
        frame.setBounds(400, 200, 480, 280);
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //add action
        button.getCustomer().addActionListener(this);
        button.getStaff().addActionListener(this);
        button.getExit().addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(button.getCustomer())){
            new Login();
            //frame.dispose();
        }
        if(e.getSource().equals(button.getStaff())){
            
        }
        if(e.getSource().equals(button.getExit())){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        
        new Main();
    }
}
