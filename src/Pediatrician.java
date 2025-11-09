public class Pediatrician extends HealthProfessional {
    private int maxPatientAge;

    public Pediatrician() {
        super();
        this.maxPatientAge = 18;
    }

    public Pediatrician(int id, String name, String specialization, int maxPatientAge) {
        super(id, name, specialization);
        this.maxPatientAge = maxPatientAge;
    }

    @Override
    public void printDetails() {
        System.out.println("Health Professional Type: Pediatrician");
        super.printDetails();
        System.out.println("Max Patient Age: " + maxPatientAge);
        System.out.println("------------------------");
    }

    public int getMaxPatientAge() {
        return maxPatientAge;
    }
}