import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    Scanner sc = new Scanner(System.in);
    List<Contacts> person = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBookMain main = new AddressBookMain();
        main.addPerson();
        main.editPerson();
        main.deletePerson();
    }


    public void addPerson() {
        System.out.println("Enter the First Name :");
        String firstName = sc.next();
        System.out.println("Enter the Last Name :");
        String lastName = sc.next();
        System.out.println("Enter the Address :");
        String address = sc.next();
        System.out.println("Enter the City :");
        String city = sc.next();
        System.out.println("Enter the State :");
        String state = sc.next();
        System.out.println("Enter the Zip-Code :");
        int zipcode = sc.nextInt();
        System.out.println("Enter the Phone Number:");
        long phoneNumber = sc.nextLong();
        System.out.println("Enter the Email :");
        String email = sc.next();

        //Creating contacts object and Passing Arguments Inside Constructor
        Contacts p = new Contacts(firstName, lastName, address, city, state, zipcode, phoneNumber, email);

        //Adding p object into the Linked list with Contact class Data type
        person.add(p);

        System.out.println("New Contact Added in Your Address Book");
        System.out.println(person);
    }

    //Editing Contact by Searching Name
    public void editPerson() {
        System.out.println("Do you Want to Edit (Yes / No)");
        String c = sc.next();

        if (c.equals("Yes")) {
            System.out.println("Enter name to Edit");
            String s = sc.next();

            for (int i = 0; i < person.size(); i++) {
                Contacts p = person.get(i);
                if (s.equals(p.getFirstName())) {
                    while (true) {
                        System.out.println("Enter Choice to edit 1)FirstName\n 2)LastName\n 3)Address\n 4)City\n 5)State\n 6)Zip-Code\n 7)PhoneNumber\n 8)Email\n 9)Exit");

                        int choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                p.setFirstName(sc.next());
                                break;
                            case 2:
                                p.setLastName(sc.next());
                                break;
                            case 3:
                                p.setAddress(sc.next());
                                break;
                            case 4:
                                p.setCity(sc.next());
                                break;
                            case 5:
                                p.setState(sc.next());
                                break;
                            case 6:
                                p.setZipCode(sc.nextInt());
                                break;
                            case 7:
                                p.setPhoneNumber(sc.nextLong());
                                break;
                            case 8:
                                p.setEmail(sc.next());
                                break;
                            case 9:
                                break;
                            default:
                                System.out.println("select correct choice");
                                break;
                        }
                        if (choice == 9)
                            break;
                    }
                    person.set(i, p);
                    System.out.println("Person after Editing");
                    System.out.println(person);
                }
            }
        }
    }

    // Deleting Contact From address Book
    public void deletePerson() {
        System.out.println("Do You Want to Delete person (Yes / No)");
        String c = sc.next();

        if (c.equals("Yes")) {
            System.out.println("Enter name to Delete person");
            String s = sc.next();

            for (int i = 0; i < person.size(); i++) {
                Contacts p = person.get(i);
                if (s.equals(p.getFirstName())){
                    person.remove(i); // deleting every index position
                }
            }
            System.out.println("Person Deleted");
            System.out.println(person);
        }
    }
}