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

public class DocUserInfoView {
    static Manage manage = new Manage();
    int index = Manage.getCurrentRegIndex();
    public TextField nameTxt;
    public TextField nIDTxt;
    public TextField emailTxt;
    public TextField addressTxt;
    public TextField phoneNoTxt;
    public TextField IDTxt;
    public TextField userTxt;
    public TextField passwordTxt;
    public TextField salaryTxt;
    public Button logOutBtn;

    public void logOut(ActionEvent actionEvent) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("DoctorView.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) logOutBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }
    public void initialize(){
        nameTxt.setText(manage.doctors.get(index).getName());
        nIDTxt.setText(manage.doctors.get(index).getNationalID());
        emailTxt.setText(manage.doctors.get(index).getEmail());
        addressTxt.setText(manage.doctors.get(index).getAddress());
        phoneNoTxt.setText(manage.doctors.get(index).getPhoneNo());
        IDTxt.setText(manage.doctors.get(index).getID());
        userTxt.setText(manage.doctors.get(index).getUsername());
        salaryTxt.setText(manage.doctors.get(index).getSalary());
        passwordTxt.setText(manage.doctors.get(index).getPassword());
    }
}
