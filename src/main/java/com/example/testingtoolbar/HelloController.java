package com.example.testingtoolbar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToolBar;

public class HelloController {

    @FXML
    private ToolBar toolbar;
    @FXML
    private Button box1;
    @FXML
    private Button box2;
    @FXML
    private ScrollPane scrollPane;

    private BoxController controller;


    @FXML
    public void initialize() {


        try {
            //first we have to load
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CustomButton.fxml"));

            //if create manually it will not connect wiht FXML that's why this won't work
//          buttonController = new ButtonController();
//          loader.setController(buttonController);

            Node node = loader.load();

            //Assign the fxml controller
            ButtonController buttonController = loader.getController();

            //setting up new text
            buttonController.setButtonText("Hey,There");

            //loading into toolbar
            toolbar.getItems().add(node);
        }


        catch (Exception e) {
            throw new RuntimeException(e);
        }



        //Calling on action event to load in runtime
        box1.setOnAction(event -> handleButtonClick1() );
        box2.setOnAction(event -> handleButtonClick2());

    }



    //Loading 1 Boxes
    @FXML
    private void handleButtonClick1() {
        System.out.println("box1 clicked");
        loadCustomBox1();


    }

    @FXML
    private void handleButtonClick2() {
        System.out.println("box2 clicked");
        loadCustomBox2();
    }


    private void loadCustomBox1 (){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Box1.fxml"));
            controller = new BoxController();
            fxmlLoader.setController(controller);

            Node node = fxmlLoader.load();
            scrollPane.setContent(node);


        }

        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    private void loadCustomBox2 (){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("2Boxes.fxml"));
            controller = new BoxController();
            fxmlLoader.setController(controller);

            Node node = fxmlLoader.load();
            scrollPane.setContent(node);


        }

        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }





}