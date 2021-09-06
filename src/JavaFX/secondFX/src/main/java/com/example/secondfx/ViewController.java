package com.example.secondfx;

import com.example.secondfx.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class ViewController {
    @FXML
    private Button btTest;

    @FXML
    private void onBtTestAction(){
        Alerts.showAlert("Alert", "Alert Header", "Hello", Alert.AlertType.INFORMATION);
        System.out.println("Click");
    }
}
