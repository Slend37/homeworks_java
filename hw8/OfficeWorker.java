public class OfficeWorker extends Employee implements Worker {
    private String currentTask;
    private int numberOfTasks;

    public OfficeWorker(String name, String surname, String gender, boolean active, String position, double payment, int experience, String department, String currentTask, int numberOfTasks) {
        super(name, surname, gender, active, position, payment, experience, department);
        this.currentTask = currentTask;
        this.numberOfTasks = numberOfTasks;
    }

    @Override
    public void work() {
        System.out.println(getName() + " " + getSurname() + " is working with the project: " + currentTask + ".");
    }

    // Геттеры и сеттеры

    public String getCurrentTask() {
        return currentTask;
    }

    public void setCurrentTask(String currentTask) {
        this.currentTask = currentTask;
    }

    public int getNumberOfTasks() {
        return numberOfTasks;
    }

    public void setNumberOfTasks(int numberOfTasks) {
        this.numberOfTasks = numberOfTasks;
    }
}