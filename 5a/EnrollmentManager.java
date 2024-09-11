public class EnrollmentManager implements IEnrollmentManager {
    private IStudentRepository studentRepo;
    private ICourseRepository courseRepo;

    public EnrollmentManager(IStudentRepository studentRepo, ICourseRepository courseRepo) {
        this.studentRepo = studentRepo;
        this.courseRepo = courseRepo;
    }

    @Override
    public void enroll(String studentId, String courseId) {
        Student student = studentRepo.getById(studentId);
        Course course = courseRepo.getById(courseId);
        if (student != null && course != null) {
            student.addCourse(course);
            course.addStudent(student);
        }
    }
}
