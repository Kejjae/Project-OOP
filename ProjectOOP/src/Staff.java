
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.util.Date;
import javax.swing.table.*;
import insert.Insert;
import java.io.*;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

public class Staff extends Success implements ActionListener, WindowListener, KeyListener, Serializable {

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
    private JLabel datetxt, total, returndate, find, delname, delisbn;
    private JScrollPane scrollPane;
    private Insert newpanel;
    private Success mntable;
    private int line = 0;
    Connection con;

    public ArrayList<Books> bookList() {

        ArrayList<Books> bookList = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/myshop?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String Username = "root";
            String password = "bookshop";
            con = DriverManager.getConnection(url, Username, password);
            String sql = "select * from books";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Books books;
            while (rs.next()) {
                books = new Books(rs.getInt("no"), rs.getString("name"), rs.getString("code"), rs.getString("isbn"), rs.getString("author"), rs.getString("category"), rs.getInt("price"), rs.getString("status"), rs.getString("description"));
                bookList.add(books);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return bookList;
    }

    @SuppressWarnings("empty-statement")

    public Staff() {

        frame = new JFrame("Ya Luem Khuen");
        desktopPane = new JDesktopPane();
        newpanel = new Insert();

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        filehis = new JMenu("History");
        frame.setJMenuBar(mb);
        mb.add(file);
        mb.add(edit);

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
        panelf1.add(new JScrollPane(table));

        panelf2.add(txt);
        panelf2.add(total);
        panelf3.add(datetxt);
        panelf3.add(date);

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

        return1.add(returndate);
        return1.add(datereturn);
        return2.add(emp1, BorderLayout.WEST);
        return2.add(emp2, BorderLayout.EAST);
        return2.add(emp3, BorderLayout.SOUTH);
        return2.add(new JScrollPane(tablereturn));

        /////////////////// end frame2 /////////////////////
        managetable = new JTable();

        ArrayList<Books> list = bookList();
        DefaultTableModel mn = (DefaultTableModel) managetable.getModel();
        Object[] colnames = new Object[9];
        colnames[0] = "No";
        colnames[1] = "Name";
        colnames[2] = "Code";
        colnames[3] = "ISBN";
        colnames[4] = "Author";
        colnames[5] = "Category";
        colnames[6] = "Price";
        colnames[7] = "Status";
        colnames[8] = "Description";

        mn.setColumnIdentifiers(colnames);
        Object[] rowmn = new Object[9];
        for (int i = 0; i < list.size(); i++) {
            rowmn[0] = list.get(i).getNo();
            rowmn[1] = list.get(i).getName();
            rowmn[2] = list.get(i).getCode();
            rowmn[3] = list.get(i).getIsbn();
            rowmn[4] = list.get(i).getAuthor();
            rowmn[5] = list.get(i).getCategory();
            rowmn[6] = list.get(i).getPrice();
            rowmn[7] = list.get(i).getStatus();
            rowmn[8] = list.get(i).getDesc();

            mn.addRow(rowmn);

            scrollPane = new JScrollPane(managetable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        }
        mntxt = new JTextField();
        mntxt.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {}
            @Override
            public void keyReleased(KeyEvent e) {
                DefaultTableModel mn = (DefaultTableModel) managetable.getModel();
                TableRowSorter<DefaultTableModel> mn1 = new TableRowSorter<>(mn);
                managetable.setRowSorter(mn1);
                mn1.setRowFilter(RowFilter.regexFilter(mntxt.getText()));
            }
            
        });
        mntxt.setBounds(100, 50, 150, 35);

        find = new JLabel("Search : ");
        find.setBounds(50, 50, 80, 40);

        add = new JButton("Add");
        add.setBounds(375, 90, 70, 40);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameinsert = new JFrame("New");
                frameinsert.setLayout(new BorderLayout());
                frameinsert.setLocation(370, 200);
                insert = new JButton("Insert");
                insert1 = new JPanel();
                insert1.add(insert);
                insert.addActionListener(new ActionListener() {
                    public void windowOpened(WindowEvent e) {
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            String url = "jdbc:mysql://localhost:3306/myshop?zeroDateTimeBehavior=CONVERT_TO_NULL";
                            String Username = "root";
                            String password = "bookshop";
                            con = DriverManager.getConnection(url, Username, password);
                            Statement st = con.createStatement();
                            ResultSet rs = st.executeQuery("select * from books");
                            rs.last();
                            int row = rs.getRow();
                            int col = rs.getMetaData().getColumnCount();
                            rs.beforeFirst();
                            String rowData[][] = new String[row][col];
                            int r = 0;
                            while (rs.next()) {
                                for (int i = 0; i < col; i++) {
                                    rowData[r][i] = rs.getString(i + 1);

                                }
                                r++;
                            }
                            String[] columnName = {"No", "Name", "Code", "ISBN", "Author", "Category", "Price", "Status", "Description"};
                            DefaultTableModel mn = (DefaultTableModel) managetable.getModel();
                            mn.setDataVector(rowData, columnName);

                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, ex);
                        }

                    }
                    public void actionPerformed(ActionEvent ex) {
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            String url = "jdbc:mysql://localhost:3306/myshop?zeroDateTimeBehavior=CONVERT_TO_NULL";
                            String Username = "root";
                            String password = "bookshop";
                            con = DriverManager.getConnection(url, Username, password);
                            Statement st = con.createStatement();
                            boolean bl = st.execute("insert into books(No, Name, Code, ISBN, Author, Category, Price, Status, Description) values ('" + newpanel.getNoOne().getText() + "', '" + newpanel.getBookName().getText() + "', '" + newpanel.getBookCode().getText() + "', '" + newpanel.getTypeIsbn().getText() + "', '" + newpanel.getAuthorField().getText() + "', '" + newpanel.getGenre().getSelectedItem().toString() + "', '" + newpanel.getAmount().getText() + "', '" + newpanel.getBookStatus().getText() + "', '" + newpanel.getLongdes().getText() + "') ");
                            if (!bl) {
                                JOptionPane.showMessageDialog(managetable, "inserted.");
                                windowOpened(null);
                            } else {
                                JOptionPane.showMessageDialog(managetable, "Error!.");
                            }

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                        newpanel.getNoOne().setText("");
                        newpanel.getBookName().setText("");
                        newpanel.getBookCode().setText("");
                        newpanel.getAuthorField().setText("");
                        newpanel.getTypeIsbn().setText("");
                        newpanel.getGenre().setSelectedItem("Novel");
                        newpanel.getAmount().setText("");
                        newpanel.getBookStatus().setText("");
                        newpanel.getLongdes().setText("");

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
        delete.setBounds(450, 90, 70, 40);
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(managetable.getValueAt(managetable.getSelectedRow(), 0).toString());
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/myshop?zeroDateTimeBehavior=CONVERT_TO_NULL";
                    String Username = "root";
                    String password = "bookshop";
                    con = DriverManager.getConnection(url, Username, password);
                    Statement st = con.createStatement();
                    int r = JOptionPane.showConfirmDialog(managetable, "are you sure?");
                    if (r==0){
                        if(!st.execute("delete from books where No=" + id)){
                            windowOpened(null);
                        }
                        JOptionPane.showMessageDialog(managetable, "Deleted successfully");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        });
        /*search = new JButton("search");
        search.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                 String booknumber = mntxt.getText();
                 try {
                    Statement st = con.createStatement();
                    DefaultTableModel mn = (DefaultTableModel) managetable.getModel();
                    mn.setRowCount(0);
                    ResultSet rs = st.executeQuery("select * from books WHERE ISBN = '"+booknumber+"' ");
                   while(rs.next()){
                       Vector v = new Vector();
                       v.add(rs.getInt(1));
                       v.add(rs.getString(2));
                       v.add(rs.getString(3));
                       v.add(rs.getString(4));
                       v.add(rs.getString(5));
                       v.add(rs.getString(6));
                       v.add(rs.getInt(7));
                       v.add(rs.getString(8));
                       v.add(rs.getString(9));
                       
                       mn.addRow(v);
                       
                   }
                    
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
                 
             }

        });
        search.setBounds(235, 56, 67, 30);*/

        mntable = new Success();

        mn1 = new JPanel();
        mn2 = new JPanel();
        mn3 = new JPanel();
        emp4 = new JPanel();
        emp5 = new JPanel();
        emp6 = new JPanel();
        mn1.setLayout(null);
        mn2.setLayout(new BorderLayout());
        mn3.setLayout(null);

        mn1.add(find);
        mn1.add(mntxt);
        //mn1.add(search);
        mn2.add(emp4, BorderLayout.WEST);
        mn2.add(emp5, BorderLayout.EAST);
        mn2.add(emp6, BorderLayout.SOUTH);
        mn2.add(scrollPane);
        mn3.add(add);
        mn3.add(delete);

        ////////////////// end frame3 /////////////////////////////
        ///////////////////// inside////////////////////
        frame1 = new JInternalFrame("Borrowed History", true, true, true, true);
        frame2 = new JInternalFrame("Returned History", true, true, true, true);
        frame3 = new JInternalFrame("Manage Books", true, true, true, true);

        frame1.setLayout(new GridLayout(3, 1));
        frame1.getContentPane().add(panelf3);
        frame1.getContentPane().add(panelf1);
        frame1.getContentPane().add(panelf2);
        frame1.setSize(450, 450);
        frame1.setPreferredSize(new Dimension(500, 500));
        frame1.setLocation(300, 150);
        frame1.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);

