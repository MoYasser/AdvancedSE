package GUI;

import Func.Admin;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import Func.Manage;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterView {
    static Manage manage = new Manage();
    public TextField nameTxt;
    public TextField nIDTxt;
    public TextField phoneNoTxt;
    public TextField emailTxt;
    public TextField addressTxt;
    public TextField IDTxt;
    public TextField userTxt;
    public TextField passwordTxt;
    public Button registerBtn;

    public void registerAdmin(ActionEvent actionEvent) throws IOException {
        int i = manage.admins.size();
        manage.admins.add(new Admin());
        manage.admins.get(i).setID(IDTxt.getText());
        manage.admins.get(i).setName(nameTxt.getText());
        manage.admins.get(i).setNationalID(nIDTxt.getText());
        manage.admins.get(i).setPhoneNo(phoneNoTxt.getText());
        manage.admins.get(i).setEmail(emailTxt.getText());
        manage.admins.get(i).setAddress(addressTxt.getText());
        manage.admins.get(i).setUsername(userTxt.getText());
        manage.admins.get(i).setPassword(passwordTxt.getText());
        Parent viewParent = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) registerBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }
}
