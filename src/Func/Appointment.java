package Func;

import java.util.ArrayList;
import java.util.Date;

public class Appointment {
    static Manage manage = new Manage();
    Doctor supervisingDr;
    Nurse assistingNurse;
    Case aCase;
    String AppointmentID,disease;
    ArrayList<String> medication;
    Boolean followUp,complete;
    Date followUpDate;
    Double price;

    public Appointment(){
        supervisingDr = new Doctor();
        assistingNurse = new Nurse();
        aCase = new Case();
        medication = new ArrayList<String>();
    }

    public void setAppointmentID(String appointmentID) {
        AppointmentID = appointmentID;
    }
}
