import animals.*;
import geometric.*;


public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик");
        Cat catBarsik = new Cat("Барсик");

        dogBobik.run(150); // Бобик пробежал 150 м.
        dogBobik.swim(5); // Бобик проплыл 5 м.
        catMurzik.run(150);
        catMurzik.swim(5);

        Bowl bowl = new Bowl(10);
        Cat[] cats = {catMurzik, catBarsik};

        for (Cat cat : cats) {
            cat.eat(bowl, 5);
        }

        for (Cat cat : cats) {
            System.out.println(cat.name + " сытость: " + cat.isFull());
        }

        bowl.addFood(10);
        catBarsik.eat(bowl, 5);
        System.out.println(catBarsik.name + " сытость: " + catBarsik.isFull());


        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println();

        Shape circle = new Circle(5, "Красный", "Чёрный");
        Shape rectangle = new Rectangle(4, 6, "Синий", "Жёлтый");
        Shape triangle = new Triangle(3, 4, 5, "Зелёный", "Голубой");

        System.out.println("Круг:");
        circle.printInfo();

        System.out.println("\nПрямоугольник:");
        rectangle.printInfo();

        System.out.println("\nТреугольник:");
        triangle.printInfo();

    }
}