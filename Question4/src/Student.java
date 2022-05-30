public class Student extends Person{
    int studentId;
    String courseEnrolled;
    int courseFee;

    public Student(int studentId, String courseEnrolled, int courseFee) {
        this.studentId = studentId;
        this.courseEnrolled = courseEnrolled;
        this.courseFee = courseFee;
    }

    @Override
    public String toString() {
        return "Student[studentId="+studentId+", courseFee="+courseFee+", courseEnrolled="+courseEnrolled+", address=Address[city="+address.city+", state="+address.state+", pinCode="+address.pinCode+"]]";
    }
}
