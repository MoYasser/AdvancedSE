package GUI;

import Func.Appointment;
import Func.Manage;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class DAppointments {
    public Button backBtn;
    public TextField patientTxt;
    Manage manage = new Manage();
    public TextField appointmentIDTxt;
    public TextField docTxt;
    public TextField nurseTxt;
    public TextField priceTxt;
    public TextField diseaseTxt;
    public Button saveBtn;

    public void saveAppointment(ActionEvent actionEvent) throws IOException {
        Appointment appointment = new Appointment();
        appointment.setAppointmentID(appointmentIDTxt.getText());
        appointment.getSupervisingDr().setName(docTxt.getText());
        appointment.getAssistingNurse().setName(nurseTxt.getText());
        appointment.getPatient().setName(patientTxt.getText());
        appointment.setPrice(priceTxt.getText());
        appointment.setDisease(diseaseTxt.getText());
        manage.appointments.add(appointment);
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
