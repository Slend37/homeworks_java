import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

class Main extends Thread {
    private final Lock leftFork;
    private final Lock rightFork;
    private final String name;
    private final Semaphore table;

    public Main(Lock leftFork, Lock rightFork, String name, Semaphore table) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.name = name;
        this.table = table;
    }
    //thinking
    private void think() throws InterruptedException {
        System.out.println(name + " is thinking.");
        Thread.sleep((long) (Math.random() * 1000));
    }
    //eating
    private void eat() throws InterruptedException {
        System.out.println(name + " is eating.");
        Thread.sleep((long) (Math.random() * 1000));
    }

    @Override
    public void run() {
        try {
            while (true) {
                think();

                table.acquire();

                leftFork.lock();
                System.out.println(name + " took the left fork.");
                rightFork.lock();
                System.out.println(name + " took the right fork.");

                eat();

                rightFork.unlock();
                System.out.println(name + " put the left fork.");
                leftFork.unlock();
                System.out.println(name + " put the right fork.");

                table.release();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }
}