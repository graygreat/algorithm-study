package etc.test;

public class Main implements Runnable {
    @Override
    public void run() {
        System.out.println("run");
    }

    public void play() {
        System.out.println("hello");
    }
}
