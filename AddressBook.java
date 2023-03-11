import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Contact contact = new Contact();
    ArrayList<Contact> contactList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addContact() {

        System.out.println("First Name :");
        contact.setFirstName(sc.nextLine());

        System.out.println("Last Name :");
        contact.setLastName(sc.nextLine());

        System.out.println("Address :");
        contact.setAddress(sc.nextLine());

        System.out.println("City :");
        contact.setCity(sc.nextLine());

        System.out.println("State :");
        contact.setState(sc.nextLine());

        System.out.println("Zip :");
        contact.setZip(sc.nextLine());

        System.out.println("Phone Number :");
        contact.setPhoneNumber(sc.nextLine());

        System.out.println("Email :");
        contact.setEmail(sc.nextLine());

        contactList.add(contact);
    }
}
