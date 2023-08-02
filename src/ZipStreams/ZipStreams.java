package ZipStreams;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZipStreams {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(10, 20, 30);

        Stream<Integer> zippedStream = zip(stream1, stream2);
        zippedStream.forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> list1 = first.collect(Collectors.toList());
        List<T> list2 = second.collect(Collectors.toList());

        return zipLists(list1, list2);
    }

    private static <T> Stream<T> zipLists(List<T> first, List<T> second) {
        if (first.isEmpty() || second.isEmpty()) {
            return Stream.empty();
        }

        T firstElement = first.get(0);
        T secondElement = second.get(0);

        List<T> remaining1 = first.subList(1, first.size());
        List<T> remaining2 = second.subList(1, second.size());

        return Stream.concat(Stream.of(firstElement, secondElement), zipLists(remaining1, remaining2));
    }
}
