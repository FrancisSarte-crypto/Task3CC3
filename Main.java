import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Repository repository = new Repository();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <=2; i++) {

            System.out.println("\nEnter Student #" + i + ":");

            System.out.print("Student Number: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Middle Initial: ");
            String middleInitial = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Gender: ");
            String gender = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Course: ");
            String course = scanner.nextLine();

            System.out.print("Year Level: ");
            int yearLevel = scanner.nextInt();
            scanner.nextLine();

            Student student = new Student(
                    id, firstName, middleInitial,
                    age, gender, email, course, yearLevel
            );
            repository.addStudent(student);
        }

        List<Student> students = repository.getAllStudents();
        System.out.println("\n=== LIST OF STUDENTS ===");
        for (Student s : students) {
            System.out.println(
                    s.getStudentNumber() + " | " +
                            s.getFirstName() + " | " +
                            s.getCourse() + " | Year " +
                            s.getYearLevel()
            );
        }

        scanner.close();
    }
}