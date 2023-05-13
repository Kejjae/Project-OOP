import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
public class Font {
    public Font(){
        java.awt.Font supermarket = null;
        try{
            supermarket = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, new File("supermarket.ttf"));
            supermarket = supermarket.deriveFont(10f);
            GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
            g.registerFont(java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, new File("supermarket.ttf")));
            
        }catch(IOException |FontFormatException e){}
    }
}
