import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    Scanner sc = new Scanner(System.in);
    List<Contacts> person = new ArrayList<>();

    public void addPerson(){
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
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

       AddressBookMain main = new AddressBookMain();
       main.addPerson();
    }
}