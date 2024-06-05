package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfCharInString {
    public static void main(String[] args) {
        System.out.println(occurrenceOfCharInStringWithHashMap("javaprogram"));
        System.out.println(occurrenceOfCharInStringWithStreams("javaprogram"));
    }

    private static Map<Character, Integer> occurrenceOfCharInStringWithHashMap(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);

        }
        return map;
    }

    private static Map<String, Long> occurrenceOfCharInStringWithStreams(String input) {
        Map<String, Long> result = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    return result;
    }
}
