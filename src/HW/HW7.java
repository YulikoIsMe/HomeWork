package HW;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("you can't drive");
        } else {
            System.out.println("You can drive");


        }


    }

}