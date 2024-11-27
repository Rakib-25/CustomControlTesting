package com.example.testingtoolbar;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class CustomBoxControl extends AnchorPane {

    private BoxController controller;

    public CustomBoxControl() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Box1.fxml"));
            controller = new BoxController();
            loader.setController(controller);
            Node node = loader.load();
            this.getChildren().add(node);







        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }




}
