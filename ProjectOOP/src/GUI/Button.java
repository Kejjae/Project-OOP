
package GUI;

import javax.swing.JButton;
import java.awt.*;
import java.awt.Font;
import java.awt.FontFormatException;

public class Button {
    private JButton back, pay, save, exit, customer, staff,
                    login, regis;
    public Button(){
        Font supermarket = null;
        //button back
        back = new JButton("Back");
        back.setBorderPainted(false);
        back.setFont(supermarket);
        //back.setBorder(r);
        
        //button pay
        pay = new JButton("Check Out");
        pay.setBorderPainted(false);
        pay.setFont(supermarket);
        
        //button save
        save = new JButton("Save");
        save.setBorderPainted(false);
        pay.setFont(supermarket);
        
        //exit
        exit = new JButton("X");
        exit.setBorderPainted(false);
        exit.setFont(supermarket);
        
        //login
        login = new JButton("Login");
        login.setBorderPainted(false);
        
        //regis
        regis = new JButton("Register");
        regis.setBorderPainted(false);
        
        //customer
        customer = new JButton("CUSTOMER");
        customer.setBorderPainted(false);
        customer.setFont(supermarket);
        
        //staff
        staff = new JButton("STAFF");
        staff.setBorderPainted(false);
        staff.setFont(supermarket);
    }
    public JButton getBack(){
        return back;
    }
    public JButton getPay(){
        return pay;
    }
    public JButton getSave(){
        return save;
    }
    public JButton getExit(){
        return exit;
    }
    public JButton getLogin(){
        return login;
    }
    public JButton getRegis(){
        return regis;
    }
    public JButton getCustomer(){
        return customer;
    }
    public JButton getStaff(){
        return staff;
    }
}
