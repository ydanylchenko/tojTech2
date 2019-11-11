package day10.returnTypes;

import java.util.ArrayList;
import java.util.List;

public class PatientsList {
    private List<Patient> patientsList = new ArrayList<>();

    public List<Patient> getPatientsList() {
        return patientsList;
    }

    public List<String> getPatientsNames() {
        List<String> names = new ArrayList<>();
        for (Patient patient : patientsList) {
            String patientName = patient.getNameAsString();
            names.add(patientName);
        }
        return names;
    }

    public int getPatientsAmount() {
        return patientsList.size();
    }

    public Patient getPatient(int id) {
        return patientsList.get(id);
    }

    public void addPatient(Patient patient) {
        patientsList.add(patient);
    }
}
