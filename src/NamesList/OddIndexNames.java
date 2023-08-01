package NamesList;
import java.util.List;
import java.util.Arrays;

public class OddIndexNames {
    public static String getOddIndexNames(List<String> names) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < names.size(); i += 2) {
            int position = i + 1;
            String name = names.get(i);
            result.append(position).append(". ").append(name).append(", ");
        }

        if (result.length() > 2) {
            result.delete(result.length() - 2, result.length());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "Mary", "John", "Kate", "Alex");

        String oddIndexNamesString = getOddIndexNames(names);
        System.out.println(oddIndexNamesString);
    }
}