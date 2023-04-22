package class12;

public class DogTester2 {
    public static void main(String[] args) {
        Dog actualDog= new Dog();
        actualDog.name="Lucky";
        actualDog.age=1;
        actualDog.breed="Labrador";
        actualDog.color="Beige";
        actualDog.weight=30;

        actualDog.eat();
    }
}
