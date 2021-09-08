package com.example.jdbcfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainView extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainView.fxml"));
        ScrollPane scrollPane=fxmlLoader.load();
//        Parent scrollPane=fxmlLoader.load();
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);
        Scene scene = new Scene(scrollPane);
        stage.setTitle("Sell");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}