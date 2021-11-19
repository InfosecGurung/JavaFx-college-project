package com.example.demojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private Circle actionCircle;
    private double x;
    private double y;

    private Stage stage;
    private Scene scene;
    private Parent root;

    private String css = this.getClass().getResource("application.css").toExternalForm();

    public void switchToHomeScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(HelloApplication.class.getResource("hello-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(css);

        stage.setScene(scene);
        stage.show();
    }

    public void switchToAboutScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(HelloApplication.class.getResource("about-page.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(css);

        stage.setTitle("About the application");

        stage.setScene(scene);
        stage.show();
    }

    public void fullScreenButton(ActionEvent event) throws IOException {
        root = FXMLLoader.load(HelloApplication.class.getResource("hello-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene.getStylesheets().add(css);

        stage.setScene(scene);

        stage.fullScreenExitHintProperty().set("Press 'q' to exit full screen");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.setFullScreen(true);

        stage.show();
    }

    public void exitButton(ActionEvent e) {
        System.exit(0);
    }

    public void upButton(ActionEvent e) {
        System.out.println("Up pressed");
        actionCircle.setCenterY(y -= 10);
    }

    public void downButton(ActionEvent e) {
        System.out.println("Down pressed");
        actionCircle.setCenterY(y += 10);
    }

    public void leftButton(ActionEvent e) {
        System.out.println("Left pressed");
        actionCircle.setCenterX(x -= 10);
    }

    public void rightButton(ActionEvent e) {
        System.out.println("Right pressed");
        actionCircle.setCenterX(x += 10);
    }
}