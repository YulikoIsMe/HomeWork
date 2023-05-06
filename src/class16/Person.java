package class16;

import java.util.Scanner;

public class Person {
    private String password;
    private void printPassword(){
        System.out.println(password);
    }

    public static void main(String[] args) {
        Person farwa=new Person();
        farwa.password="12345";

    }
}
