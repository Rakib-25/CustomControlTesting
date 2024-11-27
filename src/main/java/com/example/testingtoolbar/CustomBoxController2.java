package com.example.testingtoolbar;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class CustomBoxController2 extends AnchorPane {

    private BoxControll2 controll2;

    public CustomBoxController2() throws IOException {

        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("2Boxes.fxml"));

            controll2 = new BoxControll2();

            fxmlLoader.setController(controll2);

            Node node = fxmlLoader.load();
            this.getChildren().add(node);

        }



        catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
