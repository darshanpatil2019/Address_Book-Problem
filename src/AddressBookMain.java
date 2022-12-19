public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        Contacts contacts = new Contacts("Darshan","Patil","Karve Nagar","Pune", "Maharashtra",411048,8379050224L,"iampatildarsh@gmail.com");
        System.out.println(contacts);
    }
}