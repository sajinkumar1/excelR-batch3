import java.util.HashSet;

class Person {
    private String name;
    private int age;
    private String phoneNumber;

    
    public Person(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Phone Number: " + phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;
        return age == person.age &&
                name.equals(person.name) &&
                phoneNumber.equals(person.phoneNumber);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age + phoneNumber.hashCode();
    }
}

public class Demo031 {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();

       
        people.add(new Person("Alice", 25, "123-456-7890"));
        people.add(new Person("Bob", 30, "987-654-3210"));
        people.add(new Person("Charlie", 22, "456-123-7890"));
        people.add(new Person("Alice", 25, "123-456-7890")); 

        System.out.println("Details of People in the HashSet:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}