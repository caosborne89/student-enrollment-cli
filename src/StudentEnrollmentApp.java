import java.util.Scanner;

public class StudentEnrollmentApp {
    public static void main (String [] args) {
        System.out.println("Welcome to the Student Enrollment System\n" +
                "Type 'help' to see available commands.");

        Students students = new Students();
        Courses courses = new Courses();

        while(true) {
            Scanner scan = new Scanner(System.in);

            System.out.print("> ");
            String command = scan.nextLine();
            switch(command) {
                case "add_student":
                    addStudent(students);
                    break;
                case "list_students":
                    students.printStudents();
                    break;
                case "add_course":
                    addCourse(courses);
                    break;
                case "list_courses":
                    courses.printCourses();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Must provide a valid command. Type 'help' for available commands.");
            }
        }
    }

    public static void addStudent(Students students) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scan.nextLine();

        System.out.print("Enter student ID: ");
        String id = scan.nextLine();

        Student newStudent = new Student(name, id);
        students.addStudent(newStudent);

        System.out.println();
        System.out.println("Student added: " + newStudent.getName() + " (ID: " + newStudent.getId() + ")");
        System.out.println();
    }

    public static void addCourse(Courses courses) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter course name: ");
        String name = scan.nextLine();

        System.out.print("Enter course ID: ");
        String id = scan.nextLine();

        Course course = new Course(name, id);
        courses.addCourse(course);

        System.out.println();
        System.out.println("Course added: " + course.getName() + " (ID: " + course.getId() + ")");
        System.out.println();
    }
}
