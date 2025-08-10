import java.util.ArrayList;
import java.util.List;

public class Course {
    String name;
    String id;
    List<Student> students;

    Course(String name, String id) {
        this.name = name;
        this.id = id;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }
}
