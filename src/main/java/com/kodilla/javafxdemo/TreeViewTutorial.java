package com.kodilla.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TreeViewTutorial extends Application {

    Stage window;
    TreeView<String> tree;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Tutorial - 16 - TreeView");

        TreeItem<String> root, branch1, branch2, branch3;

        root = new TreeItem<>();
        root.setExpanded(true);

        branch1 = makeBranch("Fruit", root);
        makeBranch("Apple", branch1);
        makeBranch("Orange", branch1);
        makeBranch("Pear", branch1);

        branch2 = makeBranch("Vegetables", root);
        makeBranch("Carrot", branch2);
        makeBranch("Cabbage", branch2);
        makeBranch("Beetroot", branch2);

        branch3 = makeBranch("Meat", root);
        makeBranch("Chicken", branch3);

        tree = new TreeView<>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty().
                addListener((v, oldValue, newValue) -> {
            if (newValue != null) {
                System.out.println(newValue.getValue());
            }
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private TreeItem<String> makeBranch(String name, TreeItem<String> parent) {

        TreeItem<String> item = new TreeItem<>(name);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;

    }
}
