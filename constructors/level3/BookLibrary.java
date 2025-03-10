class Book{
    public int isbn;
    protected String title;
    private String author;

    public Book(int isbn,String title,String auther) {
        this.isbn=isbn;
        this.title=title;
        this.author=auther;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void display(){
        System.out.println("ISBN: "+isbn);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }
}
class EBook extends Book{
    
    public EBook(int isbn, String title, String auther) {
        super(isbn, title, auther);
    }
    public void display(){
        System.out.println("ISBN: "+isbn);
        System.out.println("Title: "+title);
    }
}

public class BookLibrary {
    public static void main(String[] args) {
        Book b = new Book(1234, "cpp", "Jan");
        b.display();

        b.setAuthor("Ben");
        System.out.println("Updated Author: "+b.getAuthor());

        EBook eb = new EBook(2345, "java", "Jhon");
        eb.display();
    }
}
