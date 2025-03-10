class Employee {
    public int employeeID; 
    protected String department; 
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
    
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
    }

    public void displayManager() {
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "IT", 50000);
        emp1.display();
        
        emp1.setSalary(55000);
        System.out.println("Updated Salary: " + emp1.getSalary());

        Manager mgr1 = new Manager(102, "HR", 70000, "Recruitment");
        mgr1.displayManager();
    }
}
