package HW;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your city name");
        String city= scanner.next();
        System.out.println("Please enter temperature in your city");
        int temp=scanner.nextInt();
        int tempC = (temp-32)*5/9;
        System.out.println("The temperature is "+tempC+" C "+"in "+city);

    }
}
