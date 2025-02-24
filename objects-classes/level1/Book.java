import java.util.Scanner;

//  Program to Handle Book Details

public class Book {
    String name;
    String title;
    int price;
    void display(){
        System.out.println("------------------------------");
        System.out.println("Title of book is: "+title);
        System.out.println("Name of auther is: "+name);
        System.out.println("Price of book: "+price);
    }
    public static void main(String[] args) {
        Book b = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter auther name: ");
        b.name = sc.nextLine();
        System.out.print("enter title: ");
        b.title= sc.nextLine();
        System.out.print("enter price: ");
        b.price = sc.nextInt();
        b.display();
    }
}
