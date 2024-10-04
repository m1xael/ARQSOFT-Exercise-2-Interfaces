import java.util.List;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
            new Person("Michael", "Karpov"),
            new Person("Michael", "Scofield"),
            new Person("Thomas", "Edison"),
            new Person("Abraham", "Lincoln"),
            new Person("Peter", "Griffin")
        );

        System.out.println("Before sorting Persons:");
        print(persons);
        
        System.out.println("\nAfter sorting Persons:");
        Sorter.sort(persons);
        print(persons);

        List<Rectangle> rectangles = Arrays.asList(
            new Rectangle(20, 14.5),
            new Rectangle(10, 5),
            new Rectangle(30, 2)
        );

        System.out.println("\nBefore sorting Rectangles:");
        print(rectangles);

        System.out.println("\nAfter sorting Rectangles:");
        Sorter.sort(rectangles);
        print(rectangles);
    }

    private static void print(Iterable<?> items) {
        for (Object item : items) {
            if (item instanceof Person) {
                Person p = (Person) item;
                System.out.println(p.surname + " " + p.name);
            } else if (item instanceof Rectangle) {
                Rectangle r = (Rectangle) item;
                System.out.printf("Rectangle area: %.2f\n", r.calculateArea());
            }
        }
    }
}