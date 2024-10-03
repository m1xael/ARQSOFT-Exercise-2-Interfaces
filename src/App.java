public class App {
    public static void main(String[] args) throws Exception {
        Person[] persons = new Person[5];

        persons[0] = new Person("Michael", "Karpov");
        persons[1] = new Person("Michael", "Scofield");
        persons[2] = new Person("Thomas", "Edison");
        persons[3] = new Person("Abraham", "Lincoln");
        persons[4] = new Person("Peter", "Griffin");

        for (int i = 0; i <= 4; i++) {
            System.out.println(persons[i].getSurname() + " " + persons[i].getName());
        }

        System.out.println("");
        Person[] sortedPersons = Sorter.sorter(persons);

        for (int i = 0; i <= 4; i++) {
            System.out.println(sortedPersons[i].getSurname() + " " + sortedPersons[i].getName());
        }

        System.out.println("");
        Rectangle rectangle = new Rectangle(20, 14.5);
        System.out.println(rectangle.calculateArea());
    }
}
