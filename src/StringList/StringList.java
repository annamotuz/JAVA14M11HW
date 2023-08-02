package StringList;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringList {
    public static List<String> convertToUpperCaseAndSortDescending(List<String> inputList) {
        return inputList.stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "Mary", "John", "Kate", "Alex");
        List<String> modifiedList = convertToUpperCaseAndSortDescending(names);

        modifiedList.forEach(System.out::println);
    }
}
