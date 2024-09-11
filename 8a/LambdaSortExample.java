import java.util.*;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "cherry");

        strings.sort((s1, s2) -> s2.compareTo(s1)); // Sorting in descending order

        System.out.println(strings);
    }
}
