import java.io.*;
import java.util.*;

public class Library {

    ArrayList<Item> itemsArrayList = new ArrayList<Item>();
    ArrayList<User> usersArrayList = new ArrayList<User>();

    public void addUserToLibrary(User... users) {
        if(usersArrayList.size() == 0) {
            for(User user: users) {
                user.setId(UUID.randomUUID().toString());
                usersArrayList.add(user);
            }
        } else {
            for(User user: users) {
                for (User existingUser: usersArrayList) {
                    if (existingUser.id == user.id) {
                        continue;
                    }
                    user.setId(UUID.randomUUID().toString());
                    usersArrayList.add(user);
                }
            }
        }
    }

    public void addItemToLibrary(Item... items) {
        for(Item item: items) {
            itemsArrayList.add(item);
        }
    }

    public boolean rentItemToUser(Item item, User user) {
        return true;
    }

    public void printListOfMagazines() {

    }

    public void printListOfBooks() {

    }

    public void printListOfUsers() {
        for(User user: usersArrayList) {
            System.out.println(user);
        }
    }

    public void importItemsFromFile(String csvFile) {

    }

    public void exportUsersWithItemsToFile(String csvFile) {

    }

    public static void main(String[] args) throws IOException {
        Library library = new Library();
        User student = new Student("Sara", "Student");
        User lecturer = new Lecturer("John", "Lecturer");
        library.addUserToLibrary(student, lecturer);
        library.printListOfUsers();
    }
}
