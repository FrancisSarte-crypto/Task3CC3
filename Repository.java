import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    private static final String DB_URL = "jdbc:sqlite:Sample3.db";

    public Repository() {
        // No table creation here
    }

    public void addStudent(Student student) {

        String sql = """
            INSERT INTO tbl_info
            (studentNumber, firstName, middleInitial, age, gender, email, course, yearLevel, section, school)
            VALUES (?, ?, ?, ?, ?, ?, ?, ?)
            """;

        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, student.getStudentNumber());
            pstmt.setString(2, student.getFirstName());
            pstmt.setString(3, student.getMiddleInitial());
            pstmt.setInt(4, student.getAge());
            pstmt.setString(5, student.getGender());
            pstmt.setString(6, student.getEmail());
            pstmt.setString(7, student.getCourse());
            pstmt.setInt(8, student.getYearLevel());
            pstmt.setString (9, student.getSection());
            pstmt.setString(10, student.getSchool());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error inserting student: " + e.getMessage());
        }
    }

    public List<Student> getAllStudents() {

        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM tbl_info";

        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

                students.add(new Student(
                        rs.getInt("studentNumber"),
                        rs.getString("firstName"),
                        rs.getString("middleInitial"),
                        rs.getInt("age"),
                        rs.getString("gender"),
                        rs.getString("email"),
                        rs.getString("course"),
                        rs.getInt("yearLevel"),
                        rs.getSection("section"),
                        rs.getSchool("school")
                ));
            }

        } catch (SQLException e) {
            System.out.println("Error retrieving students: " + e.getMessage());
        }

        return students;
    }
}