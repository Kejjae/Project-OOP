import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class Cashierr {
    private JFrame fr;
    private JPanel p;
    private JPanel p4, p5;
    private JLabel user, total, point;
    private JTextField id;
    private JButton pay, back;
    private JTextArea ta1, ta2, ta3;
    public Cashierr(){
        fr = new JFrame();
        p = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        user = new JLabel("User Password");
        total = new JLabel("Total");
        point = new JLabel("Use Point");
        id = new JTextField();
        pay = new JButton("PAY");
        back = new JButton("BACK");
        ta1 = new JTextArea();
        ta2 = new JTextArea();
        ta3 = new JTextArea();
        
        // Panel
        p.setLayout(null);
        
        // JFrame
        fr.add(p);
        fr.setSize(1280,720);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
        fr.setResizable(true);
        
        // User
        p.add(id);
        p.add(user);
        id.setEditable(false);
        id.setFont(new Font("supermarket", Font.BOLD, 50));
        user.setFont(new Font("supermarket", Font.BOLD, 50));
        id.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        
        // Cashier
        p.add(ta1);
        p.add(ta2);
        p.add(ta3);
        p.add(pay);
        ta1.setEditable(false);
        ta2.setEditable(false);
        ta3.setEditable(false);
        ta1.setFont(new Font("supermarket", Font.BOLD, 22));
        ta2.setFont(new Font("supermarket", Font.BOLD, 22));
        ta3.setFont(new Font("supermarket", Font.BOLD, 22));
        pay.setFont(new Font("supermarket", Font.BOLD, 22));
        ta1.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        ta2.setBorder(BorderFactory.createMatteBorder(2, 2, 0, 2, Color.black));
        ta3.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        
        // Button Back
        p.add(back);
        back.setFont(new Font("supermarket", Font.BOLD, 22));
        
        // Location
        user.setBounds(360, 35, 300, 70);
        id.setBounds(50, 30, 270, 70);
        ta1.setBounds(50, 115, 900, 470);
        ta2.setBounds(965, 115, 250, 325);
        ta3.setBounds(965, 440, 250, 90);
        pay.setBounds(965, 545, 250, 40);
        back.setBounds(50, 610, 100, 40);
    }
    public static void main(String[] args) {
        new Cashierr();
    }
}
