package GUI;

import Func.Manage;
import javafx.scene.control.Label;

public class ResSalaryView {
    static Manage manage = new Manage();
    public Label SalaryTxt;
    int index;

    public void initialize(){
        index = manage.getCurrentRegIndex();
        SalaryTxt.setText(manage.receptionists.get(index).getSalary());
    }
}
