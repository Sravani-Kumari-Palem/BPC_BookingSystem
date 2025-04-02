import java.util.List;

public class Patient {
    private int id;
    private String name;
    private String address;
    private String phone;
    private List<Appointment> appointments;

    public boolean bookAppointments(){
        return true;
    }
    public boolean cancelAppointment(){
        return true;
    }
    public boolean changeAppointment(){
        return true;
    }
}
