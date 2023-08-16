package com.example.fxareacalculator;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.text.DecimalFormat;

public class HelloController {


    @FXML
    TextField heightTextField;

    @FXML
    TextField widthTextField;

    @FXML
    Label sumLabel;

    @FXML
    Spinner<Integer> spin;
    @FXML
    Slider slid;

    @FXML
    Label label2;

    Rect model = new Rect();

    public void initialize() {
//
        sumLabel.textProperty().bindBidirectional(model.sum, new DecimalFormat());
        heightTextField.textProperty().bindBidirectional(model.height, new DecimalFormat());
        widthTextField.textProperty().bindBidirectional(model.width, new DecimalFormat());


        slid.valueProperty().bindBidirectional(model.width);

        spin.valueProperty().addListener((val, o, n) -> {
            model.height.set(n);
        });
        spin.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 50));
        //heightTextField.setOnInputMethodTextChanged(actionEvent -> sum.set((width.get()*height.get())));
        // widthTextField.setOnAction(actionEvent -> sum.set((width.get()*height.get())));

    }


    public void calcArea() {
        double w = Double.parseDouble(widthTextField.getText());
        double h = Double.parseDouble(heightTextField.getText());
        label2.setText(String.valueOf(w * h));
    }


}