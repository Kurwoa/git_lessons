import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<String> words = new ArrayList<>(Arrays.asList("киви", "Груша", "апельсин", "банан", "киви", "мандарин", "груша", "банан", "собака", "мандарин", "яблоко", "киви", "груша", "персик", "апельсин"));
        Map<String, Integer> wordCount = new HashMap<>();


        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }


        System.out.println("Количество слов в массиве:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }



        Directory pd = new Directory();
        pd.addEntry("Петухов", "+375(29)502-52-52");
        pd.addEntry("Коробкин", "+375(33)666-17-03");
        pd.addEntry("Трубкин", "+375(29)570-00-03");
        pd.addEntry("Петухов", "+375(33)404-44-44");
        pd.addEntry("Жучар", "+375(29)689-23-65");
        pd.addEntry("Петухов", "+375(44)746-36-74");
        pd.addEntry("Коробкин", "+375(44)674-23-62");

        pd.getEntry("Петухов");

    }
}
