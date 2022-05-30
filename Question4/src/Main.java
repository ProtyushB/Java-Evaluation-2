public class Main {
    public static void main(String[] args) {
        Person newStudent = generatePerson(new Student(1,"JA111",300000));
        Person newTeacher = generatePerson(new Instructor(456,45612));

        System.out.println(newStudent);
        System.out.println(newTeacher);
    }

    public static Person generatePerson(Person person){

        person.address.city="Chennai";
        person.address.state="TN";
        person.address.pinCode="60001";

        return person;
    }
}
