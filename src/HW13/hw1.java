package HW13;

public class hw1 {
    public static void main(String[] args) {
        // input=>This is sentence i want to reverse
        //output=>sihT si ecnetnes i tnaw ot esrever

        String word = "This is sentence i want to reverse";
        String reversedWord="";

        for(int i=word.length()-1;i>=0;i--){
            reversedWord = reversedWord + word.charAt(i);
        }

        System.out.println(" Reversed Word : "+reversedWord);
    }

}
/*String sentence="This is a sentence I want to reverse";
        StringBuilder stringBuildervariable=new StringBuilder();
        stringBuildervariable.append(sentence);
        stringBuildervariable.reverse();
        System.out.println(stringBuildervariable);*/


