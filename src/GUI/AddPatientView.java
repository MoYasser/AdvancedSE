package GUI;

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

public class AddPatientView {
    Manage manage = new Manage();
    public TextField nameTxt;
    public TextField nIDTxt;
    public TextField phoneNoTxt;
    public TextField emailTxt;
    public TextField addressTxt;
    public TextField IDTxt;
    public Button registerBtn;
    public Button logOutBtn;

    public void registerUser(ActionEvent actionEvent) throws IOException {
        int t = manage.patients.size();
        manage.patients.add(new Patient());
        manage.patients.get(t).setID(IDTxt.getText());
        manage.patients.get(t).setName(nameTxt.getText());
        manage.patients.get(t).setNationalID(nIDTxt.getText());
        manage.patients.get(t).setPhoneNo(phoneNoTxt.getText());
        manage.patients.get(t).setEmail(emailTxt.getText());
        manage.patients.get(t).setAddress(addressTxt.getText());
        Parent rooto = FXMLLoader.load(getClass().getResource("RegSuccess.fxml"));
        Stage successStage = new Stage();
        successStage.setTitle("HCC System");
        successStage.setScene(new Scene(rooto, 400, 200));
        successStage.setResizable(false);
        successStage.show();
    }

    public void logOut(ActionEvent actionEvent) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("ReceptionistView.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) logOutBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }
}
