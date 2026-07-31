import java.util.ArrayList;
import java.util.Scanner;

class Student {

    private int rollNo;
    private String name;
    private String department;

    public Student(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void display() {
        System.out.println("---------------------------");
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
    }
}
class Demo {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        int choice;

         do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
    static void addStudent() {
        System.out.println("\n--- ADD STUDENT ---");
        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        if (findStudent(rollNo) != null) {
            System.out.println("Roll Number already exists.");
            return;
        }
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        Student student = new Student(rollNo, name, department);
        students.add(student);
        System.out.println("Student added successfully.");
    }
    static void viewStudents() {
        System.out.println("\n--- STUDENT LIST ---");

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student student : students) {
            student.display();
        }
    }
    static void searchStudent() {

        System.out.println("\n--- SEARCH STUDENT ---");

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        Student student = findStudent(rollNo);

        if (student != null) {
            System.out.println("Student Found:");
            student.display();
        } else {
            System.out.println("Student not found.");
        }
    }
    static void updateStudent() {

        System.out.println("\n--- UPDATE STUDENT ---");

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        Student student = findStudent(rollNo);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter New Name: ");
        student.setName(sc.nextLine());

        System.out.print("Enter New Department: ");
        student.setDepartment(sc.nextLine());

        System.out.println("Student details updated successfully.");
    }
    static void deleteStudent() {

        System.out.println("\n--- DELETE STUDENT ---");

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        Student student = findStudent(rollNo);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        students.remove(student);

        System.out.println("Student deleted successfully.");
    }
    static Student findStudent(int rollNo) {

        for (Student student : students) {
            if (student.getRollNo() == rollNo) {
                return student;
            }
        }
        return null;
    }
}