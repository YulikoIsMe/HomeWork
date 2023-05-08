package class16;

public class Person {
    private String password;

    public Person() {
    }

    private void printPassword(){
        System.out.println(password);
    }

    public static void main(String[] args) {
        Person farwa=new Person();
        farwa.password="12345";

    }
}
