import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class Mixer {

    public static <T> Stream<T> Swap(Stream<T> first, Stream<T> second){

        Iterator<T> firstIt = first.iterator();
        Iterator<T> secondIt = second.iterator();

        Builder<T> builder = Stream.builder();

        while (firstIt.hasNext() && secondIt.hasNext()) {
            builder.add(firstIt.next());
            builder.add(secondIt.next());
        }
        return builder.build();
    }
}
