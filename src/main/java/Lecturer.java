public class Lecturer extends User {
    public Lecturer(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public String toString() {
        return firstName + ";" + lastName + ";" + id + ";" + "L" ;
    }
}
