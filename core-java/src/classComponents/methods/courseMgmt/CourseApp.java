package classComponents.methods.courseMgmt;

public class CourseApp {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();
        courseController.addCourse();
        courseController.updateCourse();
        courseController.deleteCourse();
        courseController.getCourse();
    }
}
