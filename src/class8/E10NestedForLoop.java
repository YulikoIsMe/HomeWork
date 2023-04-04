package class8;

public class E10NestedForLoop {
    public static void main(String[] args) {


        int counter=0;
        while (counter<4) {
            for (int i = 2; i <= 10; i = i + 2) {
                System.out.print(i + " ");
            }
            System.out.println();

            counter++;
        }
        /*for (int i = 2; i <=10 ; i+=2) {
            for (int j = 2; j <=10; j+=2) {
                System.out.print(j+" ");
            }
            System.out.println();*/

        }
        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i);


            }
            System.out.println();*/
        }
