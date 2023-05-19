
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import javax.swing.*;
public class Success extends Books{
    private JTable managetable;
    private JPanel newpanel;
     private JFrame fr;
     private JScrollPane scrollPane;
    public ArrayList<Books> bookList(){
        ArrayList<Books> bookList = new ArrayList<>();
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             String url = "jdbc:mysql://localhost:3306/myshop?zeroDateTimeBehavior=CONVERT_TO_NULL";
             String Username = "root";
             String password = "bookshop";
             Connection con = DriverManager.getConnection(url, Username, password);
             String sql ="select * from books";
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql);
             Books books;
             while(rs.next()){
                 books = new Books(rs.getInt("no"), rs.getString("name"), rs.getString("code"), rs.getString("isbn"), rs.getString("author"), rs.getString("category"), rs.getInt("price"), rs.getString("status"), rs.getString("description"));
                 bookList.add(books);
             }
             
             
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        return bookList;

    }

}
