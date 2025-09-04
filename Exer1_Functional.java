import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exer1_Functional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Functional style: filter even numbers and square them
        List<Integer> squaresOfEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Squares of even numbers (Functional): " + squaresOfEven);
    }
}
