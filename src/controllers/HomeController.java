package controllers;


import com.jfoenix.controls.*;
import com.jfoenix.controls.JFXDialog.DialogTransition;
import io.datafx.controller.flow.context.FXMLViewFlowContext;
import io.datafx.controller.flow.context.ViewFlowContext;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

import javax.annotation.PostConstruct;

public class HomeController {
    /*Properties*/
    public static final String CONTENT_PANE = "ContentPane";

    @FXMLViewFlowContext
    private ViewFlowContext context;
    @FXML
    private JFXButton gestion_agences_btn;
    @FXML
    private StackPane container;
    @FXML
    private JFXButton gestion_comptes_btn;
    @FXML
    private JFXButton gestion_clients_btn;
    @FXML
    private JFXDialog clientDialog;
    @FXML
    private JFXButton deconnexion_btn;
    @FXML
    private AnchorPane accounts_layout;
    @FXML
    private JFXButton add_account_btn;
    @FXML
    private AnchorPane clients_layout;
    @FXML
    private JFXButton add_client_btn;
    @FXML
    private AnchorPane agency_layout;
    @FXML
    private JFXButton add_agence_btn;
    @FXML
    private TableView<?> agences_table;
    @FXML
    private JFXDialog agencyDialog;
    @FXML
    private JFXDialog serverConfigDialog;
    @FXML
    private JFXButton agencySaveBtn;
    @FXML
    private GridPane spinnerPane;
    @FXML
    private JFXSpinner spinner;
    @FXML
    private JFXComboBox<Label> clientDialogComboBox;
    @FXML
    private JFXDialog accountDialog;

    /* Layout Methods */
    @FXML
    void showAccountsLayout(ActionEvent event) {
        accounts_layout.toFront();
        System.out.println("Show Accounts Layout");
    }

    @FXML
    void showAgencyLayout(ActionEvent event) {
        agency_layout.toFront();
        System.out.println("Show Agences Layout");
    }

    @FXML
    void showClientsLayout(ActionEvent event) {
        clients_layout.toFront();
        System.out.println("Show Clients Layout");
    }

    /* Dialog Methods*/
    @FXML
    void addAccount() {
        System.out.println("Add Account");
        accountDialog.close();
    }

    @FXML
    void addAgency(ActionEvent event) {
        agencyDialog.close();
    }

    @FXML
    void addClient() {
        clientDialog.close();
        System.out.println("Add Client");
    }

    @FXML
    void displayAddAgencyDialog() {
        System.out.println("Add Agence");
        agencyDialog.show(container);
    }

    @FXML
    void displayAddAccountDialog() {
        accountDialog.show(container);
    }

    @FXML
    void displayAddClientDialog() {
        System.out.println("Add client");

        clientDialog.show(container);
    }

    @FXML
    void displayServerConfigDialog() {
        System.out.println("Server Config dialog");
        spinner.setVisible(false);
        serverConfigDialog.show(container);
    }

    @FXML
    void connect() {
        System.out.println("connecting");
        if (!spinner.isVisible()) {
            spinner.setVisible(true);
        }
    }

    /*Initialize Components*/
    @FXML
    public void initialize() {
        clientDialogComboBox.getItems().add(new Label("something"));
        clientDialogComboBox.getItems().add(new Label("another thing"));
    }
}
