package Func;

import java.io.File;

public class Doctor extends Account {
    static System system = new System();
    String ID,Username,Password,speciality;
    Double salary;
    File schedule;
    Room clinicRoom;

    Doctor(){
        clinicRoom = new Room();
    }

    public void acceptAppointment(Appointment app){

    }
    public void declineAppointment(Appointment app){

    }
    public File checkSchedule(){
        return schedule;
    }
    public double checkSalary(){
        return salary;
    }
    public void callNurse(){

    }
}
