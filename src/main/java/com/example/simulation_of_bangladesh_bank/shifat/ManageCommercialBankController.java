package com.example.simulation_of_bangladesh_bank.shifat;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ManageCommercialBankController
{
    @javafx.fxml.FXML
    private TableView<ManageCommercialBank> tableID;
    private List<ManageCommercialBank> manageCommercialBankArrayList = new ArrayList<>();
    private File file = new File( "data/MangeCommercialBank.bin");
    @javafx.fxml.FXML
    private TableColumn licenseColumn;
    @javafx.fxml.FXML
    private TableColumn typeColumn;
    @javafx.fxml.FXML
    private TextField nameID2;
    @javafx.fxml.FXML
    private TextField bankId;
    @javafx.fxml.FXML
    private TextField bankId2;
    @javafx.fxml.FXML
    private TableColumn nameColumn;
    @javafx.fxml.FXML
    private ComboBox statusID;
    @javafx.fxml.FXML
    private TextField bankId3;
    @javafx.fxml.FXML
    private TextField bankId4;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableColumn bankColumn;
    @javafx.fxml.FXML
    private TextField nameID;
    @javafx.fxml.FXML
    private ComboBox typeID;
    @javafx.fxml.FXML
    private ComboBox typeID2;
    @javafx.fxml.FXML
    private TextField licenseID;
    @javafx.fxml.FXML
    private ComboBox statusID2;


    @javafx.fxml.FXML
    public void initialize() {
        licenseColumn.setCellValueFactory(new PropertyValueFactory<>( "licensenumber"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>( "type"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>( "name"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>( "status"));
        bankColumn.setCellValueFactory(new PropertyValueFactory<>( "bankId"));

        manageCommercialBankArrayList = BinaryFileHelper.readAllObjects(file);
        tableID.getItems().clear();
        tableID.getItems().addAll(manageCommercialBankArrayList);
    }

    @Deprecated
    public void searchOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addOnClicnk(ActionEvent actionEvent) {
        ManageCommercialBank manageCommercialBank = new ManageCommercialBank(
                bankId.getText(),
                nameID.getText(),
                Integer.parseInt(licenseID.getText()),
                typeID.getValue(),
                statusID.getValue()


        );

        manageCommercialBankArrayList.add(manageCommercialBank);
        BinaryFileHelper.writeAllObjects(file, manageCommercialBankArrayList);

    }

    @javafx.fxml.FXML
    public void deleteOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateOnClicnk(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void signOut1(ActionEvent actionEvent) {
    }


    @Deprecated
    public void signOut(ActionEvent actionEvent) {
    }

    @Deprecated
    public void saveOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchOnClickk(ActionEvent actionEvent) {
    }
}