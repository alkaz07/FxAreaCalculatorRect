package com.example.fxareacalculator;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class HelloController {


    @FXML
    TextField heightTextField;

    @FXML
    TextField widthTextField;

    @FXML
    Label sumLabel;

    SimpleDoubleProperty width = new SimpleDoubleProperty();
    SimpleDoubleProperty height = new SimpleDoubleProperty();
    SimpleDoubleProperty sum = new SimpleDoubleProperty();

    public void initialize(){
//        sum.set(width.get()*height.get());


        sumLabel.textProperty().bindBidirectional(sum, new DecimalFormat());
        heightTextField.textProperty().bindBidirectional(height, new DecimalFormat());
        widthTextField.textProperty().bindBidirectional(width, new DecimalFormat());

        heightTextField.setOnInputMethodTextChanged(actionEvent -> sum.set((width.get()*height.get())));
        widthTextField.setOnAction(actionEvent -> sum.set((width.get()*height.get())));

    }



}