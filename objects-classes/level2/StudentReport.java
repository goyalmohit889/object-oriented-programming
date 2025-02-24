import java.util.Scanner;

//  Program to Simulate Student Report

public class StudentReport {
    String name;
    int rollNumber;
    int marks;
    public static char grades(int marks) {
        if(marks>80){
            return 'O';
        }else if(marks >70){
            return 'A';
        }else if(marks >60){
            return 'B';
        }else if(marks >50){
            return 'C';
        }else if(marks >40){
            return 'D';
        }
        return 'F';    
    }
    void display(){
        System.out.println("----------------------------");
        System.out.println("Name of students: "+name);
        System.out.println("Rollnumber is: "+rollNumber);
        System.out.println("Grades is: "+grades(marks));
    }
    public static void main(String[] args) {
        StudentReport s = new StudentReport();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        s.name=sc.nextLine();
        System.out.print("Enter your rollnumber: ");
        s.rollNumber=sc.nextInt();
        System.out.print("Enter your marks: ");
        s.marks=sc.nextInt();
        s.display();
    }
}
