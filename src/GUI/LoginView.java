package GUI;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import Func.Manage;
import java.io.IOException;

public class LoginView {
    static Manage manage = new Manage();
    public Label warningLabel;
    public TextField usernameTxt;
    public TextField passwordTxt;
    public Button loginBtn;
    public Button registerBtn;


    public void Login(ActionEvent actionEvent) throws IOException {
        for(int i=0; i<manage.admins.size();i++){
            if(usernameTxt.getText().equalsIgnoreCase(manage.admins.get(i).getUsername())&&passwordTxt.getText().equalsIgnoreCase(manage.admins.get(i).getPassword())){
                Parent viewParent = FXMLLoader.load(getClass().getResource("AdminView.fxml"));
                Scene viewScene = new Scene(viewParent);
                Stage primaryStage = (Stage) loginBtn.getScene().getWindow();
                primaryStage.setScene(viewScene);
                break;
            }else{
                warningLabel.setVisible(true);
                break;
            }
        }
    }

    public void startRegisterView(ActionEvent actionEvent) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("RegisterView.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) loginBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }
}
