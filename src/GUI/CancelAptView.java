package GUI;

import Func.Manage;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CancelAptView {
    static Manage manage = new Manage();
    public Button searchBtn;
    public Button cancelAptBtn;
    public Button backBtn;
    public TextField appointmentID;
    int s =0;

    public void DeleteApt(ActionEvent actionEvent) throws IOException {
        for(int i=0; i< manage.appointments.size();i++){
            if(appointmentID.getText().equalsIgnoreCase(manage.appointments.get(i).getAppointmentID())){
                s = i;
            }
        }
        appointmentID.setText(manage.appointments.get(s).getAppointmentID());
        manage.appointments.remove(s);
        Parent rooto = FXMLLoader.load(getClass().getResource("RegSuccess.fxml"));
        Stage successStage = new Stage();
        successStage.setTitle("HCC System");
        successStage.setScene(new Scene(rooto, 400, 200));
        successStage.setResizable(false);
        successStage.show();
    }

    public void getBack(ActionEvent actionEvent) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("ReceptionistView.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) backBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }
}
