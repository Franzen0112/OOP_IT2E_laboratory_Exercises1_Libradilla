import java.util.ArrayList;
import java.util.List;

public class Exer1_Imperative {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Imperative style: manually filter even numbers
        List<Integer> evenNumbers = new ArrayList<>();
        for (int n : numbers) {
            if (n % 2 == 0) {
                evenNumbers.add(n);
            }
        }

        System.out.println("Even numbers (Imperative): " + evenNumbers);
    }
}
