import java.util.ArrayList;
import java.util.Scanner;

class Friend {
    private String name;
    private int age;
    private String city;

    public Friend(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", City: " + city;
    }
}

public class Demo029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Friend> friends = new ArrayList<>();

        System.out.println("Enter details of 10 friends:");

        
        for (int i = 1; i <= 100; i++) {
            System.out.println("Friend " + i + ":");
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter City: ");
            String city = scanner.nextLine();

           
            friends.add(new Friend(name, age, city));
            System.out.println(); 
        }

       
        scanner.close();

        System.out.println("\nDetails of Friends:");
        for (Friend friend : friends) {
            System.out.println(friend);
        }
    }
}