import java.util.Arrays;
import java.util.List;

public class Exer1_Declarative {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Ben", "Carlo", "Diana", "Ella");

        // Declarative style: using stream to describe *what* we want
        boolean hasShortName = names.stream().anyMatch(name -> name.length() <= 3);

        System.out.println("Is there a short name (<=3 chars)? " + hasShortName);
    }
}
