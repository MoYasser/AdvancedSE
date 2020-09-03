package Func;

import java.io.File;

public class Nurse extends Account {
    static Manage manage = new Manage();
    String ID,Username,Password,speciality;
    String salary;
    File schedule;

    public void acceptTask(Appointment app){

    }
    public void declineTask(Appointment app){

    }
    public File checkSchedule(){
        return schedule;
    }
    public String checkSalary(){
        return salary;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
