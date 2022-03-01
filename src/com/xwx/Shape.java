package com.xwx;

public class Shape {
    private String color;

    public Shape(String color){
        this.color = color;
    }

    @Override
    public String toString(){
        return "Цвет фигуры = \"" + color + "\"";
    }

    public double getArea(){
        System.err.println("Фигура неизвестна! Невозможно вычислить площадь!");
        return 0;
    }
}