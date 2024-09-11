import java.util.ArrayList;
import java.util.List;

public class Course {
    private String id;
    private String name;
    private List<Student> students = new ArrayList<>();

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public List<Student> getStudents() { return students; }
}
