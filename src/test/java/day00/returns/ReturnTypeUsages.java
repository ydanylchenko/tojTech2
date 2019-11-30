package day00.returns;

public class ReturnTypeUsages {
    public static void main(String[] args) {
        PatientsList hospital = new PatientsList();
        Patient bilbo = new Patient(15, 23.4, true, "Bilbo");
//        getAgeAsInt returns int
        int patientAge = bilbo.getAgeAsInt();
        System.out.println("Age of patient is: " + patientAge);
//        getWeightAsFloat returns float
        System.out.println("Weight of patient is: " + bilbo.getWeightAsFloat());
//        isAliveAsBoolean returns boolean
        System.out.println("Is patient alive: " + bilbo.isAliveAsBoolean());
//        getNameAsString returns String
        System.out.println("Patient name is: " + bilbo.getNameAsString());
//        Add patient returns nothing -> void
        hospital.addPatient(bilbo);
        System.out.println("Amount of patients: ");
//        Returns integer amount of patients
        int patientsAmount = hospital.getPatientsAmount();
        System.out.println("Amount of patients: " + patientsAmount);
//        Put a patient without having a variable defined:
        hospital.addPatient(new Patient(547, 10.0, false, "Lich King"));

//        patients amount variable is already defined, in order to update value stored in it we
        patientsAmount = hospital.getPatientsAmount();
        System.out.println("Amount of patients: " + patientsAmount);
        System.out.println("Patients names: " + hospital.getPatientsNames());
    }
}
