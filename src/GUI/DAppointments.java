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
    Manage manage = new Manage();
    public TextField appointmentIDTxt;
    public TextField docTxt;
    public TextField nurseTxt;
    public TextField priceTxt;
    public TextField diseaseTxt;
    public Button saveBtn;

    public void saveAppointment(ActionEvent actionEvent) {
        Appointment appointment = new Appointment();
        appointment.setAppointmentID(appointmentIDTxt.getText());
        appointment.getSupervisingDr().setName(docTxt.getText());
        appointment.getAssistingNurse().setName(nurseTxt.getText());
        appointment.setPrice(priceTxt.getText());
        appointment.setDisease(diseaseTxt.getText());
        manage.appointments.add(appointment);
    }

    public void getBack(ActionEvent actionEvent) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("ReceptionistView.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) backBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }
}
