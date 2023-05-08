package class17;

import org.w3c.dom.ls.LSOutput;

public class Zebra {
    String name;
    String color;
    int age;
    double weight;
    static int noOLegs = 4;

    public Zebra(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    void printInfo() {
        System.out.println(name + color + age + weight);
    }


    static void speak() {
        System.out.println("moooooo");

    }

    public static void main(String[] args) {

    }
}