public class Main {
    public static void main(String[] args) {
        StudentFees Fees = new StudentFees(111,"Abdi", 500);
        Fees.showStudentDetails();
        CourseUnit units = new CourseUnit(112,"Ahmed", "Six(6) units this term");
        units.showStudentDetails();

        Checker checker = new Checker();
        checker.identifyStudent(Fees);
        checker.identifyStudent(units);


        School school = new School();
        school.displayMessage();



    }
}
