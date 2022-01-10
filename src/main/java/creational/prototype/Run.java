package creational.prototype;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);

            // enter the data
            String brand;
            System.out.println("Input brand of car: ");
            brand = in.nextLine();

            String model;
            System.out.println("Input model of car: ");
            model = in.nextLine();

            String color;
            System.out.println("Input color of car: ");
            color = in.nextLine();

            int year;
            System.out.println("Input year of car: ");
            year = in.nextInt();

            // object creation
            Car c = new Car(brand, model, color, year);
            System.out.println(c);
            ;

            System.out.println("Let's clone!\nLet's creational.prototype! ");

            // object cloning
            Car copy = (Car) c.CloneIt();
            System.out.println(copy);
            ;
        } catch (Exception ex) {
            System.out.println("Exception happened! Exception description " + ex.getMessage());
        }
    }
}
