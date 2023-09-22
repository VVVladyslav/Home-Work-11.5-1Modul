import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<Integer> first = Stream.of(1, 2, 3);
        Stream<Integer> second = Stream.of(4, 5, 6, 7,9,10);

        Stream<Integer> Oneline = Mixer.Swap(first, second);

        Oneline.forEach(System.out::println);
    }
}