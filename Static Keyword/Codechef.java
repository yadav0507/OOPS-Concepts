class Student {
    String name;
    static String schoolName = "Greenwood High"; // Shared by all students

    Student(String stdName) {
        name = stdName;
    }

    void displayInfo() {
        System.out.println(name + " studies at " + schoolName);
    }
}

public class Codechef {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.displayInfo();
        s2.displayInfo();
        Student.schoolName = "Hari krishna";
        s1.displayInfo();
        s2.displayInfo();
        
    }
    
}