        frame2.setLayout(new GridLayout(3, 1));
        frame2.getContentPane().add(return1);
        frame2.getContentPane().add(return2);
        frame2.getContentPane().add(return3);
        frame2.setSize(450, 450);
        frame2.setPreferredSize(new Dimension(500, 500));
        frame2.setLocation(400, 120);
        frame2.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);

        frame3.setLayout(new GridLayout(3, 1));
        frame3.getContentPane().add(mn1);
        frame3.getContentPane().add((mn2));
        frame3.getContentPane().add(mn3);
        frame3.setSize(570, 570);
        frame3.setPreferredSize(new Dimension(300, 300));
        frame3.setLocation(350, 140);
        frame3.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);

        ///////////////////////////////////////////////////////
        frame.add(desktopPane);
        frame.setMinimumSize(new Dimension(500, 500));
        frame.setVisible(true);
        frame.setExtendedState(frame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(fileborrow)) {
            desktopPane.add(frame1);
            frame1.setVisible(true);
        } else if (e.getSource().equals(filereturn)) {
            desktopPane.add(frame2);
            frame2.setVisible(true);
        } else if (e.getSource().equals(manage)) {
            desktopPane.add(frame3);
            frame3.setVisible(true);
        } else if (e.getSource().equals(logout)) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {
            new Staff();
        });

    }

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {}

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

}
