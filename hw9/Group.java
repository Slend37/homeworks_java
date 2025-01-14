import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Group {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) throws Exception {
        if (students.size() >= 15) throw new Exception("Группа переполнена.");
        students.add(student);
    }

    public void removeStudent(int index) throws Exception {
        if (students.size() <= 3) throw new Exception("Невозможно удалить студента.");
        students.remove(index);
    }

    public void showStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }
}