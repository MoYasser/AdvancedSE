package Func;

import java.util.ArrayList;

public class Payment {
    static Manage manage = new Manage();
    ArrayList<String> appointments;
    Double subtotal,taxes,total;

    Payment(){
        appointments = new ArrayList<String>();
    }
}
