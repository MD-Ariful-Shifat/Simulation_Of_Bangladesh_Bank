package com.example.simulation_of_bangladesh_bank.shifat;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ManageCircularsNoticesController
{
    @javafx.fxml.FXML
    private TableColumn<ManageCircularsNotices, String> issueDateColumn;
    @javafx.fxml.FXML
    private TableColumn<ManageCircularsNotices, String> circularColumn;
    @javafx.fxml.FXML
    private TableColumn<ManageCircularsNotices, String> expireDateColumn;
    @javafx.fxml.FXML
    private TableColumn<ManageCircularsNotices, String> titleColumn;
    @javafx.fxml.FXML
    private TableColumn<ManageCircularsNotices, String> statusColumn;
    @javafx.fxml.FXML
    private TextField circularID2;
    @javafx.fxml.FXML
    private TextField titleID2;
    @javafx.fxml.FXML
    private TextField titleID1;
    @javafx.fxml.FXML
    private TextField circularID3;
    @javafx.fxml.FXML
    private TableView<ManageCircularsNotices> tableID;
    @javafx.fxml.FXML
    private TextField circularID1;
    @javafx.fxml.FXML
    private DatePicker expireDate;
    @javafx.fxml.FXML
    private DatePicker issueDate;
    @javafx.fxml.FXML
    private ComboBox<String> statusID1;
    @javafx.fxml.FXML
    private ComboBox<String> statusID2;

    @javafx.fxml.FXML
    public void initialize() {

        circularColumn.setCellValueFactory(new PropertyValueFactory<>("circularID"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        issueDateColumn.setCellValueFactory(new PropertyValueFactory<>("issueDate"));
        expireDateColumn.setCellValueFactory(new PropertyValueFactory<>("expireDate"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

    }

    @javafx.fxml.FXML
    public void publishOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void signOut(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void deleteOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateOnClicnk(ActionEvent actionEvent) {
    }
}