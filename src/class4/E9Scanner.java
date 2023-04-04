package class4;

import java.util.Scanner;

public class E9Scanner {
    public static void main(String[] args) {
       /* Scanner scanner=new Scanner (System.in);
        System.out.println("Please enter your salary");
        //for int type of data we schould be using nextInt()method

        int salary= scanner.nextInt();
        if(salary>100000){
            System.out.println("You are rich");
        }else {
            System.out.println("Look for better opportunities");*/

            Scanner scanner=new Scanner(System.in);
            System.out.println("Are you hungry Enter true/false");
            boolean hungry=scanner.nextBoolean();
            if (hungry) {
                System.out.println("Let's order Pizza");
            }else {
                System.out.println("Let's practice Java");
            }
        }
    }

