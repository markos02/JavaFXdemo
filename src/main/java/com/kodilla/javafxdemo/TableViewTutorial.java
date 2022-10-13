package com.kodilla.javafxdemo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableViewTutorial extends Application {

    Stage window;
    TableView<TableViewProduct> table;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Tutorial - 17 - TableView");

        TableColumn<TableViewProduct, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<TableViewProduct, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn<TableViewProduct, Integer> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

        VBox layout = new VBox();
        layout.getChildren().addAll(table);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

    public ObservableList<TableViewProduct> getProduct() {

        ObservableList<TableViewProduct> products = FXCollections.observableArrayList();
        products.add(new TableViewProduct("Laptop", 199.50, 5));
        products.add(new TableViewProduct("Monitor", 99.99, 45));
        products.add(new TableViewProduct("Printer", 49.30, 20));
        products.add(new TableViewProduct("Mouse", 10.00, 50));
        products.add(new TableViewProduct("Keyboard", 15.50, 140));

        return products;

    }
}
