package day6.problem_statement.ride_hailing_application;

// Interface GPS with methods to manage vehicle location
public interface GPS {
    void getCurrentLocation();
    void updateLocation(String newLocation);
}
