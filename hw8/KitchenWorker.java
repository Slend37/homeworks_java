public class KitchenWorker extends Employee implements Worker {
    private String specialty;
    private boolean isChef;

    public KitchenWorker(String name, String surname, String gender, boolean active, String position, double payment, int experience, String department, String specialty, boolean isChef) {
        super(name, surname, gender, active, position, payment, experience, department);
        this.specialty = specialty;
        this.isChef = isChef;
    }

    @Override
    public void work() {
        System.out.println(getName() + " " + getSurname() + " is cooking the " + getSpecialty() + ".");
    }

    // Геттеры и сеттеры
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public boolean isChef() {
        return isChef;
    }

    public void setChef(boolean chef) {
        isChef = chef;
    }
}