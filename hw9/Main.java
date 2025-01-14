import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        Scanner scanner = new Scanner(System.in);

        try {
            // Добавление студентов
            for (int i = 0; i < 2; i++) { // Добавим 2 студента для примера
                System.out.print("Введите возраст: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.print("Введите имя: ");
                String firstName = scanner.nextLine();
                System.out.print("Введите фамилию: ");
                String lastName = scanner.nextLine();
                System.out.print("Введите отчество: ");
                String middleName = scanner.nextLine();
                System.out.print("Введите курс: ");
                int course = Integer.parseInt(scanner.nextLine());
                System.out.print("Введите средний балл: ");
                double averageScore = Double.parseDouble(scanner.nextLine());

                group.addStudent(new Student(age, firstName, lastName, middleName, course, averageScore));
            }

            group.showStudents();
            group.removeStudent(0); // Удаляем первого студента
            group.showStudents();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}