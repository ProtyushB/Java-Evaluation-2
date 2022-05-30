public class Instructor extends Person{
    int instructorId;
    int salary;

    public Instructor(int instructorId, int salary) {
        this.instructorId = instructorId;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor[instructorId="+instructorId+", salary="+salary+", address=Address[city="+address.city+", state="+address.state+", pinCode="+address.pinCode+"]]";
    }
}
