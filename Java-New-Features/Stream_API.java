import java.util.*;
public class Stream_API {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,4,3);
        int sum = numbers.stream().filter(n -> n%2 == 0).mapToInt(n -> n*2).sum();
        System.out.println("Sum of doubled Even numbers "+sum);
    }
}
