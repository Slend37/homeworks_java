import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private int age;
    private String firstName, lastName, middleName;
    private int course;
    private double averageScore;

    public Student(int age, String firstName, String lastName, String middleName, int course, double averageScore) throws NotCorrectAgeException {
        setAge(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.course = course;
        this.averageScore = averageScore;
    }

    public void setAge(int age) throws NotCorrectAgeException {
        if (age < 16 || age > 60) throw new NotCorrectAgeException("Возраст должен быть от 16 до 60 лет.");
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s, Возраст: %d, Курс: %d, Средний балл: %.2f", firstName, lastName, age, course, averageScore);
    }
}