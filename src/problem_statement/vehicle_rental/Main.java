package day6.problem_statement.vehicle_rental;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Add Car, Bike, and Truck to the list
        Car car = new Car("MH01AB1234", "Sedan", 1500);
        Bike bike = new Bike("MH02BC5678", "Sport", 500);
        Truck truck = new Truck("MH03CD9101", "Heavy", 3000);

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        // Calculate and display rental and insurance details for each vehicle
        int rentalDays = 5; // Example: 5 days rental
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = (vehicle instanceof Insurable) ? ((Insurable) vehicle).calculateInsurance() : 0;

            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);
            if (vehicle instanceof Insurable) {
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
                System.out.println("Insurance Cost: " + insuranceCost);
            }
            System.out.println("-----------------------------------");
        }
    }
}
