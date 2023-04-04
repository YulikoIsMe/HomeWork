package class7;

import java.util.Scanner;

public class E1212 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the number greater than 1");
        int number=scan.nextInt();

        int counter=1;
        while (counter<=number){
            System.out.println(counter+" ");
            counter++;
        }

    }
}
