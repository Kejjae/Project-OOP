
package Data;


public class Books {
    private int no, price;
    private String name, code, isbn, author, category, status;
            
    public Books(){
        this.no = 0;
        this.name = "";
        this.code = "";
        this.isbn = "";
        this.author = "";
        this.category = "";
        this.price = 0;
        this.status = "";
    }
    
    public Books(int no, String name, String code, String isbn, String author, String category, int price, String status){
        this.no = no;
        this.name = name;
        this.code = code;
        this.isbn = isbn;
        this.author = author;
        this.category = category;
        this.price = price;
        this.status = status;
    }
    
    public int getNo(){
        return no;
    }
    public String getName(){
        return name;
    }
    public String getCode(){
        return code;
    }
    public String getIsbn(){
        return isbn;
    }
    public String getAuthor(){
        return author;
    }
    public String getCategory(){
        return category;
    }
    public int getPrice(){
        return price;
    }
    public String getStatus(){
        return status;
    }
}
