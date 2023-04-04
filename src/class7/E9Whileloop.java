package class7;

public class E9Whileloop {
    public static void main(String[] args) {
        int counter = 25;
        while (counter >= 5) {
            if (counter != 15) {// not printing 15
                System.out.print(counter + " ");
            }
            counter -= 5;
        }


    }
}