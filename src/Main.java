import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBooks addressBooks = new AddressBooks();
        boolean inputUser = false;
        while (!inputUser) {
            System.out.println("Address Book:");
            System.out.println("1. Add contact");
            System.out.println("2. Find a contact");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");

            Scanner inputFormUser = new Scanner(System.in);
            int choiseUser =inputFormUser.nextInt();
            switch (choiseUser){
                case 1 -> addressBooks.addCotact();
                case 2 -> addressBooks.findContact();
                case 3 -> addressBooks.displayContacts();
                case 4 -> {
                    System.out.println("Exit");
                    inputUser = true;
                }
                default -> System.out.println("Invalid choice. Please re-enter.");
            }
        }
    }
}