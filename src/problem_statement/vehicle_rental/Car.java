package day6.problem_statement.vehicle_rental;

// Subclass Car implementing Vehicle and Insurable
public class Car extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.05; // 5% of rental cost

    // Constructor
    public Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    // Implement calculateRentalCost
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Implement calculateInsurance
    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * INSURANCE_RATE; // Insurance for 1 day rental
    }

    // Implement getInsuranceDetails
    @Override
    public String getInsuranceDetails() {
        return "Insurance Rate: " + (INSURANCE_RATE * 100) + "% of 1-day rental cost";
    }
}
