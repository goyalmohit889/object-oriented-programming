import java.util.Scanner;

//  Program to Compute Area of a Circle

public class Circle {
    int radius;

    void display(){
        System.out.println("Circumference of a circle is: "+(2*3.14*radius));
        System.out.println("Area of circle is: "+(3.14*radius*radius));
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radious of a circle: ");
        c.radius=sc.nextInt();
        c.display();

    }
}
