import java.util.HashMap;
import java.util.Map;

public class Students {
    Map<String, Student> studentList;

    Students() {
        this.studentList = new HashMap<>();
    }

    public void addStudent(Student newStudent) {
        this.studentList.put(newStudent.getId(), newStudent);
    }

    public void printStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students registered!");
            return;
        }

        System.out.println("--- All Students ---");
        int currCount = 1;

        for (Student student : this.studentList.values()) {
            System.out.println(currCount + ". " + student.getName());
            currCount++;
        }

        System.out.println();
    }

    public Student getStudent(String studentId) {
        return this.studentList.getOrDefault(studentId, null);
    }
}
