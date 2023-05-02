package HW14;

public class Students {
    String name;
    String empID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students first=new Students();
        first.name="Yulia";
        first.empID="12345";
        first.numberOfStudents++;

        Students second=new Students();
        second.name="Ivana";
        second.empID="57575";
        second.numberOfStudents++;

        Students third=new Students();
        third.name="Elena";
        third.empID="8585858";
        third.numberOfStudents++;

        System.out.println(numberOfStudents);

    }
}
