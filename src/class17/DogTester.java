package class17;

public class DogTester {
    String name;
    String color;
    String breed;
    int age;

    void printInfo() {
        System.out.println(name + " " + color + " " + breed + " " + age);
    }

    public static void main(String[] args) {
        /*class17.Dog dog1 = new class17.Dog();
        dog1.breed = "German";
        dog1.color = "Black";
        dog1.name = "jack";
        dog1.age = 1;

        class17.Dog dog2 = new class17.Dog();
        dog2.breed = "German";
        dog2.color = "Black";
        dog2.name = "jack";
        dog1.age = 2;

        class17.Dog dog3 = new class17.Dog();
        dog3.breed = "German";
        dog3.color = "Black";
        dog3.name = "jack";
        dog1.age = 3;

        class17.Dog dog4 = new class17.Dog();
        dog4.breed = "German";
        dog4.color = "Black";
        dog4.name = "jack";
        dog1.age = 4;

        class17.Dog dog5 = new class17.Dog();
        dog5.breed = "German";
        dog5.color = "Black";
        dog5.name = "jack";
        dog1.age = 5;

        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();
        dog5.printInfo();*/

        Dog dog1=new Dog("jack","black","persian",12);
        Dog dog2=new Dog("Leyla","black","Russian",4);
        Dog dog3=new Dog("Lucky","black","persian",12);
        Dog dog4=new Dog("doggy","black","persian",12);
        Dog dog5=new Dog("Papi","black","persian",12);


        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();

    }
}
