package day6.problem_statement.hospital_patient_management;

// Subclass InPatient implementing Patient and MedicalRecord
public class InPatient extends Patient implements MedicalRecord {
    private static final double DAILY_ROOM_COST = 500.0;
    private static final double TREATMENT_COST = 1000.0;
    private String diagnosis;
    private String medicalHistory;

    // Constructor
    public InPatient(String patientId, String name, int age, String diagnosis, String medicalHistory) {
        super(patientId, name, age);
        this.diagnosis = diagnosis;
        this.medicalHistory = medicalHistory;
    }

    // Implement calculateBill (hospitalization charges + treatment)
    @Override
    public double calculateBill() {
        // Assuming the patient stays for 5 days
        return DAILY_ROOM_COST * 5 + TREATMENT_COST;
    }

    // Implement addRecord
    @Override
    public void addRecord(String record) {
        // Logic to add record (here we just assign the given record as diagnosis)
        this.diagnosis = record;
        System.out.println("Medical Record Added: " + record);
    }

    // Implement viewRecords
    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Medical History: " + medicalHistory);
    }

    // Getter and Setter methods for diagnosis and medicalHistory
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}

