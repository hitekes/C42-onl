package Homework7.Task1;

public class Therapist extends Doctor {
    @Override
    public void heal() {
        System.out.println("Терапевт лечит простуду");
    }

    public void assignDoctor(Patient patient) {
        int treatmentPlan = patient.getTreatmentPlan();
        Doctor assignedDoctor;

        if (treatmentPlan == 1) {
            assignedDoctor = new Surgeon();
        } else if (treatmentPlan == 2) {
            assignedDoctor = new Dentist();
        } else {
            assignedDoctor = new Therapist();
        }

        patient.setDoctor(assignedDoctor);

        String doctorName = assignedDoctor.getClass().getSimpleName();
        System.out.println("Терапевт назначает пациенту врача: " + doctorName);

        assignedDoctor.heal();
    }
}
