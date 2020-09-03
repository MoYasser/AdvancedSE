package GUI;

import Func.Manage;
import javafx.scene.control.Label;

public class DocSalaryView {
    static Manage manage = new Manage();
    public Label SalaryTxt;
    int index;

    public void initialize(){
        index = Manage.getCurrentRegIndex();
        SalaryTxt.setText(Manage.doctors.get(index).getSalary());
    }
}
