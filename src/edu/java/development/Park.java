package edu.java.development;

public class Park {

    private String parkName;
    private Attraction[] attractions;

    // Конструктор класса Park
    public Park(String parkName, int numberOfAttractions) {
        this.parkName = parkName;
        this.attractions = new Attraction[numberOfAttractions];
    }

    // Метод для добавления аттракциона
    public void addAttraction(int index, String name, String operatingHours, double price) {
        if (index >= 0 && index < attractions.length) {
            attractions[index] = new Attraction(name, operatingHours, price);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Метод для получения информации о парке
    public void displayParkInfo() {
        System.out.println("Park Name: " + parkName);
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                attraction.displayInfo();
            }
        }
    }

    // Внутренний класс Attraction
    private class Attraction {
        private String name;
        private String operatingHours;
        private double price;

        // Конструктор внутреннего класса Attraction
        public Attraction(String name, String operatingHours, double price) {
            this.name = name;
            this.operatingHours = operatingHours;
            this.price = price;
        }

        // Метод для отображения информации об аттракционе
        public void displayInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время работы: " + operatingHours);
            System.out.println("Стоимость: " + price + "руб.");
            System.out.println();
        }
    }
}