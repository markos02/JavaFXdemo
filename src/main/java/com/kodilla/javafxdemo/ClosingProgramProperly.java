package com.kodilla.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ClosingProgramProperly extends Application {

    Stage window;
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("Tutorial - 7 - Closing the Program Properly");

        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        button = new

                Button("Close program");
        button.setOnAction(e ->

                closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }

    private void closeProgram() {

        Boolean answer = ConfirmBox.display("Title", "Sure you want to exit?");

        if (answer) {
            System.out.println("File is saved!");
            window.close();
        }

    }
}
