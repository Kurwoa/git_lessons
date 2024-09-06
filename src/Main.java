public class Main {

    public static void main(String[] args) {
        // 1. Вызов метода для печати трех слов
        ThreeWords.printThreeWords();


        // 2. Вызов метода для проверки суммы двух чисел
        SumSign.checkSumSign();


        // 3. Вызов метода для печати цвета
        Color.printColor();

        // 4. Вызов метода для сравнения чисел
        Numbers.compareNumbers();

        // 5. Проверка суммы чисел на диапазон
        System.out.println(SumInRange.isSumInRange(10, 5));  // true

        // 6. Печать знака числа
        PosOrNeg.printPosOrNeg(5);   // Положительное
        PosOrNeg.printPosOrNeg(-3);  // Отрицательное

        // 7. Проверка числа на отрицательность
        System.out.println(Negative.isNegative(-10));  // true
        System.out.println(Negative.isNegative(5));    // false

        // 8. Печать строки
        StringMultipleTimes.printStringMultipleTimes("Мимо?", 5);

        // 9. Високосный год
        System.out.println(LeapYear.isLeapYear(2020));  // true
        System.out.println(LeapYear.isLeapYear(1900));  // false
        System.out.println(LeapYear.isLeapYear(2000));  // true

        // 10. Инверсия элементов массива
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        Array.invertArray(binaryArray);
        Array.printArray(binaryArray);

        // 11. Заполнение массива числами от 1 до 100
        int[] filledArray = ArrayWithNumbers.fillArrayWithNumbers();
        ArrayWithNumbers.printArray(filledArray);

        // 12. Умножение чисел, меньших 6, на 2
        int[] numbersArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        LessThanSix.multiplyLessThanSix(numbersArray);
        LessThanSix.printArray(numbersArray);

        // 13. Заполнение диагональных элементов квадратного массива
        int[][] matrix = Diagonal.fillDiagonal(5);
        Diagonal.printMatrix(matrix);

        // 14. Создание массива с одинаковыми элементами
        int[] customArray = Arrays.createArray(5, 7);
        Arrays.printArray(customArray);
    }


}