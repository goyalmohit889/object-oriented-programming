public class Book1 {
    String title;
    String author;
    double price;
    boolean availability;

    public Book1(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    

    public void display(){
        System.out.println("Book Title: "+title);
        System.out.println("Auther of Book: "+author);
        System.out.println("Price of Book: "+price);
        // System.out.println("Availability of Book: "+availab(availability));
        if(availab(availability)){
            System.out.println("Book is available");
        }
        else System.out.println("Book is not available");
    }
    public static boolean  availab(boolean availability) {
        if(availability){
            return true;
        }
        return false;
    }

     




    public static void main(String[] args) {
        Book1 b=new Book1("RichDad","Mohit", 10000,true);
        b.display();
        
    }
}
