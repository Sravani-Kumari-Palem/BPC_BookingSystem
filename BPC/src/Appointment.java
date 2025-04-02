import java.time.LocalDateTime;

public class Appointment {
    private int id;
    private Treatment treatement;
    private LocalDateTime dateTime;
    private Patient patient;
    private Physiotherapist physiotherapist;
    private String status;

    public boolean bookAppointment(){
        return true;
    }
    public boolean cancelAppointment(){
        return true;
    }
    public void attendAppointment(){

    }
}
