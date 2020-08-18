package Func;

import java.util.Date;

public class Account {
    static Manage manage = new Manage();
    String name,nationalID,phoneNo,email,address;
    Date DOB;

    public void addAccount(){

    }

    public Date getDOB() {
        return DOB;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getNationalID() {
        return nationalID;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
