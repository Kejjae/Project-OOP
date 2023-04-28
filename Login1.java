import java.awt.*;
import javax.swing.*;
public class Login1 {
    private JFrame jframe;
    private JPanel jp1, jp2;
    private JButton cu, sf;
    public Login1(){
        //containers component
        JFrame jframe = new JFrame("Login");
        JPanel jpanel = new JPanel();
        cu = new JButton("customer");
        sf = new JButton("     staff     ");
        jp1 = new JPanel();
        jp2 = new JPanel();
        //set
        jframe.setLayout(new GridLayout(4, 0));
        jframe.add(new JPanel());
        jframe.add(jp1);
        jframe.add(jp2);
        
        jp1.add(cu); jp2.add(sf);
        
        // last 3 step
        jframe.setBounds(500, 200, 280, 280);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        new Login1();
    }
}

