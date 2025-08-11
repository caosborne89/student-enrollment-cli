import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    String id;
    List<Course> courses;
    Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public List<Course> getCourses() {
        return this.courses;
    }
}
