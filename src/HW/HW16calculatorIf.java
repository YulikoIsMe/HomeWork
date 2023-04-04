package HW;

import java.util.Scanner;

public class HW16calculatorIf {
    public static void main(String[] args) {
        Scanner calc=new Scanner(System.in);
        int n1;
        int n2;

        System.out.println("Enter the first number: ");
        n1=calc.nextInt();
        System.out.println("Enter the second number: ");
        n2=calc.nextInt();
        System.out.println("Select the order of operation: ");
        char operator=calc.next().charAt(0);

        if (operator=='+'){
            System.out.println(n1+n2);
        }if (operator=='-'){
            System.out.println(n1-n2);
        }if (operator=='*'){
            System.out.println(n1*n2);
        }if (operator=='/'){
            System.out.println(n1/n2);}

        }
    }

