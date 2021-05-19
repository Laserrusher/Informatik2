import java.util.Random;
import java.util.stream.IntStream;

public class blatt03_11b {
    public static void main(String[] args) {
        Random ran = new Random();
        IntStream intStream = ran.ints();
        intStream = intStream.limit(10);
        intStream = intStream.sorted();
        intStream.forEach(System.out::println);
    }
}
