package Func;

import java.io.File;

public class Receptionist extends Account {
    static Manage manage = new Manage();
    String ID,Username,Password;
    Double salary;
    File schedule;


    public void setCase(){
    Manage.cases.add(new Case());
    }
    public void setSchedule(Doctor doc){

    }
    public void setSchedule(Nurse n){

    }
}
