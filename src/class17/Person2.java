package class17;

public class Person2 {

    String name;

    Person2() {
        System.out.println("No argument constructor");
    }

    Person2(String personName) {
        this.name = personName;
        System.out.println("1 Argument constructor");
    }
}
   /* private int value;

    // Constructor with parameters
    public task(int language) {
        this.value = language;
    }

    // Constructor without parameters
    public task() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }
}
class Task {
    public static void main(String[] args) {
        // Create an instance using the constructor with parameters
        task obj1 = new task(10);
        System.out.println("Value of obj1: " + obj1.getValue());

        // Create an instance using the constructor without parameters
        task obj2 = new task();
        System.out.println("Value of obj2: " + obj2.getValue());
    }
}*/
