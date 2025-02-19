import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Philosophers {
    public static void main(String[] args) {
        String[] Phils = {"Platon", "Sokrat", "Aristotel", "Marks", "Pifagor"}; // PHILOSOPHERS
        Lock[] forks = new Lock[Phils.length]; // array with forks
        Main[] phils_array = new Main[Phils.length]; // array with philosophers

        for (int i = 0; i < Phils.length; i++) {
            forks[i] = new ReentrantLock(true);
        }

        Semaphore table = new Semaphore(Phils.length - 1, true);

        for (int i = 0; i < Phils.length; i++) {
            Lock leftFork = forks[i];
            Lock rightFork = forks[(i + 1) % Phils.length]; // +1 - right fork for the 5th phil is the left for the 1st

            phils_array[i] = new Main(leftFork, rightFork, Phils[i], table);
            phils_array[i].start();
        }
    }
}
