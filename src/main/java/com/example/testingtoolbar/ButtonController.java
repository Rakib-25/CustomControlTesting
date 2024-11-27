package com.example.testingtoolbar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class ButtonController {

    @FXML
    public Pane button_pan;
    @FXML
    private Button button;

    public void initialize() {
        button.setOnAction(event -> onHandleClick());
    }



    public void setButtonText(String text) {
        button.setText(text);
    }

    public void onHandleClick() {

        button.setText("Clicked");


    }


}
