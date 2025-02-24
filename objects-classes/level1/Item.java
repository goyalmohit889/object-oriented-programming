import java.util.Scanner;

//  Program to Track Inventory of Items

public class Item {
    String itemCode, itemName ;
    int price;
    void display(){
        System.out.println("-------------------------");
        System.out.println("Item code is: "+itemCode);
        System.out.println("Item name is: "+itemName);
        System.out.println("Item price is: "+price);
    }
    public static void main(String[] args) {
        Item i = new Item();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item name: ");
        i.itemName=sc.nextLine();
        System.out.print("Enter item code: ");
        i.itemCode=sc.nextLine();
        System.out.print("Enter item price: ");
        i.price=sc.nextInt();
        i.display();
    }    
}
