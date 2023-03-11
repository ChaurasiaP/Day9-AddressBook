import java.util.ArrayList;
import java.util.Scanner;
//UC4
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
                switch (choice) 
                    case 1:
                        System.out.println("First name:");
                        Scanner first = new Scanner(System.in);
                        contact.firstName = first.nextLine();
                        System.out.println("First name edited succesfully");
                        break;
                    case 2:
                        System.out.println("Last name:");
                        Scanner last = new Scanner(System.in);
                        contact.lastName = last.nextLine();
                        System.out.println("Last name edited succesfully");
                        break;
                    case 3:
                        System.out.println("Address:");
                        Scanner addInput = new Scanner(System.in);
                        contact.address = addInput.nextLine();
                        System.out.println("Address edited succesfully");
                        break;

                    case 4:
                        System.out.println("City:");
                        Scanner cityInput = new Scanner(System.in);
                        contact.city = cityInput.nextLine();
                        System.out.println("City edited succesfully");
                        break;
                    case 5:
                        System.out.println("State:");
                        Scanner stateInput = new Scanner(System.in);
                        contact.state = stateInput.nextLine();
                        System.out.println("State edited succesfully");
                        break;
                    case 6:
                        System.out.println("Zip:");
                        Scanner zipInput = new Scanner(System.in);
                        contact.zip = zipInput.nextLine();
                        System.out.println("Zip edited succesfully");
                        break;
                    case 7:
                        System.out.println("Phone number:");
                        Scanner inputNum = new Scanner(System.in);
                        contact.phoneNumber = inputNum.nextLine();
                        System.out.println("Phone Number edited succesfully");
                        break;
                    case 8:
                        System.out.println("Email:");
                        Scanner inputEmail = new Scanner(System.in);
                        contact.email = inputEmail.nextLine();
                        System.out.println("Email edited succesfully");
                        break;
                }
            }
        }
        if (flag == 0)
            System.out.println("Contact not found!!!");
    }

    public void deleteContact() {

        System.out.println("Enter the contact to delete: ");
        System.out.println("Enter First Name: ");
        String fname = sc.nextLine();
        System.out.println("Enter Last Name:");
        String lname = sc.nextLine();

        for (int j = 0; j < contactList.size(); j++) {
            Contact contact = contactList.get(j);
            if (contact.firstName.equals(fname) && contact.lastName.equals(lname)) {
                contactList.remove(contact);
                System.out.println("contact deleted successfully");
            } else {
                System.out.println("contact does not exist");
            }
        }
    }
}
