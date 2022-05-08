/* 
Create your own implementation to show how design pattern works.
Create your class to show working of
	1. Singleton pattern
	2.Factory Pattern
	3.Prototype Pattern
*/

abstract class Vehicle{
    abstract void runVehicle();
}

class Car extends Vehicle{
    @Override
    void runVehicle(){
        System.out.println("Running Car");
    }
}

class Truck extends Vehicle{
    @Override
    void runVehicle(){
        System.out.println("Running Truck");
    }
}

class FactoryVehicle{
    static Vehicle getVehicle(String vehicleName){
        Vehicle obj = null;

        if(vehicleName.equalsIgnoreCase("Car")){
            obj = new Car();
        }
        else if(vehicleName.equalsIgnoreCase("Truck")){
            obj = new Truck();
        }
        return obj;
    }
}

public class FactoryPattern{
    public static void main(String[] args) {
        
        Vehicle v1 = FactoryVehicle.getVehicle("Truck");
        // Vehicle v2 = FactoryVehicle.getVehicle("Truck");

        v1.runVehicle();
        // v2.runVehicle();
    }
}