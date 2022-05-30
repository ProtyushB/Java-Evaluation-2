public class Person {
    String name;
    String gender;
    Address address = new Address();

    @Override
    public String toString() {
        return "Name: "+name+"\n"+"Gender: "+gender;
    }
}
