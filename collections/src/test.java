import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("bird");
        animals.add("horse");
        animals.add("pig");

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(500);
        numbers.add(23);
        numbers.add(165);
        numbers.add(52);

        Collections.sort(numbers);
        System.out.println(numbers);
    }

}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length()) return 1;
        else if (o1.length() < o2.length()) return -1;
        else return 0;
    }
}
