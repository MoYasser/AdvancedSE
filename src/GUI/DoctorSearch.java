package GUI;

import Func.Manage;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DoctorSearch {

    public Button searchBtn;
    public TextField appointmentID;

    public void searchApp(ActionEvent actionEvent) {
        int s;
        for(int i=0; i< Manage.appointments.size();i++){
            if(appointmentID.getText().equalsIgnoreCase(Manage.appointments.get(i).getAppointmentID())){
                s = i;
            }
        }
    }

}
