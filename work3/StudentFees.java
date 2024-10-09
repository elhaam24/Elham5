public class StudentFees extends Student {
    int schoolfees;

    public StudentFees(int studentID, String studentName, int schoolfees) {
        super(studentID, studentName);
        this.schoolfees = schoolfees;
    }

    @Override
    public void showStudentDetails() {
        super.showStudentDetails();
        System.out.println("The Student fees is: " + schoolfees);
    }

}
