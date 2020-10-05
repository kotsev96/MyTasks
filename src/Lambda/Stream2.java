package Lambda;

import java.util.stream.Stream;

public class Stream2 {
    void filter(){
        Stream<Integer> stream = Stream.of(1, -2, 3, -4, 5)
                .filter(x -> (x > 0));
        System.out.println(stream.toString());
    }
}
