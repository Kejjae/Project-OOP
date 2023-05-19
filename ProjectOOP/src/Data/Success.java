
package Data;

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
public class Success {
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
                 books = new Books(rs.getInt("no"), rs.getString("name"), rs.getString("code"), rs.getString("isbn"), rs.getString("author"), rs.getString("category"), rs.getString("price"), rs.getString("status"));
                 bookList.add(books);
             }
             
             
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        return bookList;

    

        
    }
     public Success(){
         managetable = new JTable();
         scrollPane = new JScrollPane();
         scrollPane.setViewportView(managetable);
             ArrayList<Books> list = bookList();
             DefaultTableModel model = (DefaultTableModel)managetable.getModel();
             Object[] col = new Object[7];
             col[0] = "No";
             col[1] = "Name";
             col[2] = "Code";
             col[3] = "ISBN";
             col[4] = "Author";
             col[5] = "Category";
             col[6] = "Price";
     
             model.setColumnIdentifiers(col);
             
            Object[] row = new Object[7];
            for (int i = 0; i < list.size(); i++){
            row[0] = list.get(i).getNo();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getCode();
            row[3] = list.get(i).getIsbn();
            row[4] = list.get(i).getAuthor();
            row[5] = list.get(i).getCategory();
            row[6] = list.get(i).getPrice();
   
            model.addRow(row);
            }
         /*newpanel = new JPanel();
         newpanel.add(managetable);
         fr = new JFrame();
         fr.add(newpanel);
         fr.setVisible(true);*/
    }
    public static void main(String[] args) {
        new Success();
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
