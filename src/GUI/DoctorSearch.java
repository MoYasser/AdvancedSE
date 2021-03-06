package GUI;

import Func.Appointment;
import Func.Manage;
import Func.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class DoctorSearch {
    static Manage manage = new Manage();

    public Button searchBtn;
    public TextField appointmentID;
    public TextField PriceTxt;
    public TextField DiseaseTxt;
    public TextField NurseNameTxt;
    public TextField DocsNameTxt;
    public Button setBtn;
    public Button backBtn;
    public TextField patientTxt;
    int s = 0;

    public void searchApp(ActionEvent actionEvent) {

        for(int i=0; i< manage.appointments.size();i++){
            if(appointmentID.getText().equalsIgnoreCase(manage.appointments.get(i).getAppointmentID())){
                s = i;
            }
        }
        appointmentID.setText(manage.appointments.get(s).getAppointmentID());
        PriceTxt.setText(manage.appointments.get(s).getPrice());
        DiseaseTxt.setText(manage.appointments.get(s).getDisease());
        NurseNameTxt.setText(manage.appointments.get(s).getAssistingNurse().getName());
        DocsNameTxt.setText(manage.appointments.get(s).getSupervisingDr().getName());
        patientTxt.setText(manage.appointments.get(s).getPatient().getName());
    }

    public void SetData(ActionEvent actionEvent) throws IOException {
        manage.appointments.get(s).setAppointmentID(appointmentID.getText());
        manage.appointments.get(s).getSupervisingDr().setName(DocsNameTxt.getText());
        manage.appointments.get(s).getAssistingNurse().setName(NurseNameTxt.getText());
        manage.appointments.get(s).getPatient().setName(patientTxt.getText());
        manage.appointments.get(s).setPrice(PriceTxt.getText());
        manage.appointments.get(s).setDisease(DiseaseTxt.getText());
        Parent rooto = FXMLLoader.load(getClass().getResource("RegSuccess.fxml"));
        Stage successStage = new Stage();
        successStage.setTitle("HCC System");
        successStage.setScene(new Scene(rooto, 400, 200));
        successStage.setResizable(false);
        successStage.show();
    }
    public void getBack(ActionEvent actionEvent) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("DoctorView.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) backBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }
}
