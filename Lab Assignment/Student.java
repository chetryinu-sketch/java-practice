// EXPERIMENT 3: Classes, Objects, and Constructors CO1
// 1. Create a class Student with attributes name, roll number, and marks. Instantiate
// objects and display details using parameterized and default constructors.

class Student {
    String name;
    int rollNumber;
    double marks;

    Student() {
        name = "Unknown";
        rollNumber = 0;
        marks = 0.0;
    }
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        System.out.println("Name: Inu Chetry");
        System.out.println("URN: 2581328");

        Student s1 = new Student();
        Student s2 = new Student("Rahul", 101, 85.5);

        System.out.println("Student 1 (Default Constructor):");
        s1.displayDetails();

        System.out.println("Student 2 (Parameterized Constructor):");
        s2.displayDetails();
    }
}
