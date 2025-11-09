public class GeneralPractitioner extends HealthProfessional {
    private boolean canPrescribeMedication;
    
    public GeneralPractitioner() {
        super();
        this.canPrescribeMedication = true;
    }
    
    public GeneralPractitioner(int id, String name, String specialization, boolean canPrescribe) {
        super(id, name, specialization);
        this.canPrescribeMedication = canPrescribe;
    }
    
    @Override
    public void printDetails() {
        System.out.println("Health Professional Type: General Practitioner");
        super.printDetails();
        System.out.println("Can Prescribe Medication: " + canPrescribeMedication);
        System.out.println("------------------------");
    }
    
    public boolean canPrescribeMedication() { 
        return canPrescribeMedication; 
    }
}
