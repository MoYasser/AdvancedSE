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

public class EditUserView {
    static Manage manage = new Manage();
    public Button searchIDBtn;
    public Button backBtn;
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
    Stage successStage = new Stage();
    int s =0;

    public void initialize(){
        userTypeChoice.setItems(userTypeList);
    }

    public void registerUser(ActionEvent actionEvent) throws IOException {
        switch ((String)userTypeChoice.getValue()){
            case "Receptionist":
                int p=0;
                for(int i=0; i< manage.receptionists.size();i++){
                    if(IDTxt.getText().equalsIgnoreCase(manage.receptionists.get(i).getID())){
                        p = i;
                    }
                }
                manage.receptionists.get(p).setID(IDTxt.getText());
                manage.receptionists.get(p).setName(nameTxt.getText());
                manage.receptionists.get(p).setNationalID(nIDTxt.getText());
                manage.receptionists.get(p).setPhoneNo(phoneNoTxt.getText());
                manage.receptionists.get(p).setEmail(emailTxt.getText());
                manage.receptionists.get(p).setAddress(addressTxt.getText());
                manage.receptionists.get(p).setUsername(userTxt.getText());
                manage.receptionists.get(p).setPassword(passwordTxt.getText());
                manage.receptionists.get(p).setSalary(salaryTxt.getText());
                Parent root = FXMLLoader.load(getClass().getResource("RegSuccess.fxml"));
                successStage.setTitle("HCC System");
                successStage.setScene(new Scene(root, 400, 200));
                successStage.setResizable(false);
                successStage.show();
                break;
            case "Doctor":
                int k=0;
                for(int i=0; i< manage.doctors.size();i++){
                    if(IDTxt.getText().equalsIgnoreCase(manage.doctors.get(i).getID())){
                        k = i;
                    }
                }
                manage.doctors.get(k).setID(IDTxt.getText());
                manage.doctors.get(k).setName(nameTxt.getText());
                manage.doctors.get(k).setNationalID(nIDTxt.getText());
                manage.doctors.get(k).setPhoneNo(phoneNoTxt.getText());
                manage.doctors.get(k).setEmail(emailTxt.getText());
                manage.doctors.get(k).setAddress(addressTxt.getText());
                manage.doctors.get(k).setUsername(userTxt.getText());
                manage.doctors.get(k).setPassword(passwordTxt.getText());
                manage.doctors.get(k).setSalary(salaryTxt.getText());
                Parent rooty = FXMLLoader.load(getClass().getResource("RegSuccess.fxml"));
                successStage.setTitle("HCC System");
                successStage.setScene(new Scene(rooty, 400, 200));
                successStage.setResizable(false);
                successStage.show();
                break;
            case "Nurse":
                int n=0;
                for(int i=0; i< manage.nurses.size();i++){
                    if(IDTxt.getText().equalsIgnoreCase(manage.nurses.get(i).getID())){
                        n = i;
                    }
                }
                manage.nurses.get(n).setID(IDTxt.getText());
                manage.nurses.get(n).setName(nameTxt.getText());
                manage.nurses.get(n).setNationalID(nIDTxt.getText());
                manage.nurses.get(n).setPhoneNo(phoneNoTxt.getText());
                manage.nurses.get(n).setEmail(emailTxt.getText());
                manage.nurses.get(n).setAddress(addressTxt.getText());
                manage.nurses.get(n).setUsername(userTxt.getText());
                manage.nurses.get(n).setPassword(passwordTxt.getText());
                manage.nurses.get(n).setSalary(salaryTxt.getText());
                Parent roott = FXMLLoader.load(getClass().getResource("RegSuccess.fxml"));
                successStage.setTitle("HCC System");
                successStage.setScene(new Scene(roott, 400, 200));
                successStage.setResizable(false);
                successStage.show();
                break;
            case "Patient":
                int o=0;
                for(int i=0; i< manage.patients.size();i++){
                    if(IDTxt.getText().equalsIgnoreCase(manage.patients.get(i).getID())){
                        o = i;
                    }
                }
                manage.patients.get(o).setID(IDTxt.getText());
                manage.patients.get(o).setName(nameTxt.getText());
                manage.patients.get(o).setNationalID(nIDTxt.getText());
                manage.patients.get(o).setPhoneNo(phoneNoTxt.getText());
                manage.patients.get(o).setEmail(emailTxt.getText());
                manage.patients.get(o).setAddress(addressTxt.getText());
                Parent rooto = FXMLLoader.load(getClass().getResource("RegSuccess.fxml"));
                successStage.setTitle("HCC System");
                successStage.setScene(new Scene(rooto, 400, 200));
                successStage.setResizable(false);
                successStage.show();
                break;
        }
    }

