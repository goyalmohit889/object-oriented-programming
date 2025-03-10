
public class Course {
    String courseName;
    int duration;
    int fee;
    static String instituteName ;

    public Course(String courseName,int duration,int fee,String ins){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
        this.instituteName=ins;
    }
    public void display(){
        System.out.println("Course name: "+courseName);
        System.out.println("Course duration: "+duration);
        System.out.println("Course fee: "+fee);
    }
    public static void display1() {
        System.out.println("name of institute: "+instituteName);
        
    }
    public static void main(String[] args) {
        Course c = new Course("CSE",4,656000,"chitkara");
        c.display();
        c.display1();
    }
}
