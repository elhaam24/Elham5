public class Checker {
    public void identifyStudent(Student student){
        if (student instanceof StudentFees){
            System.out.println("its clear");
        }else if (student instanceof CourseUnit){
            System.out.println("register coureses");
        }else {
            System.out.println("unregister courses");
        }

    }
}
