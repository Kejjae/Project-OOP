//pop up incorrect!
import javax.swing.*;
import java.awt.*;
public class Incorrect {
    private JFrame fr;
    private JLabel lb, lb2;
    private JButton ok;
    public Incorrect(){
        fr = new JFrame("Ya Luem Khuen");
        lb = new JLabel("                                  X Incorrect!");
        lb2 = new JLabel("                    The username or password");
        ok = new JButton("OK");
        fr.setLayout(new GridLayout(3, 1));
        fr.add(lb); 
        fr.add(lb2);
        fr.add(pk);
        fr.setBounds(600, 300, 300, 200);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new Incorrect();
    }
}
    
