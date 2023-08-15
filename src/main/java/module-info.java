module com.example.fxareacalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxareacalculator to javafx.fxml;
    exports com.example.fxareacalculator;
}