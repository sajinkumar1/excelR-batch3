public class PS001 {
    // Instance variables
    private int id;
    private String firstname;
    private String lastname;
    private String address;

    // Constructor
    public PS001(int id, String firstname, String lastname, String address) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
        System.out.println("Address: " + address);
    }

    // Main method to test the PS001 class
    public static void main(String[] args) {
        PS001 emp1 = new PS001(101, "John", "Doe", "1234 Elm St, Springfield, IL");
        emp1.displayDetails();
    }
}

