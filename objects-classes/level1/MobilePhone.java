import java.util.Scanner;

//  Program to Handle Mobile Phone Details

public class MobilePhone {
    String brand;
    String model;
    int price;
    void display(){
        System.out.println("------------------------------");
        System.out.println("Brand of Mobile is: "+brand);
        System.out.println("Model of Mobile is: "+model);
        System.out.println("Price of mobile: "+price);
    }
    public static void main(String[] args) {
        MobilePhone b = new MobilePhone();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Brand of Mobile: ");
        b.brand = sc.nextLine();
        System.out.print("enter model of Mobile: ");
        b.model= sc.nextLine();
        System.out.print("enter price: ");
        b.price = sc.nextInt();
        b.display();
    }
}
