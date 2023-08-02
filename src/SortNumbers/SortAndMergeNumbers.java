package SortNumbers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortAndMergeNumbers {
    public static void main(String[] args) {
        String[] inputArray = {"1, 2, 0", "4, 5"};
        String sortedNumbers = sortAndMerge(inputArray);
        System.out.println(sortedNumbers);
    }

    public static String sortAndMerge(String[] inputArray) {
        String mergedString = String.join(",", inputArray);

        int[] intNumbersArray = Arrays.stream(mergedString.split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        String sortedNumbers = Arrays.stream(intNumbersArray)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        return sortedNumbers;
    }
}
