public class HealthProfessional {
    private int id;
    private String name;
    private String specialization;

    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.specialization = "General";
    }

    public HealthProfessional(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
}