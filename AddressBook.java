import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Contact contact = new Contact();
    ArrayList<Contact> contactList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addContact() {

        System.out.println("First Name :");
        contact.firstName = sc.nextLine();

        System.out.println("Last Name :");
        contact.lastName = sc.nextLine();

        System.out.println("Address :");
        contact.address = sc.nextLine();

        System.out.println("City :");
        contact.city = sc.nextLine();

        System.out.println("State :");
        contact.state = sc.nextLine();

        System.out.println("Zip :");
        contact.zip = sc.nextLine();

        System.out.println("Phone Number :");
        contact.phoneNumber = sc.nextLine();

        System.out.println("Email :");
        contact.email = sc.nextLine();

        contactList.add(contact);
    }
}
