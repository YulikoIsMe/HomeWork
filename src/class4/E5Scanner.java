package class4;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {
        //scanner is a class(which knows how to take input from the keyboard
        //scan is a variable of type scanner just like we create a variable of type String
        //new=> is special keyword which create the object of a class
        //Scanner again with ()
        //System.in=>means we want to use the scanner class for taking the user input
        //whenever we need to take the input from the user we need this code
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scan.next();
        System.out.println("You are amazing "+name);



    }
}
