package Func;

import java.util.ArrayList;
import java.util.Date;

public class Appointment {
    static Manage manage = new Manage();
    Doctor supervisingDr;
    Nurse assistingNurse;
    Patient patient;
    Case aCase;
    String AppointmentID,disease;
    ArrayList<String> medication;
    Boolean followUp,complete;
    Date followUpDate;
    String price;

    public Appointment(){
        supervisingDr = new Doctor();
        assistingNurse = new Nurse();
        aCase = new Case();
        medication = new ArrayList<String>();
    }

    public String getAppointmentID() {
        return AppointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        AppointmentID = appointmentID;
    }

    public Doctor getSupervisingDr() {
        return supervisingDr;
    }

    public Nurse getAssistingNurse() {
        return assistingNurse;
    }

    public String getDisease() {
        return disease;
    }

    public String getPrice() {
        return price;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}

