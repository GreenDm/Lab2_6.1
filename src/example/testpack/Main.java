package example.testpack;

import com.brainacad.carpack.Car;
import example.applepack.Apple;

/**
 * Created by m18 on 26.02.2016.
 */
public class Main {
    public static void main(String[] args) {


        Apple apple1=new Apple();
        Car car1 = new Car();

        apple1.setMass(10.5);
        car1.setMass(45.2);

        System.out.println("Apple1 weight " + apple1.getMass());
        System.out.println("Car1 weight "+ car1.getWeight());
    }
}
