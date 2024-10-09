public class CourseUnit extends Student {
    String CourseUnitN;

    public CourseUnit(int studentID, String studentName, String courseUnitN) {
        super(studentID, studentName);
        CourseUnitN = courseUnitN;
    }

    public String getCourseUnitN() {
        return CourseUnitN;
    }

    @Override
    public void showStudentDetails() {
        super.showStudentDetails();
        System.out.println("The Course Units of the semester is:" + getCourseUnitN());
    }

}
