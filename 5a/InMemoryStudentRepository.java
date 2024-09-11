import java.util.HashMap;
import java.util.Map;

public class InMemoryStudentRepository implements IStudentRepository {
    private Map<String, Student> storage = new HashMap<>();

    @Override
    public void add(Student student) { storage.put(student.getId(), student); }
    @Override
    public Student getById(String id) { return storage.get(id); }
}
