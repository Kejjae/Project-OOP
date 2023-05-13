
package insert;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.util.Date;
import javax.swing.table.*; 


public class Insert extends JPanel {
    private JPanel insert1, insert2, insert3, insert4, insert5, button;
    private JLabel nameb, isbn, genres, number;
    private JTextField bookname, typeisbn, amount;
    private JComboBox genre;
    private String[] genreoptions = {"Novel", "Fantasy", "Tale", "Literature", "Horror"};
    private JButton insert;

    public Insert(){
            setLayout(new GridLayout(5, 1));
            //insert = new JButton("Insert");
           // button = new JPanel();
            //button.add(insert);
                
            insert1 = new JPanel();
            insert2 = new JPanel();
            insert3 = new JPanel();
            insert4 = new JPanel();
            insert5 = new JPanel();
            insert1.setLayout(new GridLayout(1, 2));
            insert2.setLayout(new GridLayout(1, 2));
            insert3.setLayout(new GridLayout(1, 2));
            insert4.setLayout(new GridLayout(1, 2));
            nameb = new JLabel("   Book Name:");
            isbn = new JLabel("   ISBN:");
            genres = new JLabel("   Genre:");
            number = new JLabel("   Total:");
            bookname = new JTextField(); 
            typeisbn = new JTextField();
            amount = new JTextField();
            genre = new JComboBox(genreoptions);
            insert1.add(nameb);  insert1.add(bookname);
            insert2.add(isbn);  insert2.add(typeisbn);
            insert3.add(genres); insert3.add(genre);
            insert4.add(number); insert4.add(amount);
            
       
            
            add(insert1);
            add(insert2);
            add(insert3);
            add(insert4);
            //add(button);
            
   }
   public JTextField getBookName(){
       return bookname;
   }
   public void setBookName(JTextField bookname){
       this.bookname = bookname;
   }
   public JTextField getTypeIsbn(){
       return typeisbn;
   }
   public void setTypeIsbn(JTextField typeisbn){
       this.typeisbn = typeisbn;
   }
   public JComboBox getGenre(){
       return genre;
   }
   public String[] getGenreOptions() {
       return genreoptions;
   }
   public JTextField getAmount(){
       return amount;
   }
   public void setAmount(JTextField amount){
       this.amount = amount;
   }
    public static void main(String[] args) {
        new Insert();
    }

    }


