package insert;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.Date;

public class Insert extends JPanel implements Edit {

    private JPanel insert1, insert2, insert3, insert4, insert5, newins, codepn, statuspn, dct;
    private JLabel nameb, isbn, genres, number, author, no, code, status, des;
    private JTextField bookname, typeisbn, amount, authorField, noone, bookcode, bookstatus, longdes;
    private JComboBox genre;
    private String[] genreoptions = {"Novel", "Fantasy", "Tale", "Literature", "Horror", "Phychology", "Self Improvement", "Manga"};

    public Insert() {
        setLayout(new GridLayout(9, 1));
        
        newins = new JPanel();
        insert1 = new JPanel();
        codepn = new JPanel();
        insert2 = new JPanel();
        insert3 = new JPanel();
        insert4 = new JPanel();
        insert5 = new JPanel();
        statuspn = new JPanel();
        dct = new JPanel();
        
        newins.setLayout(new GridLayout(1, 2));
        insert1.setLayout(new GridLayout(1, 2));
        codepn.setLayout(new GridLayout(1, 2));
        insert2.setLayout(new GridLayout(1, 2));
        insert3.setLayout(new GridLayout(1, 2));
        insert4.setLayout(new GridLayout(1, 2));
        insert5.setLayout(new GridLayout(1, 2));
        statuspn.setLayout(new GridLayout(1, 2));
        dct.setLayout(new GridLayout(1, 2));
        no = new JLabel("   No: ");
        nameb = new JLabel("   Book Name:");
        code = new JLabel("   Code: ");
        isbn = new JLabel("   ISBN:");
        genres = new JLabel("   Genre:");
        author = new JLabel("   Author:");
        number = new JLabel("   Price:");
        status = new JLabel("   Status: ");
        des = new JLabel("   Description");
        noone = new JTextField();
        bookname = new JTextField();
        bookcode = new JTextField();
        typeisbn = new JTextField();
        authorField = new JTextField();
        amount = new JTextField();
        bookstatus = new JTextField();
        longdes = new JTextField();
        genre = new JComboBox(genreoptions);
        newins.add(no);
        newins.add(noone);
        insert1.add(nameb);
        insert1.add(bookname);
        codepn.add(code);
        codepn.add(bookcode);
        insert2.add(isbn);
        insert2.add(typeisbn);
        insert3.add(genres);
        insert3.add(genre);
        insert4.add(author);
        insert4.add(authorField);
        insert5.add(number);
        insert5.add(amount);
        statuspn.add(status);
        statuspn.add(bookstatus);
        dct.add(des);
        dct.add(longdes);

        add(newins);
        add(insert1);
        add(codepn);
        add(insert2);
        add(insert3);
        add(insert4);
        add(insert5);
        add(statuspn);
        add(dct);

    }

    public JTextField getBookName() {
        return bookname;
    }

    public void setBookName(JTextField bookname) {
        this.bookname = bookname;
    }

    public JTextField getTypeIsbn() {
        return typeisbn;
    }

    public void setTypeIsbn(JTextField typeisbn) {
        this.typeisbn = typeisbn;
    }

    public JComboBox getGenre() {
        return genre;
    }

    public String[] getGenreOptions() {
        return genreoptions;
    }

    public JTextField getAmount() {
        return amount;
    }

    public void setAmount(JTextField amount) {
        this.amount = amount;
    }

    public JTextField getAuthorField() {
        return authorField;
    }

    public void setAuthorField(JTextField authorField) {
        this.authorField = authorField;
    }
    
    public JTextField getNoOne() {
        return noone;
    }

    public void setNoOne(JTextField noone) {
        this.noone = noone;
    }
    
    public JTextField getBookCode() {
        return bookcode;
    }

    public void setBookCode(JTextField bookcode) {
        this.bookcode = bookcode;
    }
    
    public JTextField getBookStatus() {
        return bookstatus;
    }

    public void setBookStatus(JTextField bookstatus) {
        this.bookstatus = bookstatus;
    }
    
    public JTextField getLongdes() {
        return longdes;
    }

    public void setLongdes(JTextField longdes) {
        this.longdes = longdes;
    }
    

    public static void main(String[] args) {
        new Insert();
    }

}
