package GUI;

import Func.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistView {
    public Button addAppointmentBtn;
    Appointment appointment = new Appointment();
    static Manage manage = new Manage();
    public void initialize(){

    }

    public void addAppointment(ActionEvent actionEvent) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("DAppointments.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) addAppointmentBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }
}
