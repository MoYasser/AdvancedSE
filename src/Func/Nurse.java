package Func;

import java.io.File;

public class Nurse extends Account {
    static System system = new System();
    String ID,Username,Password,speciality;
    Double salary;
    File schedule;

    public void acceptTask(Appointment app){

    }
    public void declineTask(Appointment app){

    }
    public File checkSchedule(){
        return schedule;
    }
    public double checkSalary(){
        return salary;
    }
}
