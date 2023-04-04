package HW;

import java.util.Scanner;

public class HW11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country=scan.nextLine();

        System.out.println("Please enter what language do you speak");
        String language=scan.nextLine();

        System.out.println("Please enter your grade");
        char grade=scan.next().charAt(0);

        if (grade=='A') {
            System.out.println("Excellent");
        } else if (grade=='B') {
            System.out.println("Good");
        } else if (grade=='C'){
            System.out.println("Average");
        } else if (grade=='D') {
            System.out.println("Bad");
        } else {
            System.out.println("Not acceptable");

        }
        {

        }
    }



    }

