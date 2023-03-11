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

    public void editContact() {

        System.out.println("Enter the contact whose details are to be edited: ");
        System.out.println("Enter First Name: ");
        String fname = sc.nextLine();
        System.out.println("Enter Last Name: ");
        String lname = sc.nextLine();

        int flag = 0;
        for (int j = 0; j < contactList.size(); j++) {
            Contact contact = contactList.get(j);
            if (contact.firstName.equals(fname) && contact.lastName.equals(lname)) {
                flag = 1;
                System.out.println("First Name : " + contact.firstName);
                System.out.println("Last Name  : " + contact.lastName);
                System.out.println("Address    : " + contact.address);
                System.out.println("City       : " + contact.city);
                System.out.println("State      : " + contact.state);
                System.out.println("Zip        : " + contact.zip);
                System.out.println("Phone Number:" + contact.phoneNumber);
                System.out.println("Email      : " + contact.email);
                System.out.println("---------------------------------------");
                System.out.println("Enter the number which you want to edit\n1.First Name\n2.Last Name\n3.Address\n4.C\n5.State\n6.Zip\n7.Phone Number\n8.Email");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("First name:");
                        Scanner sc = new Scanner(System.in);
                        contact.firstName = sc.nextLine();
                        System.out.println("First name edited succesfully");
                        break;
                    case 2:
                        System.out.println("Last name:");
                        Scanner scanner = new Scanner(System.in);
                        contact.lastName = scanner.nextLine();
                        System.out.println("Last name edited succesfully");
                        break;
                    case 3:
                        System.out.println("Address:");
                        Scanner s = new Scanner(System.in);
                        contact.address = s.nextLine();
                        System.out.println("Address edited succesfully");
                        break;

                    case 4:
                        System.out.println("City:");
                        Scanner scan = new Scanner(System.in);
                        contact.city = scan.nextLine();
                        System.out.println("City edited succesfully");
                        break;
                    case 5:
                        System.out.println("State:");
                        Scanner userInput = new Scanner(System.in);
                        contact.state = userInput.nextLine();
                        System.out.println("State edited succesfully");
                        break;
                    case 6:
                        System.out.println("Zip:");
                        Scanner user = new Scanner(System.in);
                        contact.zip = user.nextLine();
                        System.out.println("Zip edited succesfully");
                        break;
                    case 7:
                        System.out.println("Phone number:");
                        Scanner input = new Scanner(System.in);
                        contact.phoneNumber = input.nextLine();
                        System.out.println("Phone Number edited succesfully");
                        break;
                    case 8:
                        System.out.println("Email:");
                        Scanner in = new Scanner(System.in);
                        contact.email = in.nextLine();
                        System.out.println("Email edited succesfully");
                        break;
                }
            }
        }
        if (flag == 0)
            System.out.println("Contact not found!!!");
    }
}
