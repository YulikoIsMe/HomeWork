package HW;

import java.util.Scanner;

public class HW14 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter an hour");
        int time=scan.nextInt();
        if(time>=1&&time<=11) {
            System.out.println("It's morning");
        }else if(time>=12&&time<=15){
            System.out.println("It's afternoon");
        }else if(time>=16&&time<=20){
            System.out.println("It's evening");
        }else if (time>=21&&time<=24){
            System.out.println("It's night");
        }
    }
}
