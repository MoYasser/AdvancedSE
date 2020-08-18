package Func;

import java.util.ArrayList;
import java.util.Date;

public class Case {
    static Manage manage = new Manage();
    Patient patient;
    ArrayList<String> symptoms;
    ArrayList<String> preExistingCondition;
    Date date;

    Case(){
        patient = new Patient();
        symptoms = new ArrayList<String>();
        preExistingCondition = new ArrayList<String>();
    }
}
