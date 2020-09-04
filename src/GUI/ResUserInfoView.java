package GUI;

import Func.Manage;
import Func.Receptionist;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ResUserInfoView {
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
        Parent viewParent = FXMLLoader.load(getClass().getResource("ReceptionistView.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) logOutBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }
    public void initialize(){
        nameTxt.setText(manage.receptionists.get(index).getName());
        nIDTxt.setText(manage.receptionists.get(index).getNationalID());
        emailTxt.setText(manage.receptionists.get(index).getEmail());
        addressTxt.setText(manage.receptionists.get(index).getAddress());
        phoneNoTxt.setText(manage.receptionists.get(index).getPhoneNo());
        IDTxt.setText(manage.receptionists.get(index).getID());
        userTxt.setText(manage.receptionists.get(index).getUsername());
        salaryTxt.setText(manage.receptionists.get(index).getSalary());
        passwordTxt.setText(manage.receptionists.get(index).getPassword());
    }
}
