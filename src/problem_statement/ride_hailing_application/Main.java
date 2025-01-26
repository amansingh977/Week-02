package day6.problem_statement.ride_hailing_application;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Create Car, Bike, and Auto objects
        Car car = new Car("V001", "John");
        Bike bike = new Bike("V002", "Alex");
        Auto auto = new Auto("V003", "Sam");

        // Add vehicles to the list
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Process each vehicle and display details
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();

            // Calculate and display fare for a given distance (e.g., 10 km)
            System.out.println("Fare for 10 km: " + vehicle.calculateFare(10));

            // Get and update location using GPS
            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                gps.getCurrentLocation();
                gps.updateLocation("New Location");
                gps.getCurrentLocation();
            }

            System.out.println("-----------------------------------");
        }
    }
}

