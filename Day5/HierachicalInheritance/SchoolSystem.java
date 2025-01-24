package HierachicalInheritance;
class Person {
    String name;
    int age;
    // create constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
	// display result
    void displayRole() {
        System.out.println("This is a person.");
    }
}

class Teacher extends Person {
    String subject;
    // create constructor
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
	// display result
    void displayRole() {
        System.out.println(name + " is a Teacher. Teaches: " + subject);
    }
}

class Student extends Person {
    int grade;
    // create constructor
    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
	// display result
    void displayRole() {
        System.out.println(name + " is a Student. Grade: " + grade);
    }
}

class Staff extends Person {
    String department;
    // create constructor
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
	// display result
    void displayRole() {
        System.out.println(name + " is a Staff member. Department: " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith", 30, "Mathematics");
        Student student = new Student("Alice", 16, 10);
        Staff staff = new Staff("Mrs. Johnson", 45, "Administration");

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}
