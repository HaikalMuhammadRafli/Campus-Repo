package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class ToDoListJFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // root layout
        Parent root = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/MainView.fxml")));

        // scene
        Scene scene = new Scene(root);

        // insert scene to stage
        stage.setScene(scene);

        stage.setTitle("ToDoListJFX - Version 0.1");
        stage.show();
    }
}
