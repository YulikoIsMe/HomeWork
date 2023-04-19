package Project1;

public class Assignment9 {
    public static void main(String[] args) {
        int [] numbers={23,41,55,66,999};
        int secondLargest=0;
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (i>j){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
                
            }
        }
        System.out.println(numbers[numbers.length-2]);



    }
}
