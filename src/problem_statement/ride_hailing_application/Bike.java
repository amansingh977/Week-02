package day6.problem_statement.ride_hailing_application;

// Subclass Bike implementing Vehicle and GPS
public class Bike extends Vehicle implements GPS {
    private static final double BIKE_RATE_PER_KM = 10.0; // Example rate for Bike

    private String currentLocation;

    // Constructor
    public Bike(String vehicleId, String driverName) {
        super(vehicleId, driverName, BIKE_RATE_PER_KM);
    }

    // Implement calculateFare (based on bike rate per km)
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    // Implement getCurrentLocation
    @Override
    public void getCurrentLocation() {
        System.out.println("Current Location of Bike: " + currentLocation);
    }

    // Implement updateLocation
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Updated Location of Bike: " + currentLocation);
    }
}

