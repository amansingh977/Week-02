package day6.problem_statement.ride_hailing_application;

// Subclass Car implementing Vehicle and GPS
public class Car extends Vehicle implements GPS {
    private static final double CAR_RATE_PER_KM = 15.0; // Example rate for Car

    private String currentLocation;

    // Constructor
    public Car(String vehicleId, String driverName) {
        super(vehicleId, driverName, CAR_RATE_PER_KM);
    }

    // Implement calculateFare (based on car rate per km)
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    // Implement getCurrentLocation
    @Override
    public void getCurrentLocation() {
        System.out.println("Current Location of Car: " + currentLocation);
    }

    // Implement updateLocation
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Updated Location of Car: " + currentLocation);
    }
}

