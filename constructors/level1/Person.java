public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person anotherPerson) {
        this.name = anotherPerson.name;
        this.age = anotherPerson.age;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person(person1);

        System.out.println("Person 1 Details:");
        person1.displayPersonDetails();

        System.out.println("\nPerson 2 (copied) Details:");
        person2.displayPersonDetails();
    }
}
