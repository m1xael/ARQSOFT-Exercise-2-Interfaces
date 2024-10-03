public class Sorter {
    
    public static Person[] sorter(Person[] persons) {
        int n = persons.length;
        do {
            int newn = 0;
            for (int i = 1; i < n; i++) {
                String name1 = persons[i-1].getSurname() + persons[i-1].getName();
                String name2 = persons[i].getSurname() + persons[i].getName();
                
                if (name1.compareTo(name2) > 0) {

                    Person temp = persons[i-1];
                    persons[i-1] = persons[i];
                    persons[i] = temp;
                    
                    newn = i;
                }
            }
            n = newn;
        } while (n > 1);

        return persons;
    }
}
