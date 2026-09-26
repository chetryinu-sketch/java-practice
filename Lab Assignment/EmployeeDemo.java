class Person {

    String name;
    int age;

    // Parent class constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Parent class method
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class
class Employee extends Person {

    int employeeId;
    double salary;

    // Child class constructor
    Employee(String name, int age, int employeeId, double salary) {

        // Calling parent class constructor
        super(name, age);

        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Child class method
    void displayEmployee() {

        // Calling parent class method
        super.displayPerson();

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {
        System.out.println("""
                Name: Inu Chetry
                URN: 2581328
                """);
        // Creating Employee object
        Employee emp = new Employee(
            "Siva", 20, 101, 45000.0
        );

        // Calling Employee method
        emp.displayEmployee();
    }
}