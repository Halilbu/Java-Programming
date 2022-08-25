package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

        Honda honda = new Honda("Accord","Black",2012,20000.0);
        Audi audi = new Audi("A3","Blue",2003,6000.0);
        Tesla tesla = new Tesla("model 3", "red", 2019, 40000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


        System.out.println("------------------------------------");

        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Green");

        honda.setPrice(25000);
        audi.setPrice(40000);
        tesla.setPrice(55000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);



    }


}
