package com.example.testingtoolbar;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class BoxControll2  {
    @FXML
    private TextArea textArea1;
    @FXML
    private TextArea textArea2;


    public TextArea getTextArea1() {
        return textArea1;
    }
    public TextArea getTextArea2(TextArea textArea2) {
        return textArea2;
    }


}
