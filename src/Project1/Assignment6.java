package Project1;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                number++;

            }
            if (number == 2) {
                System.out.println("Prime");
            } else {
                System.out.println("not");
            }


        }}}