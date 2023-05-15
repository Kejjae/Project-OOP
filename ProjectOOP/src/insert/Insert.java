
package insert;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.Date;



public class Insert extends JPanel implements Edit{
    private JPanel insert1, insert2, insert3, insert4, insert5;
    private JLabel nameb, isbn, genres, number, author;
    private JTextField bookname, typeisbn, amount, authorField;
    private JComboBox genre;
    private String[] genreoptions = {"Novel", "Fantasy", "Tale", "Literature", "Horror", "Phychology", "Self Improvement", "Manga"};
    

    public Insert(){
            setLayout(new GridLayout(5, 1));
                
            insert1 = new JPanel();
            insert2 = new JPanel();
            insert3 = new JPanel();
            insert4 = new JPanel();
            insert5 = new JPanel();
            insert1.setLayout(new GridLayout(1, 2));
            insert2.setLayout(new GridLayout(1, 2));
            insert3.setLayout(new GridLayout(1, 2));
            insert4.setLayout(new GridLayout(1, 2));
            insert5.setLayout(new GridLayout(1, 2));
            nameb = new JLabel("   Book Name:");
            isbn = new JLabel("   ISBN:");
            genres = new JLabel("   Genre:");
            author = new JLabel("   Author:");
            number = new JLabel("   Total:");
            bookname = new JTextField(); 
            typeisbn = new JTextField();
            authorField = new JTextField();
            amount = new JTextField();
            genre = new JComboBox(genreoptions);
            insert1.add(nameb);  insert1.add(bookname);
            insert2.add(isbn);  insert2.add(typeisbn);
            insert3.add(genres); insert3.add(genre);
            insert4.add(author); insert4.add(authorField);
            insert5.add(number); insert5.add(amount);
            
       
            
            add(insert1);
            add(insert2);
            add(insert3);
            add(insert4);
            add(insert5);
            
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
   public JTextField getAuthorField(){
       return authorField;
   }
   public void setAuthorField(JTextField authorField){
       this.authorField = authorField;
   }
    public static void main(String[] args) {
        new Insert();
    }




    }


