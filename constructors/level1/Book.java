public class Book {
    String title;
    String author;
    double price;
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();
        Book book2 = new Book("1984", "George Orwell", 9.99);
        book2.displayInfo();
    }
}
