import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        String[] words = text.split("\\s+");
        int wordCount = words.length;
        System.out.println("Всего в тексте " + wordCount);

        Map<String, Integer> frequencyTable = new HashMap<>();
        for (String word : words) {
            if (frequencyTable.containsKey(word)) {
                frequencyTable.put(word, frequencyTable.get(word) + 1);
            } else {
                frequencyTable.put(word, 1);
            }
        }

        System.out.println("Top 10 :");

        List<Map.Entry<String, Integer>> frequencyList = new ArrayList<>(frequencyTable.entrySet());
        frequencyList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (int i = 0; i < 10; i++) {
            System.out.println(frequencyList.get(i).getKey() + ": " + frequencyList.get(i).getValue());

        }
    }
}
