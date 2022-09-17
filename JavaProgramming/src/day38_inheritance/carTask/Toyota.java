package day38_inheritance.carTask;

public class Toyota extends Car{

    public Toyota(String brand, String model, int year, double price, String color, int miles){
        super("Toyota", model, year, price, color, miles);
    }

    public Toyota(String highlander, int i, int year, String white, int i1) {
        super(highlander, i, year, white, i1);
    }

    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }


}
