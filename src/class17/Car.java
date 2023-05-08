package class17;

public class Car {
String make;
String model;
int engineCC;
String color;
    Car(String make1,String model1,int engineCC1,String color1){
        this.make=make1;
        this.model=model1;
        this.engineCC=engineCC1;
        this.color=color1;
    }void printIngo(){
        System.out.println(make+" "+model+" "+engineCC+" "+color);
    }

    public static void main(String[] args) {
        Car car=new Car("Honda","Civic type1",1800,"white");
    car.printIngo();
    }

}
