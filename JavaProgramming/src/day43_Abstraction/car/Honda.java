package day43_Abstraction.car;

public class Honda extends Car{

    public Honda( String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }



    public void start(){
        System.out.println("Twist the key to ignition");
    }

    public void autoPark(){
        System.out.println(getBrand()+" "+getModel()+" has auto park feature");
    }

    public void autoPilot(){
        System.out.println(getBrand()+" "+getModel()+" has auto pilot feature");
    }


}
