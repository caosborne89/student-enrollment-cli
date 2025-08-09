import java.util.Scanner;

public class StudentEnrollmentApp {
    public static void main (String [] args) {
        System.out.println("Welcome to the Student Enrollment System\n" +
                "Type 'help' to see available commands.");

        Students students = new Students();

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
        System.out.println("Student added: " + newStudent.getName() + " (" + newStudent.getId() + ")");
        System.out.println();
    }
}
