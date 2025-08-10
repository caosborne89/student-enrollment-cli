import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Courses {
    Map<String,Course> courseList;

    Courses() {
        this.courseList = new HashMap<>();
    }

    public void addCourse(Course course) {
       this.courseList.put(course.getId(), course);
    }

    public void printCourses() {
        if (this.courseList.isEmpty()) {
            System.out.println("No classes in the catalog.");
            return;
        }

        System.out.println("--- All Courses ---");

        int count = 1;

        for (Course course : getCourseList().values()) {
            System.out.println(count + ". " + course.getName() + " (ID: " + course.getId() + ")");
            count++;
        }

        System.out.println();
    }

    public Course getCourse(String courseId) {
        return getCourseList().getOrDefault(courseId, null);
    }

    public Map<String,Course> getCourseList() {
        return this.courseList;
    }
}
