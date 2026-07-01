package Homework7.Task1;

public class Clinic {
    public static void main(String[] args) {
        System.out.println("\n    Работа клиники   \n");

        Therapist therapist = new Therapist();
        Patient patient = new Patient(1);
        System.out.println("Пациент пришел на осмотр к Терапевту \n");

        System.out.println("Вариант 1: План лечения = 1\n" + "Болит рука");
        therapist.assignDoctor(patient);
        System.out.println();

        System.out.println("Вариант 2: План лечения = 2\n" + "Болит зуб");
        patient.setTreatmentPlan(2);
        therapist.assignDoctor(patient);
        System.out.println();

        System.out.println("Вариант 3: План лечения = любой кроме 1 и 2\n" + "Кажется я простудился");
        patient.setTreatmentPlan(3);
        therapist.assignDoctor(patient);
        System.out.println();

    }
}
