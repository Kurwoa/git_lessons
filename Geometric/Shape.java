package edu.java.development;

public interface Shape {
    double calculateArea();  // Площадь
    double calculatePerimeter();  // Периметр

    // Цвет
    String getFillColor();
    void setFillColor(String color);

    String getBorderColor();
    void setBorderColor(String color);


    default void printInfo() {
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
    }
}