import java.util.HashMap;
import java.util.Map;

public class InMemoryCourseRepository implements ICourseRepository {
    private Map<String, Course> storage = new HashMap<>();

    @Override
    public void add(Course course) { storage.put(course.getId(), course); }
    @Override
    public Course getById(String id) { return storage.get(id); }
}
