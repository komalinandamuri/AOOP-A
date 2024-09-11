 public class Main {
     public static void main(String[] args) {
         // Create in-memory repositories
         IStudentRepository studentRepo = new InMemoryStudentRepository();
         ICourseRepository courseRepo = new InMemoryCourseRepository();

         // Create an enrollment manager
         IEnrollmentManager enrollmentManager = new EnrollmentManager(studentRepo, courseRepo);

         // Create some students and courses
         Student student1 = new Student("S1", "John Doe");
         Student student2 = new Student("S2", "Jane Smith");

         Course course1 = new Course("C1", "Mathematics");
         Course course2 = new Course("C2", "Science");

         // Add students and courses to repositories
         studentRepo.add(student1);
         studentRepo.add(student2);

         courseRepo.add(course1);
         courseRepo.add(course2);

         // Enroll students in courses
         enrollmentManager.enroll("S1", "C1");
         enrollmentManager.enroll("S2", "C2");

         // Display enrolled students for each course
         System.out.println("Mathematics course students:");
         for (Student s : course1.getStudents()) {
             System.out.println(s.getName());
         }

         System.out.println("Science course students:");
         for (Student s : course2.getStudents()) {
             System.out.println(s.getName());
         }
     }
 }
