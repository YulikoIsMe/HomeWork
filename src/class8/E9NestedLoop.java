package class8;

public class E9NestedLoop {
    public static void main(String[] args) {
        for(int i=0;i<5;i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();

        }


        }
    }
    /*step 1: The outer loop initializes the loop variable i to 0, and runs as long as i is less than 5.
Step 2: For each value of i, the inner loop initializes the loop variable j to 0, and runs as long as j is less than 5.
Step 3: For each value of j, the inner loop prints an asterisk using the print() method of the System.out object.
Step 4: After the inner loop completes, the outer loop prints a newline character using the println() method of the System.out object, which moves the cursor to the next line.
Step 5: The outer loop continues to run, and repeats steps 2-4, until i is no longer less than 5.
The program terminates. this how logic works*/