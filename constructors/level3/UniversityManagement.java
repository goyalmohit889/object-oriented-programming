
class Student {
    public int rollNumber; 
    protected String name; 
    private double CGPA; 

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA value!");
        }
    }

    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void showName() {
        System.out.println("Postgraduate Student Name: " + name);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 8.5);
        s1.display();
    
        s1.setCGPA(9.2);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        PostgraduateStudent pg = new PostgraduateStudent(102, "Bob", 9.0);
        pg.showName();
    }
}
