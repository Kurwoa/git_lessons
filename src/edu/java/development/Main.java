package edu.java.development;

public class Main {
    public static void main(String[] args) {

        Person[] persArray = new Person[5];


        persArray[0] = new Person("Игнат Купец", "Инженер", "ign.buy@mailbox.com", "375338992356", 31700, 25);
        persArray[1] = new Person("Андрей Конь", "Дизайнер", "a.nkonik@mailbox.com", "375295557868", 30500, 29);
        persArray[2] = new Person("Виктор Клоп", "Менеджерr", "v.klop@mailbox.com", "375339094545", 37000, 28);
        persArray[3] = new Person("Виталий Грибник", "Аналитик", "grib.vitaly@mailbox.com", "375296661705", 46000, 30);
        persArray[4] = new Person("Антон Мафиозников", "Тестировщик", "a.mafia.com", "375293458900", 68000, 26);


        for (Person person : persArray) {
            person.displayInfo();
        }

        Park park = new Park("Парк Аттракционов", 3);

        park.addAttraction(0, "Угарные горки", "11:00 - 19:00", 18.50);
        park.addAttraction(1, "Бабочка", "11:00 - 18:30", 13.00);
        park.addAttraction(2, "Ракушка", "10:30 - 17:30", 16.00);

        park.displayParkInfo();



    }
}