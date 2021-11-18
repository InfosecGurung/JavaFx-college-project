package com.example.demojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {  // main class HelloApplication is child of Application class
    @Override
    public void start(Stage stage) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            String css = this.getClass().getResource("application.css").toExternalForm();

            Scene scene = new Scene(fxmlLoader.load());
            scene.getStylesheets().add(css);
            stage.setTitle("Testing JavaFx");

            Image icon = new Image("icon.png");  // added icon png in resources directory
            stage.getIcons().add(icon);
            stage.setResizable(true);


            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);  // launch is a static method
    }
}