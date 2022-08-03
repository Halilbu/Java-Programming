package day39_recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        day39_Recap.shapeTask.Square square = new day39_Recap.shapeTask.Square(10);

        System.out.println(square);

        // square.side = -10000000;
        square.setSide( 15 );

        System.out.println(square);

        System.out.println(square.getName());

        System.out.println("------------------------");

        day39_Recap.shapeTask.Rectangle rectangle = new day39_Recap.shapeTask.Rectangle(5, 6);

        System.out.println(rectangle);

        rectangle.setLength(10);

        System.out.println( rectangle.getLength() );

        System.out.println( rectangle);

        System.out.println(rectangle.getName());

        System.out.println("------------------------");

        day39_Recap.shapeTask.Circle circle = new day39_Recap.shapeTask.Circle(7.5);

        System.out.println(circle);

        //circle.radius = 15.5;

        circle.setRadius(15.5);

        System.out.println( circle.getRadius() );

        System.out.println(circle);

        System.out.println(circle.getName());






    }


}