package class3;

public class E13TypeCasting {
    public static void main(String[] args) {
        byte num=127;
        short num2=num;
        System.out.println(num2);
        //no issues from smaller to bigger
        int num3=111120;
        double num4=num3;
        System.out.println(num4);
    }
}
