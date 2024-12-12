public class GuardWorker extends Employee implements Worker {
    private String shift;
    private boolean isArmed;

    public GuardWorker(String name, String surname, String gender, boolean active, String position, double payment, int experience, String department, String shift, boolean isArmed) {
        super(name, surname, gender, active, position, payment, experience, department);
        this.shift = shift;
        this.isArmed = isArmed;
    }

    @Override
    public void work() {
        System.out.println(getName() + " " + getSurname()+ " is protecting the object during the " + shift + " shift.");
    }

    // Геттеры и сеттеры
    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public boolean isArmed() {
        return isArmed;
    }

    public void setArmed(boolean armed) {
        isArmed = armed;
    }
}