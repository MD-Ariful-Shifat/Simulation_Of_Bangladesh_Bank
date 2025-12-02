package com.example.simulation_of_bangladesh_bank.shifat;

import javafx.event.ActionEvent;

import java.io.IOException;

public class GovernorController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void inflationReports(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void interestRates(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadApprovals(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void foreignReservers(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void commercialBanks(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.sceneSwitch(actionEvent, "shifat/ManageCommercialBank.fxml", "Manage Bank");
    }

    @javafx.fxml.FXML
    public void signOut(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void circularsOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void monetaryPolicies(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void staffInfo(ActionEvent actionEvent) {
    }
}