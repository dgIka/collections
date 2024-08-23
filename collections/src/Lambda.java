import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface Executable {
    void execute();
}

class  Runner {
    public void run(Executable e) {
        e.execute();
    }
}

public class Lambda {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Hello"));
        thread.start();

        Runner runner = new Runner();
        runner.run(() -> System.out.println("hello"));

        List<Integer> list1 = new ArrayList<>();
        int[] arr1 = new int[10];

        fillArr(arr1);
        fillList(list1);

        arr1 = Arrays.stream(arr1).map(a -> a * 2).toArray();
        list1 = list1.stream().map(a -> a * 2).toList();

        arr1 = Arrays.stream(arr1).map(a -> 3).toArray();

        System.out.println(Arrays.toString(arr1));
        System.out.println(list1);

        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillList(list2);
        fillArr(arr2);

        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }
}

