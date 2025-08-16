import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    Course course;
    CourseTest() {
        this.course = new Course("Introduction to Computer Science", "CSC100");
    }

    @org.junit.jupiter.api.Test
    void getName() {
        String name = this.course.getName();
        assertEquals("Introduction to Computer Science", name);
    }

    @org.junit.jupiter.api.Test
    void getId() {
        assertEquals("CSC100", this.course.getId());
    }

    @org.junit.jupiter.api.Test
    void addStudent() {
        Student student = new Student("Bruce Wayne", "S873");
        this.course.addStudent(student);
        Collection<Student> students = this.course.getStudents();
        assertTrue(students.contains(student));
    }

    @org.junit.jupiter.api.Test
    void getStudents() {
        Student studentA = new Student("Clark Kent", "S356");
        Student studentB = new Student("J'onn J'onzz", "S353");
        Student studentC = new Student("Bruce Wayne", "S344");
        Student studentD = new Student("Oliver Queen", "S543");

        this.course.addStudent(studentA);
        this.course.addStudent(studentB);
        this.course.addStudent(studentC);
        this.course.addStudent(studentD);

        List<Student> students = new ArrayList<>();
        students.add(studentA);
        students.add(studentB);
        students.add(studentC);
        students.add(studentD);

        assertEquals(students, this.course.getStudents());
    }
}