import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.*;
public class Staff implements ActionListener{
    private JFrame frame, frameinsert, framedel;
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3, frame4;
    private JPanel panelf1, panelf2, panelf3, emptyf2, emptyf3, emptyf4, return1, return2, return3, emp1, emp2, emp3, mn1, mn2, mn3, emp4, emp5, emp6, pf1, pf2, 
            insert1, insert2, insert3, insert4, insert5, del1, del2, del3;
    private JMenuBar mb;
    private JMenu file, edit, filehis;
    private JMenuItem fileborrow, filereturn, manage, logout;
    private JSpinner date, datereturn, amount;
    private JTable table, tablereturn, managetable;
    private JButton add, delete, insert, auswischen;
    private JTextField txt, mntxt, name, id, expic, bookname, typeisbn, delbook, delmai;
    private JLabel datetxt, total, returndate, ISBN, nameb, isbn, genres, delname, delisbn, number;
    private JComboBox genre;
    public Staff(){
        frame = new JFrame("Ya Luem Khuen");
        desktopPane = new JDesktopPane();
        
        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        filehis = new JMenu("History");
        frame.setJMenuBar(mb);
        mb.add(file); mb.add(edit);
        
        fileborrow = new JMenuItem("Borrowed");
        filereturn = new JMenuItem("Return");
        manage = new JMenuItem("Manage");
        logout = new JMenuItem("Logout");
        
        file.add(filehis); 
        file.add(logout);
        file.addSeparator();
        edit.add(manage);
        
        filehis.add(fileborrow);
        filehis.addSeparator();
        filehis.add(filereturn);
        
        fileborrow.addActionListener(this);
        filereturn.addActionListener(this);
        manage.addActionListener(this);
        logout.addActionListener(this);
       
        ////////////////example////////////////////////////////////////////
        String[][] row = {{"1.", "65070026", "ONWARD", "1332", "30"},
                         {"2.", "65070026", "About a boy", "12345", "20"}};
        String[] col = {"No", "Membership", "Book Name", "ISBN", "Price"};
        table = new JTable(row, col);
        
        panelf1 = new JPanel();
        panelf2 = new JPanel();
        panelf3 = new JPanel();
        emptyf2 = new JPanel();
        emptyf3 = new JPanel();
        emptyf4 = new JPanel();
        panelf2.setLayout(null);
        panelf1.setLayout(new BorderLayout());
        panelf3.setLayout(null);
        
        SpinnerDateModel model = new SpinnerDateModel(new Date(), null, null, Calendar.DAY_OF_MONTH);
        date = new JSpinner(model);
        Dimension size = new Dimension(200, 100);
        date.setPreferredSize(size);
        date.setBounds(100, 50, 150, 30);
        
        
        //back = new JButton("Back");
        //back.setBounds(10, 50, 120, 50);
        
        txt = new JTextField();
        txt.setEditable(false);
        txt.setBounds(300, 45, 120, 65);
        
        
        datetxt = new JLabel("Date: ");
        datetxt.setBounds(50, 50, 80, 40);
        total = new JLabel("Total: ");
        total.setBounds(260, 40, 80, 40);
        
        panelf1.add(emptyf2, BorderLayout.WEST);
        panelf1.add(emptyf3, BorderLayout.EAST);
        panelf1.add(emptyf4, BorderLayout.SOUTH);
        panelf1.add(new JScrollPane (table));
        //panelf2.add(back);
        panelf2.add(txt);
        panelf2.add(total);
        panelf3.add(datetxt); panelf3.add(date); 
        
        /////////////////////// end frame1 /////////////////////////////
        
        SpinnerDateModel his = new SpinnerDateModel(new Date(), null, null, Calendar.DAY_OF_MONTH);
        datereturn = new JSpinner(his);
        Dimension size1 = new Dimension(200, 100);
        datereturn.setPreferredSize(size1);
        datereturn.setBounds(100, 50, 150, 30);
        
        String[][] rowre = {{"1.", "123456789", "ONWARD", "1332"},
                         {"2.", "123456789", "About a boy", "12345"}};
        String[] colre = {"No", "Membership", "Book Name", "ISBN"};
        tablereturn = new JTable(rowre, colre);
        
        //backreturn = new JButton("Back");
        //backreturn.setBounds(10, 50, 120, 50);
        
        returndate = new JLabel("Date: ");
        returndate.setBounds(50, 50, 80, 40);
        
        return1 = new JPanel();
        return2 = new JPanel();
        return3 = new JPanel();
        emp1 = new JPanel();
        emp2 = new JPanel();
        emp3 = new JPanel();
        return1.setLayout(null);
        return2.setLayout(new BorderLayout());
        return3.setLayout(null);
        
        return1.add(returndate); return1.add(datereturn); 
        return2.add(emp1, BorderLayout.WEST);
        return2.add(emp2, BorderLayout.EAST);
        return2.add(emp3, BorderLayout.SOUTH);
        return2.add(new JScrollPane (tablereturn));
        //return3.add(backreturn);
        /////////////////// end frame2 /////////////////////
        
        String[][] mn = {{"1.", "1332", "ONWARD", "Fantasy", "2"}};
        String[] colmn = {"No", "ISBN", "Book Name", "Genres", "Left"};
        managetable = new JTable(mn, colmn);
        
        mntxt = new JTextField();
        mntxt.setBounds(100, 50, 150, 30);
        
        ISBN = new JLabel("ISBN: ");
        ISBN.setBounds(50, 50, 80, 40);
        
        //backmn = new JButton("Back");
        //backmn.setBounds(10, 50, 100, 50);
        add = new JButton("Add");
        add.setBounds(280, 55, 70, 40);
        add.addActionListener(this);
        delete = new JButton("Delete");
        delete.setBounds(355, 55, 70, 40);
        delete.addActionListener(this);
        
        mn1 = new JPanel();
        mn2 = new JPanel();
        mn3 = new JPanel();
        emp4 = new JPanel();
        emp5 = new JPanel();
        emp6 = new JPanel();
        mn1.setLayout(null);
        mn2.setLayout(new BorderLayout());
        mn3.setLayout(null);
        
        mn1.add(ISBN); mn1.add(mntxt); 
        mn2.add(emp4, BorderLayout.WEST);
        mn2.add(emp5, BorderLayout.EAST);
        mn2.add(emp6, BorderLayout.SOUTH);
        mn2.add(new JScrollPane (managetable));
        //mn3.add(backmn); 
        mn3.add(add); mn3.add(delete);
        ////////////////// end frame3 /////////////////////////////
        
        //name = new JTextField("Name");
        //id = new JTextField("ID");
        //expic = new JTextField("find pic");
        //name.setBounds(100, 50, 150, 30);
        //id.setBounds(100, 50, 150, 30);
        //expic.setBounds(100, 50, 170, 170);
        
        //pf1 = new JPanel();
        //pf2 = new JPanel();
        //pf1.setLayout(null);
        //pf2.setLayout(new GridLayout(2, 1));
        //pf2.add(name);
        //pf2.add(id);
        //pf2.setBounds(100, 80, 170, 85);
        //pf1.add(pf2); 
        
        
        ///////////////////// inside////////////////////
        frame1 = new JInternalFrame("Borrowed History", true, true, true, true);
        frame2 = new JInternalFrame("Returned History", true, true, true, true);
        frame3 = new JInternalFrame("Manage Books", true, true, true, true);
        //frame4 = new JInternalFrame("Profile", true, true, true, true);
   
        frame1.setLayout(new GridLayout(3, 1));
        frame1.getContentPane().add(panelf3);
        frame1.getContentPane().add(panelf1);
        frame1.getContentPane().add(panelf2);
        frame1.setSize(450, 450);
        frame1.setPreferredSize(new Dimension(500, 500));
        frame1.setLocation(300, 150);
        frame1.setVisible(true);
        
        frame2.setLayout(new GridLayout(3, 1));
        frame2.getContentPane().add(return1);
        frame2.getContentPane().add(return2);
        frame2.getContentPane().add(return3);
        frame2.setSize(450, 450);
        frame2.setPreferredSize(new Dimension(500, 500));
        frame2.setLocation(400, 120);
        frame2.setVisible(true);
        
        frame3.setLayout(new GridLayout(3, 1));
        frame3.getContentPane().add(mn1);
        frame3.getContentPane().add(mn2);
        frame3.getContentPane().add(mn3);
        frame3.setSize(450, 450);
        frame3.setPreferredSize(new Dimension(300, 300));
        frame3.setLocation(350, 140);
        frame3.setVisible(true);
        
        //frame4.getContentPane().add(pf1);
        //frame4.setSize(300, 300);
        //frame4.setPreferredSize(new Dimension(300, 300));
        //frame4.setLocation(700, 0);
        //frame4.setVisible(true);
        
        
        ///////////////////////////////////////////////////////
        
        frame.add(desktopPane);
        frame.setMinimumSize(new Dimension(500, 500));
        frame.setVisible(true);
        frame.setExtendedState(frame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
     public void actionPerformed(ActionEvent e){
        if (e.getSource().equals(fileborrow)){
            desktopPane.add(frame1);
        }else if (e.getSource().equals(filereturn)){
            desktopPane.add(frame2);
        }else if (e.getSource().equals(manage)){
            desktopPane.add(frame3);
        }else if (e.getSource().equals(logout)){
            System.exit(0);
        }else if (e.getSource().equals(add)){
            frameinsert = new JFrame("New");
            frameinsert.setLayout(new GridLayout(5, 1));
            frameinsert.setLocation(370, 200);
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
            amount = new JSpinner();
            genre = new JComboBox();
            genre.addItem("Novel");
            genre.addItem("Fantasy");
            genre.addItem("Tale");
            genre.addItem("Literature");
            genre.addItem("Horror");
            genre.setSelectedItem("Novel");
            insert = new JButton("Insert");
            
            insert1.add(nameb); insert1.add(bookname);
            insert2.add(isbn); insert2.add(typeisbn);
            insert3.add(genres); insert3.add(genre);
            insert4.add(number); insert4.add(amount);
            insert5.add(insert);
            
            frameinsert.add(insert1);
            frameinsert.add(insert2);
            frameinsert.add(insert3);
            frameinsert.add(insert4);
            frameinsert.add(insert5);
            frameinsert.setSize(250, 250);
            frameinsert.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frameinsert.setVisible(true);
            
        }else if (e.getSource().equals(delete)){
            framedel = new JFrame("Delete");
            framedel.setLayout(new GridLayout(3, 1));
            framedel.setLocation(400, 400);
            del1 = new JPanel();
            del2 = new JPanel();
            del3 = new JPanel();
            del1.setLayout(new GridLayout(1, 2));
            del2.setLayout(new GridLayout(1, 2));
            delname = new JLabel("   Book Name:");
            delisbn = new JLabel("   ISBN:");
            delbook = new JTextField(); 
            delmai = new JTextField();
            auswischen = new JButton("Delete");
            
            del1.add(delname); del1.add(delbook);
            del2.add(delisbn); del2.add(delmai);
            del3.add(auswischen);
            
            framedel.add(del1);
            framedel.add(del2);
            framedel.add(del3);
            framedel.setSize(200, 200);
            framedel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            framedel.setVisible(true);
        }
     }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {new Staff();});
    }
}
