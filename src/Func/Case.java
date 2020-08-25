package Func;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Case {
    Scanner scan=new Scanner(System.in);
    static Manage manage = new Manage();
    Patient patient;
    ArrayList<String> symptoms;
    ArrayList<String> preExistingCondition;
    String Date;

    /*Case(){
        ///////////////ADDING Patient///////////////
        patient = new Patient();
        ///////////////ADDING SYMPTOMS///////////////
        symptoms = new ArrayList<String>();
        System.out.print("Please enter the number of symptoms you want to enter: ");
        int x = scan.nextInt();
        for(int i =0;i<x;i++){
            int j = i+1;
            System.out.print("Please enter the "+ j +" symptom: ");
            symptoms.add(scan.nextLine());
        }
        ///////////////ADDING Conditions///////////////
        preExistingCondition = new ArrayList<String>();
        System.out.print("Please enter the number of preexisting conditions you want to enter: ");
        int y = scan.nextInt();
        for(int i =0;i<y;i++){
            int j = i+1;
            System.out.print("Please enter the "+ j +" symptom: ");
            symptoms.add(scan.nextLine());
        }
        ///////////////ADDING Date///////////////
        System.out.print("Please Enter the Date of Appointment and time");
        Date=scan.nextLine();
    }*/
}
