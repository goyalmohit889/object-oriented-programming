import java.util.Scanner;

public class Circle {
    private double radius;
    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        this.radius = radius; 
    }
    public void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(); 
        circle1.displayArea();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radious: ");
        int n=sc.nextInt();
        Circle circle2 = new Circle(n); 
        circle2.displayArea();
    }
}


