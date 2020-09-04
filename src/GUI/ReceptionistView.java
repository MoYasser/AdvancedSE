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
    public Button logOutBtn;
    public Button cancelAptBtn;
    public Button editAptBtn;
    public Button addPatientBtn;
    public Button salaryBtn;
    public Button resUserBtn;
    Appointment appointment = new Appointment();
    static Manage manage = new Manage();

    public ReceptionistView() throws IOException {
    }

    public void initialize(){

    }

    public void addAppointment(ActionEvent actionEvent) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("DAppointments.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) addAppointmentBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }

    public void logout(ActionEvent actionEvent) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) logOutBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }

    public void cancelAptView(ActionEvent actionEvent) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("CancelAptView.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) logOutBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }

    public void editAptView(ActionEvent actionEvent) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("EditAptView.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) logOutBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }

    public void addPatientView(ActionEvent actionEvent) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("AddPatientView.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) logOutBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);

    }

    public void ResSalaryBtn(ActionEvent actionEvent) throws IOException {
        Parent rooto = FXMLLoader.load(getClass().getResource("RegSalaryView.fxml"));
        Stage successStage = new Stage();
        successStage.setTitle("HCC System");
        successStage.setScene(new Scene(rooto, 400, 200));
        successStage.setResizable(false);
        successStage.show();
    }

    public void resUserView(ActionEvent actionEvent) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("ResUserInfoView.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) logOutBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }
}