    public void findUser(ActionEvent actionEvent) {
        switch ((String)userTypeChoice.getValue()){
            case "Receptionist":
                int p=0;
                for(int i=0; i< manage.receptionists.size();i++){
                    if(IDTxt.getText().equalsIgnoreCase(manage.receptionists.get(i).getID())){
                        p = i;
                    }
                }
                nameTxt.setText(manage.receptionists.get(p).getName());
                nIDTxt.setText(manage.receptionists.get(p).getNationalID());
                phoneNoTxt.setText(manage.receptionists.get(p).getPhoneNo());
                emailTxt.setText(manage.receptionists.get(p).getEmail());
                addressTxt.setText(manage.receptionists.get(p).getAddress());
                userTxt.setText(manage.receptionists.get(p).getUsername());
                passwordTxt.setText(manage.receptionists.get(p).getPassword());
                salaryTxt.setText(manage.receptionists.get(p).getSalary());
                break;
            case "Doctor":
                int k=0;
                for(int i=0; i< manage.doctors.size();i++){
                    if(IDTxt.getText().equalsIgnoreCase(manage.doctors.get(i).getID())){
                        k = i;
                    }
                }
                nameTxt.setText(manage.doctors.get(k).getName());
                nIDTxt.setText(manage.doctors.get(k).getNationalID());
                phoneNoTxt.setText(manage.doctors.get(k).getPhoneNo());
                emailTxt.setText(manage.doctors.get(k).getEmail());
                addressTxt.setText(manage.doctors.get(k).getAddress());
                userTxt.setText(manage.doctors.get(k).getUsername());
                passwordTxt.setText(manage.doctors.get(k).getPassword());
                salaryTxt.setText(manage.doctors.get(k).getSalary());
                break;
            case "Nurse":
                int n=0;
                for(int i=0; i< manage.nurses.size();i++){
                    if(IDTxt.getText().equalsIgnoreCase(manage.nurses.get(i).getID())){
                        n = i;
                    }
                }
                nameTxt.setText(manage.nurses.get(n).getName());
                nIDTxt.setText(manage.nurses.get(n).getNationalID());
                phoneNoTxt.setText(manage.nurses.get(n).getPhoneNo());
                emailTxt.setText(manage.nurses.get(n).getEmail());
                addressTxt.setText(manage.nurses.get(n).getAddress());
                userTxt.setText(manage.nurses.get(n).getUsername());
                passwordTxt.setText(manage.nurses.get(n).getPassword());
                salaryTxt.setText(manage.nurses.get(n).getSalary());
                break;
            case "Patient":
                int o=0;
                for(int i=0; i< manage.patients.size();i++){
                    if(IDTxt.getText().equalsIgnoreCase(manage.patients.get(i).getID())){
                        o = i;
                    }
                }
                nameTxt.setText(manage.patients.get(o).getName());
                nIDTxt.setText(manage.patients.get(o).getNationalID());
                phoneNoTxt.setText(manage.patients.get(o).getPhoneNo());
                emailTxt.setText(manage.patients.get(o).getEmail());
                addressTxt.setText(manage.patients.get(o).getAddress());
                break;
        }

    }

    public void BackToAdmin(ActionEvent actionEvent) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("AdminView.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) backBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }
}
