import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        System.out.println(myLinkedList);

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.remove(0);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
