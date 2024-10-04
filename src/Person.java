public class Person implements Comparable<Person> {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int compareTo(Person other) {
        int surnameCompare = this.surname.compareTo(other.surname);
        return (surnameCompare != 0) ? surnameCompare : this.name.compareTo(other.name);
    }

}
