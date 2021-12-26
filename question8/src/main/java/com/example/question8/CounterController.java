package com.example.question8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import static java.lang.Integer.parseInt;

public class CounterController {
    @FXML Button buttonUp;
    @FXML Button buttonDown;
    @FXML TextField textFieldDisplay;

    public void addTextField(ActionEvent event) {
        if(event.getSource()== buttonUp) {
            String x = textFieldDisplay.getText();
            int i = parseInt(x);
            i++;
            x = String.valueOf(i);
            textFieldDisplay.setText(x);
        }
    }

    public void minusTextField(ActionEvent event) {
        if(event.getSource()== buttonDown) {
            String x = textFieldDisplay.getText();
            int i = parseInt(x);
            i--;
            x = String.valueOf(i);
            textFieldDisplay.setText(x);
        }
    }
}