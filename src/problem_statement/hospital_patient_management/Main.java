package day6.problem_statement.hospital_patient_management;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of patients
        List<Patient> patients = new ArrayList<>();

        // Create InPatient and OutPatient objects
        InPatient inPatient = new InPatient("IP001", "John Doe", 45, "Pneumonia", "No prior conditions");
        OutPatient outPatient = new OutPatient("OP001", "Jane Doe", 32, "Headache", "Mild cold in the past");

        // Add patients to the list
        patients.add(inPatient);
        patients.add(outPatient);

        // Process each patient and display details
        for (Patient patient : patients) {
            patient.getPatientDetails();

            // Calculate and display bill
            System.out.println("Bill: " + patient.calculateBill());

            // Add and view medical records
            if (patient instanceof MedicalRecord) {
                MedicalRecord medicalRecord = (MedicalRecord) patient;
                medicalRecord.addRecord("New Diagnosis: Flu");
                medicalRecord.viewRecords();
            }

            System.out.println("-----------------------------------");
        }
    }
}

