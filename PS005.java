import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
                + "]";
    }
}

class CollectionMap {
    Map<Integer, Employee> map = new HashMap<Integer, Employee>();

    int addEmployee(Employee emp) {
        map.put(emp.getId(), emp);
        return 0;
    }

    int removeEmployee(int id) {
        map.remove(id);
        return 0;
    }

    Employee findEmployee(int id) {
        return map.get(id);
    }

    String getEmployeeList() {
        if (map.isEmpty()) {
            return null;
        }
        return map.values().toString();
    }
}

class PS005 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "A", 1000);
        Employee e2 = new Employee(2, "B", 2000);
        Employee e3 = new Employee(3, "C", 3000);
        Employee e4 = new Employee(4, "D", 4000);
        Employee e5 = new Employee(5, "E", 5000);

        CollectionMap cm = new CollectionMap();
        System.out.println("Added employees 1,2,3,4,5: " + cm.addEmployee(e1) + " " + cm.addEmployee(e2) + " "
                + cm.addEmployee(e3) + " " + cm.addEmployee(e4) + " " + cm.addEmployee(e5));

        System.out.println("\n" + cm.getEmployeeList());
        cm.removeEmployee(2);
        System.out.println("\n" + cm.getEmployeeList());
        System.out.println("\n" + cm.findEmployee(3));
    }
}