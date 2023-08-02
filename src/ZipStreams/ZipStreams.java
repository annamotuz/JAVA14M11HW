package ZipStreams;
import java.util.Iterator;
import java.util.stream.Stream;

public class ZipStreams {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(10, 20, 30);

        Stream<Integer> zippedStream = zip(stream1, stream2);
        zippedStream.forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        return zipHelper(first.iterator(), second.iterator());
    }

    private static <T> Stream<T> zipHelper(Iterator<T> first, Iterator<T> second) {
        if (!first.hasNext() || !second.hasNext()) {
            return Stream.empty();
        }

        T firstElement = first.next();
        T secondElement = second.next();

        return Stream.concat(Stream.of(firstElement, secondElement), zipHelper(first, second));
    }
}
