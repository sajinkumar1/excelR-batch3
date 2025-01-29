import java.util.*;

class details {

    double totalprice = 0;

    void price() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the item name: ");
            String item = sc.next();
            System.out.print("Enter the quantity of the item: ");
            double quantity = sc.nextDouble();
            if (item.equals("item1")) {
                totalprice = totalprice + quantity * 100;
            } else if (item.equals("item2")) {
                totalprice = totalprice + quantity * 200;
            }
            System.out.println("Do you want to continue shopping? (yes/no): ");
            String choice = sc.next();
            if (choice.equals("no")) {
                break;
            }
        }
        sc.close();
        System.out.println("The total price of the items is: " + totalprice);
    }
}

class Test004 {
    public static void main(String[] args) {
        details dt = new details();
        dt.price();
    }
}