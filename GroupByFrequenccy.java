import java.util.*;

public class GroupByFrequency {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String item : items) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        System.out.println(frequencyMap); // Output: {orange=1, banana=2, apple=3}
    }
}
