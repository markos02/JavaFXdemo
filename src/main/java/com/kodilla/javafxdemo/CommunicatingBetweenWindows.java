package com.kodilla.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CommunicatingBetweenWindows extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("Tutorial - 6 - Communicating Between Window");

        button = new Button("Click me");

        button.setOnAction(e -> {
            boolean result = ConfirmBox.display("Title of window", "Are you sure?");
            System.out.println("You choose " + result);
        });

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
}
