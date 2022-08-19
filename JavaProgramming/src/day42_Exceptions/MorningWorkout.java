package day42_Exceptions;

public class MorningWorkout {

    public static void main(String[] args) {

        System.out.println("----------Push up started----------");

        for (int i = 1; i < 101; i++) {


            System.out.print("\rPush up "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n-------Push ups completed-------");


        System.out.println("----------Pull up started----------");

        for (int i = 1; i < 31; i++) {


            System.out.print("\rPull up "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n-------Pull ups completed-------");


    }


}
