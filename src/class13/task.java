package class13;

public class task {
    public static void main(String[] args) {
        //Create a String that will hold a sentence. Write a program to get a new String without any spaces.
        String str="Today is Sunday.We have Java class. We like Java";

        System.out.println(str.replaceAll(" ",""));
    }
}
