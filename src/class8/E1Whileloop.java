package class8;

import java.util.Scanner;

public class E1Whileloop {
    public static void main(String[] args) {
        //to print all whole numbers from 15 to 30
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your start and end number");

        int start =scanner.nextInt();
        int end=scanner.nextInt();
        int step=scanner.nextInt();

        int number=start;

        while (number <=end) {
             {
                System.out.print(number + " ");

            number=number+step;}
        }
    }
}