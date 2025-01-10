import java.util.ArrayList;
import java.util.List;

public class ListRunnerExample {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Leonid", "Bulgakov", 23),
                new Student("Bogdan", "Berkun", 23)
        );
        students.stream()
                .forEach(System.out::println);
    }
}
