package GUI;

import Func.*;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ReceptionistView {
    Appointment appointment = new Appointment();
    static Manage manage = new Manage();
    public TableView appointmentsTable;
    public TableColumn idCol;
    public TableColumn doctorCol;
    public TableColumn diseaseCol;
    public TableColumn nurseCol;
    public TableColumn followUpCol;
    public TableColumn priceCol;

    public void initialize(){
        appointment.setAppointmentID("11654651");
        manage.appointments.add(appointment);
        idCol.setCellValueFactory(new PropertyValueFactory<Appointment,String>("AppointmentID"));
        doctorCol.setCellValueFactory(new PropertyValueFactory<Appointment, Doctor>("supervisingDr"));
        diseaseCol.setCellValueFactory(new PropertyValueFactory<Appointment,String>("disease"));
        nurseCol.setCellValueFactory(new PropertyValueFactory<Appointment, Nurse>("assistingNurse"));
        followUpCol.setCellValueFactory(new PropertyValueFactory<Appointment,Boolean>("followUp"));
        priceCol.setCellValueFactory(new PropertyValueFactory<Appointment,Double>("price"));
        appointmentsTable.getItems().setAll(manage.appointments);
    }
}
