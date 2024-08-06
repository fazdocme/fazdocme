import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Person {
    private String name;
    private String address;
    private String email;

    public Person(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nEmail: " + email;
    }
}

public class PhoneNumberLookup {

    public static void main(String[] args) {
        // Predefined list of phone numbers and corresponding details
        Map<String, Person> phoneBook = new HashMap<>();
        phoneBook.put("+11234567890", new Person("John Doe", "123 Elm Street, Springfield", "john.doe@example.com"));
        phoneBook.put("+919876543210", new Person("Jane Smith", "456 Oak Street, Metropolis", "jane.smith@example.com"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 10-digit phone number with country code (e.g., +11234567890):");
        String phoneNumber = scanner.nextLine();

        Person person = phoneBook.get(phoneNumber);

        if (person != null) {
            System.out.println("Details for phone number " + phoneNumber + ":\n" + person);
        } else {
            System.out.println("No details found for phone number " + phoneNumber);
        }

        scanner.close();
    }
}
