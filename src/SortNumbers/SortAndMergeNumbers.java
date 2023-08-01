package SortNumbers;

import java.util.Arrays;

public class SortAndMergeNumbers {
    public static void main(String[] args) {
        String[] inputArray = {"1, 2, 0", "4, 5"};
        String sortedNumbers = sortAndMerge(inputArray);
        System.out.println(sortedNumbers);
    }

    public static String sortAndMerge(String[] inputArray) {
        String mergedString = String.join(",", inputArray);

        String[] numbersArray = mergedString.split(",");

        int[] intNumbersArray = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            intNumbersArray[i] = Integer.parseInt(numbersArray[i].trim());
        }
        Arrays.sort(intNumbersArray);

        String sortedNumbers = Arrays.toString(intNumbersArray)
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "");

        return sortedNumbers;
    }
}

