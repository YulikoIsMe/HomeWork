package HW13;

public class hw2 {
    public static void main(String[] args) {
      //How would you check if String is palindrome or not? aba=> true
        //Abbc =>false

        String str = "aba", reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }

    }

