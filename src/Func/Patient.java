package Func;

import java.util.ArrayList;

public class Patient extends Account{
    static System system = new System();
    String ID;
    ArrayList<Appointment> pastAppointments;
    ArrayList<Payment> payments;
    ArrayList<String> Allergies;
    ArrayList<String> chronicIllness;

    Patient(){
        pastAppointments = new ArrayList<Appointment>();
        payments = new ArrayList<Payment>();
        Allergies = new ArrayList<String>();
        chronicIllness = new ArrayList<String>();
    }
}
