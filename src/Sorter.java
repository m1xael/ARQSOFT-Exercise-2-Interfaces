import java.util.Collections;
import java.util.List;

public class Sorter {

    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        Collections.sort(list);
    }
}
