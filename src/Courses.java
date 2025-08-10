import java.util.ArrayList;
import java.util.List;

public class Courses {
    List<Course> courseList;

    Courses() {
        this.courseList = new ArrayList<Course>();
    }

    public void addCourse(Course course) {
       this.courseList.add(course);
    }

    public void printCourses() {
        if (this.courseList.isEmpty()) {
            System.out.println("No classes in the catalog.");
            return;
        }

        System.out.println("--- All Courses ---");

        int count = 1;

        for (Course course : getCourseList()) {
            System.out.println(count + ". " + course.getName() + " (ID: " + course.getId() + ")");
            count++;
        }

        System.out.println();
    }

    public List<Course> getCourseList() {
        return this.courseList;
    }
}
