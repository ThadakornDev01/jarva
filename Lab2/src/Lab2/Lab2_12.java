package Lab2;
import java.util.Scanner;

class Course {
    String courseId;
    String courseName;

    Course(String id, String name) {
        courseId = id;
        courseName = name;
    }

    String getCourseInfo() {
        return courseId + ": " + courseName;
   }
}
    
    class Student7 {
        String studentName;
        Course enrolledCourse;

        Student7(String name, Course course) {
            studentName = name;
            enrolledCourse = course;
        }

        void displayEnrollment() {
            System.out.println("Student: " + studentName);
            System.out.println("Enrolled in: " + enrolledCourse.getCourseInfo());
        }
}

    	public class Lab2_12 {

    		public static void main(String[] args) {
    			Scanner scanner = new Scanner(System.in);

    			String courseId = scanner.nextLine();
    			String courseName = scanner.nextLine();
    			String studentName = scanner.nextLine();

    			Course course = new Course(courseId, courseName);
    			Student7 student = new Student7(studentName, course);

    			student.displayEnrollment();

    			scanner.close();
    		}

}
