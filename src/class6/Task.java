package class6;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your height");
        int height= scan.nextInt();
        if (height<60){
            System.out.println("Short");
        }else if(height>=60&&height<=72){
            System.out.println("Medium");
        }else {
            System.out.println("Tall");
        }



    }
    }


    /*if ("under 60 inch") {
        System.out.println("short");}
    else if {
        System.out.println("Between 60 -72 inch");}
    else if {
            System.out.println("over 72 inch");*/