package com.kodilla.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Stack;

public class EmbeddingLayouts extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Tutorial - 8 - Embedding Layouts");

        HBox topMenu = new HBox();
        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");
        Button buttonD = new Button("Navigate");
        topMenu.getChildren().addAll(buttonA, buttonB, buttonC, buttonD);

        VBox leftMenu = new VBox();
        Button buttonE = new Button("E");
        Button buttonF = new Button("F");
        Button buttonG = new Button("G");
        Button buttonH = new Button("H");
        leftMenu.getChildren().addAll(buttonE, buttonF, buttonG, buttonH);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

          Scene scene = new Scene(borderPane, 300, 250);
        window.setScene(scene);
        window.show();

    }
}
