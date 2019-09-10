package com.zaldy.Controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class ModulFormController implements Initializable {
    public MenuItem about;
    public TextField txtcategory;
    public TextField txtkode;
    public TextField txtprice;
    public TableView col1;

    public void aboutAction(ActionEvent actionEvent) {
    }

    public void closeAction(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void updateAction(ActionEvent actionEvent) {
    }

    public void resetAction(ActionEvent actionEvent) {
    }

    public void saveAction(ActionEvent actionEvent) {
    }

    public void savecatAction(ActionEvent actionEvent) {
    }

    public void tableClicked(MouseEvent mouseEvent) {

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        };
    }

