package day8.returnTypes;

public class ReturnTypeUsages {
    public static void main(String[] args) {
        PatientsList patients = new PatientsList();
        Patient bilbo = new Patient(15, 23.4, true, "Bilbo");
//        getAgeAsInt returns int
        int patientAge = bilbo.getAgeAsInt();
        System.out.println("Age of patient is: " + patientAge);
//        getWeightAsFloat returns float
        System.out.println("Weight of patient is: " + bilbo.getWeightAsFloat());
//        isAliveAsBoolean returns boolean
        System.out.println("is patient alive: " + bilbo.isAliveAsBoolean());
//        getNameAsString returns String
        System.out.println("patient name is: " + bilbo.getNameAsString());
//        Add patient returns nothing -> void
        patients.addPatient(bilbo);
        System.out.println("amount of patients:");
//        Returns integer amount of patients
        int patientsAmount = patients.getPatientsAmount();
        System.out.println("amount of patients:" + patientsAmount);
//        Put a patient without having a variable defined:
        patients.addPatient(new Patient(547, 10.0, false, "Lich King"));

//        patients amount variable is already defined, in order to update value stored in it we
        patientsAmount = patients.getPatientsAmount();
        System.out.println("amount of patients:" + patientsAmount);

    }
}
