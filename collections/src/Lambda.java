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
    }
}

