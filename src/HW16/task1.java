package HW16;

public class task1 {

        public static String reverseString(String str) {
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            return sb.toString();
        }

        public static void main(String[] args) {


            String originalString = "Jawa is insane!";
            String reversedString = task1.reverseString(originalString);
            System.out.println(reversedString);
        }
    }
