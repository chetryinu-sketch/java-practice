class StudentDetails {
    String name;
    int rollNumber;
    double marks;

    static int objectCount = 0;

    StudentDetails() {
        name = "Unknown";
        rollNumber = 0;
        marks = 0.0;
        objectCount++;
    }
    StudentDetails(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = 0.0;
        objectCount++;
    }
    StudentDetails(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        objectCount++;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("**********************");
    }
    static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }
    public static void main(String[] args) {

        System.out.println("Name: Inu Chetry");
        System.out.println("URN: 2581328");

        StudentDetails s1 = new StudentDetails();

        StudentDetails s2 = new StudentDetails("Inu", 101);

        StudentDetails s3 = new StudentDetails("Yuki", 102, 89.5);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

        StudentDetails.displayObjectCount();
    }
}