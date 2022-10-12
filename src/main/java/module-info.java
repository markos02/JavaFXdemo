module com.kodilla.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kodilla.javafxdemo to javafx.fxml;
    exports com.kodilla.javafxdemo;
}