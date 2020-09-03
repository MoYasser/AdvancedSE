package GUI;

import Func.Manage;
import javafx.scene.control.Label;

public class NurseSalaryView {
    static Manage manage = new Manage();
    public Label SalaryTxt;
    int index;

    public void initialize(){
        index = manage.getCurrentRegIndex();
        SalaryTxt.setText(manage.nurses.get(index).getSalary());
    }
}
