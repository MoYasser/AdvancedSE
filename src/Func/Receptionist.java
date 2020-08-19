package Func;

import java.io.File;
import java.util.Scanner;

public class Receptionist extends Account {
    Scanner scan=new Scanner(System.in);
    static Manage manage = new Manage();
    String ID,Username,Password;
    Double salary;
    File schedule;


    public void setCase(){
    Manage.cases.add(new Case());
    String id= scan.nextLine();

    }
    private Doctor getDR(String ID){
        return manage.doctors.get(2);//TO BE EDITED
    }
    public void setSchedule(Doctor doc){

    }
    public void setSchedule(Nurse n){

    }

    public String getPassword() {
        return Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
