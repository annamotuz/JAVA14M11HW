package NumbersGenerator;

import java.util.stream.Stream;

public class LinearCongruentialGenerator {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        Stream<Long> randomStream = generateRandomStream(a, c, m);
        randomStream.limit(10).forEach(System.out::println);
    }

    public static Stream<Long> generateRandomStream(long a, long c, long m) {
        long seed = System.currentTimeMillis();
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
