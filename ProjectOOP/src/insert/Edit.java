
package insert;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public interface Edit {
    public JTextField getBookName();
    public void setBookName(JTextField bookname);
    public JTextField getTypeIsbn();
    public void setTypeIsbn(JTextField typeisbn);
    public JComboBox getGenre();
    public JTextField getAmount();
    public void setAmount(JTextField amount);
    public JTextField getAuthorField();
    public void setAuthorField(JTextField authorField);
}
