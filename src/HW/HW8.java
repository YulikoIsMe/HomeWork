package HW;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What amount of loan do you need?");
        int loan=scanner.nextInt();
        if (loan<=200000) {
            System.out.println("you have been approved");
        }else if (loan>200000){
            System.out.println("you request has been denied");
        }

    }
}
