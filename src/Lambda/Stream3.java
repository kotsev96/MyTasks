package Lambda;

import java.util.Optional;
import java.util.stream.Stream;

public class Stream3 {
    public static void main(String[] args) {
        Optional<String> stream = Optional.ofNullable(Stream.of("мама", "мыла", "раму")
                .reduce("Результат:", (x, y) -> x + " " + y));
        System.out.println(stream.get());

    }

}
