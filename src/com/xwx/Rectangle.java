package com.xwx;

public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString(){
        return "Прямоугольник длины = " + length + " и ширины = " + width + ", подкласс " + super.toString();
    }

    @Override
    public double getArea(){
        return length * width;
    }
}