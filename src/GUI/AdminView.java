package GUI;

import Func.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminView {
    Stage successStage = new Stage();
    static Manage manage = new Manage();
    ObservableList<String> userTypeList = FXCollections.observableArrayList("Receptionist","Doctor","Nurse","Patient");
    public TextField nameTxt;
    public TextField nIDTxt;
    public TextField phoneNoTxt;
    public TextField emailTxt;
    public TextField addressTxt;
    public TextField IDTxt;
    public TextField userTxt;
    public TextField passwordTxt;
    public Button registerBtn;
    public TextField salaryTxt;
    public ChoiceBox userTypeChoice;
    public Button logOutBtn;

    public void initialize(){
        userTypeChoice.setItems(userTypeList);
    }
    public void registerUser(ActionEvent actionEvent) throws IOException {
        switch ((String)userTypeChoice.getValue()){
            case "Receptionist":
                int p = manage.receptionists.size();
                manage.receptionists.add(new Receptionist());
                manage.receptionists.get(p).setID(IDTxt.getText());
                manage.receptionists.get(p).setName(nameTxt.getText());
                manage.receptionists.get(p).setNationalID(nIDTxt.getText());
                manage.receptionists.get(p).setPhoneNo(phoneNoTxt.getText());
                manage.receptionists.get(p).setEmail(emailTxt.getText());
                manage.receptionists.get(p).setAddress(addressTxt.getText());
                manage.receptionists.get(p).setUsername(userTxt.getText());
                manage.receptionists.get(p).setPassword(passwordTxt.getText());
                Parent root = FXMLLoader.load(getClass().getResource("RegSuccess.fxml"));
                successStage.setTitle("HCC System");
                successStage.setScene(new Scene(root, 400, 200));
                successStage.setResizable(false);
                successStage.show();
                break;
            case "Doctor":
                int i = manage.doctors.size();
                manage.doctors.add(new Doctor());
                manage.doctors.get(i).setID(IDTxt.getText());
                manage.doctors.get(i).setName(nameTxt.getText());
                manage.doctors.get(i).setNationalID(nIDTxt.getText());
                manage.doctors.get(i).setPhoneNo(phoneNoTxt.getText());
                manage.doctors.get(i).setEmail(emailTxt.getText());
                manage.doctors.get(i).setAddress(addressTxt.getText());
                manage.doctors.get(i).setUsername(userTxt.getText());
                manage.doctors.get(i).setPassword(passwordTxt.getText());
                Parent rooty = FXMLLoader.load(getClass().getResource("RegSuccess.fxml"));
                successStage.setTitle("HCC System");
                successStage.setScene(new Scene(rooty, 400, 200));
                successStage.setResizable(false);
                successStage.show();
                break;
            case "Nurse":
                int n = manage.nurses.size();
                manage.nurses.add(new Nurse());
                manage.nurses.get(n).setID(IDTxt.getText());
                manage.nurses.get(n).setName(nameTxt.getText());
                manage.nurses.get(n).setNationalID(nIDTxt.getText());
                manage.nurses.get(n).setPhoneNo(phoneNoTxt.getText());
                manage.nurses.get(n).setEmail(emailTxt.getText());
                manage.nurses.get(n).setAddress(addressTxt.getText());
                manage.nurses.get(n).setUsername(userTxt.getText());
                manage.nurses.get(n).setPassword(passwordTxt.getText());
                Parent roott = FXMLLoader.load(getClass().getResource("RegSuccess.fxml"));
                successStage.setTitle("HCC System");
                successStage.setScene(new Scene(roott, 400, 200));
                successStage.setResizable(false);
                successStage.show();
                break;
            case "Patient":
                int t = manage.patients.size();
                manage.patients.add(new Patient());
                manage.patients.get(t).setID(IDTxt.getText());
                manage.patients.get(t).setName(nameTxt.getText());
                manage.patients.get(t).setNationalID(nIDTxt.getText());
                manage.patients.get(t).setPhoneNo(phoneNoTxt.getText());
                manage.patients.get(t).setEmail(emailTxt.getText());
                manage.patients.get(t).setAddress(addressTxt.getText());
                Parent rooto = FXMLLoader.load(getClass().getResource("RegSuccess.fxml"));
                successStage.setTitle("HCC System");
                successStage.setScene(new Scene(rooto, 400, 200));
                successStage.setResizable(false);
                successStage.show();
                break;
        }
    }

    public void logOut(ActionEvent actionEvent) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) logOutBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }
}
