public interface Worker {
    default void work() {
        System.out.println("is working");
    }
}