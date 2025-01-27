import java.util.Iterator;
import java.util.*;

class LinkedHashSetDemo {
    void linkedHashsetMethod() {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            lhs.add(x);
        }
        System.out.println(lhs);
        System.out.print("Enter an integer to remove: ");
        int a = sc.nextInt();
        lhs.remove(a);
        int sum = 0;
        for (Integer x : lhs) {
            sum += x;
        }

        System.out.println("The sum is :" + sum);

        Iterator it = lhs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

public class Demo033 {
    public static void main(String[] args) {
        LinkedHashSetDemo obj = new LinkedHashSetDemo();
        obj.linkedHashsetMethod();
    }
}