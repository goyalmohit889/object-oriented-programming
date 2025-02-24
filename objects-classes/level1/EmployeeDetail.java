import java.util.Scanner;

//  Program to Display Employee Details

public class EmployeeDetail {
    String name;
    int id;
    int salary;

    void empdetail() {
        System.out.println("--------------------------------");
        System.out.println("Employe name is: "+name);
        System.out.println("Employe id is: "+id);
        System.out.println("Employe salary is: "+salary);
    }
    public static void main(String[] args) {
        EmployeeDetail e = new EmployeeDetail();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        e.name=sc.nextLine();
        System.out.print("Enter your Id: ");
        e.id=sc.nextInt();
        System.out.print("Enter your salary: ");
        e.salary=sc.nextInt();

        e.empdetail();
    }
}
