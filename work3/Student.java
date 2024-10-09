public class Student {
    int StudentID;
    String StudentName;

    public Student(int studentID, String studentName) {
        StudentID = studentID;
        StudentName = studentName;
    }

    public void showStudentDetails(){
        System.out.println("The Student ID is: " + StudentID);
        System.out.println("The Student Name is: " + StudentName);
    }
}
