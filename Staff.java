
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.util.Date;
import javax.swing.table.*;
import insert.Insert;

public class Staff implements ActionListener{
    private JFrame frame, frameinsert, framedel;
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3, frame4;
    private JPanel panelf1, panelf2, panelf3, emptyf2, emptyf3, emptyf4, return1, return2, return3, emp1, emp2, emp3, mn1, mn2, mn3, emp4, emp5, emp6, del1, del2, del3, insert1;
    private JMenuBar mb;
    private JMenu file, edit, filehis;
    private JMenuItem fileborrow, filereturn, manage, logout;
    private JSpinner date, datereturn;
    private JTable table, tablereturn, managetable;
    private JButton add, delete, insert, auswischen, search;
    private JTextField txt, mntxt, delbook, delmai;
    private JLabel datetxt, total, returndate, ISBN,delname, delisbn;
    private JScrollPane scrollPane;
    private Insert newpanel;
    private int line = 0;

    public Staff(){
        frame = new JFrame("Ya Luem Khuen");
        desktopPane = new JDesktopPane();
        newpanel = new Insert();
        
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
        
        String[][] row = {{"1.", "123456789", "ONWARD", "1332"},
                         {"2.", "123456789", "About a boy", "12345"}};
        String[] col = {"No", "Membership", "Book Name", "ISBN"};
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
        
        
       
        //String[][] mn = {{"1.", "1332", "ONWARD", "Fantasy", "2"}};
        //String[] colmn = {"No", "ISBN", "Book Name", "Genres", "Left"};
        managetable = new JTable();
        //scrollPane.setViewportView(managetable);
        
        DefaultTableModel mn = (DefaultTableModel)managetable.getModel();
        mn.addColumn("No");
        mn.addColumn("ISBN");
        mn.addColumn("BOOK Name");
        mn.addColumn("Genres");
        mn.addColumn("Left");
        
        mn.addRow(new Object[0]);
        mn.setValueAt(line + 1, line, 0);
        mn.setValueAt("9783125738300", line, 1);
        mn.setValueAt("A BOUT A BOY", line, 2);
        mn.setValueAt("Novel", line, 3);
        mn.setValueAt("2", line, 4);
        line = line + 1;
        
        
        
        mntxt = new JTextField();
        mntxt.setBounds(80, 50, 150, 35);
        
        ISBN = new JLabel("ISBN: ");
        ISBN.setBounds(50, 50, 80, 40);
        
        //backmn = new JButton("Back");
        //backmn.setBounds(10, 50, 100, 50);
        add = new JButton("Add");
        add.setBounds(280, 55, 70, 40);
        add.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
             frameinsert = new JFrame("New");
             frameinsert.setLayout(new BorderLayout());
             frameinsert.setLocation(370, 200);
             insert = new JButton("Insert");
             insert1 = new JPanel();
             insert1.add(insert);
             insert.addActionListener(new ActionListener(){
                 @Override
                 public void actionPerformed(ActionEvent ex){
                     mn.addRow(new Object[0]);
                     mn.setValueAt(line + 1, line, 0);
                     mn.setValueAt(newpanel.getTypeIsbn().getText(), line, 1);
                     mn.setValueAt(newpanel.getBookName().getText(), line, 2);
                     mn.setValueAt(newpanel.getGenre().getSelectedItem().toString(), line, 3);
                     mn.setValueAt(Integer.parseInt(newpanel.getAmount().getText()), line, 4);
                     line = line + 1;
                     
                     
                 }
             });
             frameinsert.add(newpanel);
             frameinsert.add(insert1, BorderLayout.SOUTH);
             frameinsert.setSize(250, 250);
             frameinsert.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             frameinsert.setVisible(true);
        }
    });
        delete = new JButton("Delete");
        delete.setBounds(355, 55, 70, 40);
        delete.addActionListener(this);
        search = new JButton("search");
        search.addActionListener(this);
        search.setBounds(235, 56, 67, 30);
        
        mn1 = new JPanel();
        mn2 = new JPanel();
        mn3 = new JPanel();
        emp4 = new JPanel();
        emp5 = new JPanel();
        emp6 = new JPanel();
        mn1.setLayout(null);
        mn2.setLayout(new BorderLayout());
        mn3.setLayout(null);
        
        mn1.add(ISBN); mn1.add(mntxt); mn1.add(search);
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
