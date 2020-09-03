package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DoctorView {
    public Button logOutBtn;
    public Button editAppointment;
    public Button DocSalaryBtn;

    public void searchApp(ActionEvent actionEvent) throws IOException{
        Parent viewParent = FXMLLoader.load(getClass().getResource("DoctorSearch.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) editAppointment.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }
    public void logOut(ActionEvent actionEvent) throws IOException {
        Parent viewParent = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
        Scene viewScene = new Scene(viewParent);
        Stage primaryStage = (Stage) logOutBtn.getScene().getWindow();
        primaryStage.setScene(viewScene);
    }

    public void DocSalaryView(ActionEvent actionEvent) throws IOException {
        Parent rooto = FXMLLoader.load(getClass().getResource("DocSalaryView.fxml"));
        Stage successStage = new Stage();
        successStage.setTitle("HCC System");
        successStage.setScene(new Scene(rooto, 400, 200));
        successStage.setResizable(false);
        successStage.show();
    }
}
