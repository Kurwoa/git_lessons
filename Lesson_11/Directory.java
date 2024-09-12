import java.util.*;

public class Directory {
    private Map<String, List<String>> directory = new HashMap<>();

    public void addEntry(String lastName, String phoneNumber) {
        if (!directory.containsKey(lastName)) {
            directory.put(lastName, new ArrayList<>());
        }
        directory.get(lastName).add(phoneNumber);
    }

    public void getEntry(String lastName) {
        System.out.println("\nНайденные номера по фамилии " + lastName + ":\n" + directory.getOrDefault(lastName, Collections.emptyList()));
    }
}