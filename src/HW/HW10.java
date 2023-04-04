package HW;

import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your number");
        int number= scan.nextInt();
        if (number>=1 && number<=10) {
            System.out.println("Small");
        }else if (number>=11 && number<=100){
            System.out.println("Medium");
        }else {
            System.out.println("Large");
        }

    }
}
