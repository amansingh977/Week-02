package day6.problem_statement.ride_hailing_application;

// Subclass Auto implementing Vehicle and GPS
public class Auto extends Vehicle implements GPS {
    private static final double AUTO_RATE_PER_KM = 12.0; // Example rate for Auto

    private String currentLocation;

    // Constructor
    public Auto(String vehicleId, String driverName) {
        super(vehicleId, driverName, AUTO_RATE_PER_KM);
    }

    // Implement calculateFare (based on auto rate per km)
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    // Implement getCurrentLocation
    @Override
    public void getCurrentLocation() {
        System.out.println("Current Location of Auto: " + currentLocation);
    }

    // Implement updateLocation
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Updated Location of Auto: " + currentLocation);
    }
}

