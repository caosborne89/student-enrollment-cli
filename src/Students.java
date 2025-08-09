import java.util.ArrayList;

public class Students {
    private ArrayList<Student> studentList;

    Students() {
        this.studentList = new ArrayList<Student>();
    }

    public void addStudent(Student newStudent) {
        this.studentList.add(newStudent);
    }

    public void printStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students registered!");
            return;
        }

        System.out.println("--- All Students ---");
        int currCount = 1;

        for (Student student : this.studentList) {
            System.out.println(currCount + ". " + student.getName());
            currCount++;
        }

        System.out.println();
    }
}
