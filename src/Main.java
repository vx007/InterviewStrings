import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Дан массив строк, необходимо удалить из него все дубли,
//        оставшиеся строки объединить в одну в порядке следования в массиве.
        String[] strings = {"a", "b", "a", "c", "b", "d", "e", "b", "a", "e"};
        String result = Arrays.stream(strings).distinct().collect(Collectors.joining());
        System.out.println(result);
    }
}
