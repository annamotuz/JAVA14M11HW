package StringList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class StringList {
    public static List<String> convertToUpperCaseAndSortDescending(List<String> inputList) {
        List<String> result = new ArrayList<>();

        for (String str : inputList) {
            result.add(str.toUpperCase());
        }
        Collections.sort(result, Collections.reverseOrder());
        return result;
    }
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "Mary", "John", "Kate", "Alex");
        List<String> modifiedList = convertToUpperCaseAndSortDescending(names);

        for (String str : modifiedList) {
            System.out.println(str);
        }
    }
}
