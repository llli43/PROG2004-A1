public class Appointment {
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional doctor;

    public Appointment() {
        this.patientName = "Unknown";
        this.patientMobile = "Unknown";
        this.timeSlot = "Unknown";
        this.doctor = null;
    }

    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    public void printAppointmentDetails() {
        System.out.println("=== Appointment Details ===");
        System.out.println("Patient: " + patientName);
        System.out.println("Mobile: " + patientMobile);
        System.out.println("Time: " + timeSlot);
        System.out.println("Doctor Details:");
        if (doctor != null) {
            doctor.printDetails();
        }
        System.out.println("===========================");
    }

    public String getPatientName() { return patientName; }
    public String getPatientMobile() { return patientMobile; }
    public String getTimeSlot() { return timeSlot; }
    public HealthProfessional getDoctor() { return doctor; }
}
