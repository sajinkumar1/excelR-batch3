import java.util.*;

class HashSetDemo2 {
    void HashSetMethod() {
        HashSet<String> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 strings: ");
        for (int i = 0; i < 10; i++) {
            String s = sc.next();
            hashSet.add(s);
        }
        System.out.println(hashSet);
        sc.close();
    }
}

class Demo032 {
    public static void main(String[] args) {
        HashSetDemo2 obj = new HashSetDemo2();
        obj.HashSetMethod();
    }
}