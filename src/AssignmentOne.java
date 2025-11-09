import java.util.ArrayList;

public class AssignmentOne {
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("Part 3 – Using classes and objects");

        // 创建3个General Practitioner对象
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Smith", "Family Medicine", true);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Johnson", "General Practice", true);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Brown", "Internal Medicine", true);

        // 创建2个Pediatrician对象
        Pediatrician ped1 = new Pediatrician(201, "Dr. Wilson", "Child Health", 18);
        Pediatrician ped2 = new Pediatrician(202, "Dr. Davis", "Neonatology", 16);

        // 打印所有健康专业人员信息
        System.out.println("All Health Professionals:");
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        ped1.printDetails();
        ped2.printDetails();

        System.out.println("---");

        // Part 5 – Collection of appointments
        System.out.println("Part 5 – Collection of appointments");

        // 创建预约
        createAppointment("John Doe", "0412345678", "09:00", gp1);
        createAppointment("Jane Smith", "0498765432", "10:30", gp2);
        createAppointment("Mike Wilson", "0411223344", "14:00", ped1);
        createAppointment("Sarah Brown", "0433445566", "15:30", ped2);

        // 打印现有预约
        printExistingAppointments();

        // 取消一个预约
        cancelBooking("0498765432");

        // 再次打印以显示更新
        System.out.println("After cancellation:");
        printExistingAppointments();

        System.out.println("---");
    }

    public static void createAppointment(String patientName, String patientMobile,
                                         String timeSlot, HealthProfessional doctor) {
        if (patientName != null && !patientName.isEmpty() &&
                patientMobile != null && !patientMobile.isEmpty() &&
                timeSlot != null && !timeSlot.isEmpty() &&
                doctor != null) {

            Appointment newAppointment = new Appointment(patientName, patientMobile, timeSlot, doctor);
            appointments.add(newAppointment);
            System.out.println("Appointment created successfully for: " + patientName);
        } else {
            System.out.println("Error: All appointment information must be provided.");
        }
    }

    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            System.out.println("Current Appointments (" + appointments.size() + "):");
            for (int i = 0; i < appointments.size(); i++) {
                System.out.println("Appointment #" + (i + 1) + ":");
                appointments.get(i).printAppointmentDetails();
            }
        }
    }

    public static void cancelBooking(String patientMobile) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientMobile().equals(patientMobile)) {
                System.out.println("Cancelling appointment for: " + appointments.get(i).getPatientName());
                appointments.remove(i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Error: No appointment found with mobile number: " + patientMobile);
        }
    }
}