package day38_inheritance.carTask;

public class Tesla extends Car{
    public Tesla(String brand, String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public Tesla(String brand, int i, int year, String white, int i1) {
        super(brand, i, year, white, i1);
    }

    public void autoPilot(){
        System.out.println(brand+" "+model+" in autopilot mode");
    }




}
