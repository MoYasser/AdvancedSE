package Func;

import GUI.AdminView;

import java.util.ArrayList;

public class Manage {
    static public ArrayList<Admin> admins = new ArrayList<Admin>();
    static public ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    static public ArrayList<Receptionist> receptionists = new ArrayList<Receptionist>();
    static public ArrayList<Patient> patients = new ArrayList<Patient>();
    static public ArrayList<Nurse> nurses = new ArrayList<Nurse>();
    static public ArrayList<Appointment> appointments = new ArrayList<Appointment>();
    static public ArrayList<Case> cases = new ArrayList<Case>();
    static int currentRegIndex;

    public static void setCurrentRegIndex(int currentRegIndex) {
        Manage.currentRegIndex = currentRegIndex;
    }

    public static int getCurrentRegIndex() {
        return currentRegIndex;
    }
}
