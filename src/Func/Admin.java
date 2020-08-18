package Func;

import java.util.Date;

public class Admin extends Account {
    static Manage manage = new Manage();
    String ID,Username,Password;
    Double salary;

    public void addDr(){
    }
    public void addNurse(){

    }
    public void addReceptionist(){

    }
    public void addPatient(){

    }
    public void setSalary(Account Personnel){

    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setUsername(String username) {
        Username = username;
    }


    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }
}
