import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBooks {

    private ArrayList<Contact> contacts;

    public AddressBooks() {
        contacts = new ArrayList<>();
    }
    public  void addCotact () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user's information:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Company: ");
        String company = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Phone: ");
        int phone = scanner.nextInt();
        Contact contact = new Contact(name, company, email, phone);
        contacts.add(contact);

        System.out.println("Contact added.");
    }
    public  void findContact () {
        System.out.println("Enter name to find: ");
    }
    public  void displayContacts () {
        if(contacts.isEmpty()) {
            System.out.println("No contacts ");
        } else {
            System.out.println("Address Book:");
            for(Contact contact : contacts) {
                System.out.println("Name: " + contact.getName());
                System.out.println("Company: " + contact.getCompany());
                System.out.println("Email: " + contact.getEmail());
                System.out.println("Phone: " + contact.getPhone());
            }
        }
    }
}
