package com.example.fxareacalculator;

import javafx.beans.property.SimpleDoubleProperty;

public class Rect {
    public SimpleDoubleProperty width = new SimpleDoubleProperty();
    public SimpleDoubleProperty height = new SimpleDoubleProperty();
    public SimpleDoubleProperty sum = new SimpleDoubleProperty();

    public Rect() {
        width.addListener ((observableValue, number, t1) -> sum.set(width.get()* height.get()));
        height.addListener((observableValue, number, t1) -> sum.set(width.get()* height.get()));
    }
}
