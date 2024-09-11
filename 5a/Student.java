import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public List<Course> getCourses() { return courses; }
}
