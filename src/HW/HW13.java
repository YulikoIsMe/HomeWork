package HW;

import java.util.Scanner;

public class HW13 {
    public static void main(String[] args) {
        int day = 1;
        if (day >=1 && day<=5) {
            System.out.println("It's a weekday");
        }else if( day==6||day==7){
            System.out.println("It's a weekend");
        } else {
            System.out.println("Invalid day");
        }
        }
    }

