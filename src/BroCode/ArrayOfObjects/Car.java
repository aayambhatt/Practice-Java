package BroCode.ArrayOfObjects;

public class Car {
    String name;
    String colour;

    // Constructor and constructor overloading
    Car(String name, String colour){
        this.name = name;
        this.colour = colour;
    }

    Car(String colour){
        this.colour = colour;
    }

    void drive(){
        System.out.println("You drive" +  " " +  this.colour + " " + this.name);
    }
}
