public class Student extends User {
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String toString() {
        return firstName + ";" + lastName + ";" + id + ";" + "S";
    }
}
