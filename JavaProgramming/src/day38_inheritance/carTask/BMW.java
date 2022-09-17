package day38_inheritance.carTask;

public class BMW extends Car{
    public BMW(String brand, String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public BMW(String x5, int i, int year, String red, int i1) {
        super(x5, i, year, red, i1);
    }

    public void breaksDown(){
        System.out.println(brand+" "+model+" is breaking down");
    }


    public void racing(){
        System.out.println(brand+" "+model+" is racing");
    }


}
