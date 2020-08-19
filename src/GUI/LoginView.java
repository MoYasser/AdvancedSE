package GUI;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import Func.Manage;
import java.io.IOException;

public class LoginView {
    static Manage manage = new Manage();

    ObservableList<String> userTypeList = FXCollections.observableArrayList("Admin","Receptionist","Doctor","Nurse");

    public Label warningLabel;
    public TextField usernameTxt;
    public TextField passwordTxt;
    public Button loginBtn;
    public Button registerBtn;
    public ChoiceBox userTypeChoice;

    public void initialize(){
        userTypeChoice.setItems(userTypeList);
        userTypeChoice.setValue("None");
        warningLabel.setVisible(false);
    }
    public void Login(ActionEvent actionEvent) throws IOException {
        switch ((String)userTypeChoice.getValue()){
            case "Admin":
                for(int i=0; i<manage.admins.size();i++){
                    if(usernameTxt.getText().equalsIgnoreCase(manage.admins.get(i).getUsername())&&passwordTxt.getText().equalsIgnoreCase(manage.admins.get(i).getPassword())){
                        Parent viewParent = FXMLLoader.load(getClass().getResource("AdminView.fxml"));
                        Scene viewScene = new Scene(viewParent);
                        Stage primaryStage = (Stage) loginBtn.getScene().getWindow();
                        primaryStage.setScene(viewScene);
                        break;
                    }else{
                        warningLabel.setVisible(true);
                    }
                }
                break;
            case "Receptionist":
                for(int i=0; i<manage.receptionists.size();i++){
                    if(usernameTxt.getText().equalsIgnoreCase(manage.receptionists.get(i).getUsername())&&passwordTxt.getText().equalsIgnoreCase(manage.receptionists.get(i).getPassword())){
                        Parent viewParent = FXMLLoader.load(getClass().getResource("ReceptionistView.fxml"));
                        Scene viewScene = new Scene(viewParent);
                        Stage primaryStage = (Stage) loginBtn.getScene().getWindow();
                        primaryStage.setScene(viewScene);
                        break;
                    }else{
                        warningLabel.setVisible(true);
                        break;
                    }
                }
                break;
            case "Doctor":
                for(int i=0; i<manage.doctors.size();i++){
                    if(usernameTxt.getText().equalsIgnoreCase(manage.doctors.get(i).getUsername())&&passwordTxt.getText().equalsIgnoreCase(manage.doctors.get(i).getPassword())){
                        Parent viewParent = FXMLLoader.load(getClass().getResource("DoctorView.fxml"));
                        Scene viewScene = new Scene(viewParent);
                        Stage primaryStage = (Stage) loginBtn.getScene().getWindow();
                        primaryStage.setScene(viewScene);
                        break;
                    }else{
                        warningLabel.setVisible(true);
                        break;
                    }
                }
                break;
            case "Nurse":
                for(int i=0; i<manage.nurses.size();i++){
                    if(usernameTxt.getText().equalsIgnoreCase(manage.nurses.get(i).getUsername())&&passwordTxt.getText().equalsIgnoreCase(manage.nurses.get(i).getPassword())){
                        Parent viewParent = FXMLLoader.load(getClass().getResource("NurseView.fxml"));
                        Scene viewScene = new Scene(viewParent);
                        Stage primaryStage = (Stage) loginBtn.getScene().getWindow();
                        primaryStage.setScene(viewScene);
                        break;
                    }else{
                        warningLabel.setVisible(true);
                        break;
                    }
                }
                break;
            default:
                warningLabel.setText("Please choose a user type");
                warningLabel.setVisible(true);
        }
    }

    public void startRegisterView(ActionEvent actionEvent) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("RegisterView.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) loginBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }
}
