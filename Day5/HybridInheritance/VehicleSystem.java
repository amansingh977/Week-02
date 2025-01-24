package HybridInheritance;
interface Refuelable {
    void refuel();
}

class Vehicle {
    String model;
    int maxSpeed;
    // create constructor
    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}

class ElectricVehicle extends Vehicle {
    // create constructor	
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    // display result
    void charge() {
        System.out.println(model + " is charging.");
        System.out.println(maxSpeed + " of this model");
		
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    // create constructor	
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    // display result
    public void refuel() {
        System.out.println(model + " is refueling with petrol.");
        System.out.println(maxSpeed + " of this model");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle electricCar = new ElectricVehicle("Tesla", 150);
        PetrolVehicle petrolCar = new PetrolVehicle("Honda", 120);

        electricCar.charge();
        petrolCar.refuel();
    }
}
