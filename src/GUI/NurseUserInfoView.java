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

public class NurseUserInfoView {
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
        Parent viewParent = FXMLLoader.load(getClass().getResource("NurseView.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) logOutBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }
    public void initialize(){
        nameTxt.setText(manage.nurses.get(index).getName());
        nIDTxt.setText(manage.nurses.get(index).getNationalID());
        emailTxt.setText(manage.nurses.get(index).getEmail());
        addressTxt.setText(manage.nurses.get(index).getAddress());
        phoneNoTxt.setText(manage.nurses.get(index).getPhoneNo());
        IDTxt.setText(manage.nurses.get(index).getID());
        userTxt.setText(manage.nurses.get(index).getUsername());
        salaryTxt.setText(manage.nurses.get(index).getSalary());
        passwordTxt.setText(manage.nurses.get(index).getPassword());
    }
}
