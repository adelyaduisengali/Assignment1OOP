import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(25, "Nurlan Akhmetov", true);
        Employee employee = new Employee(30, "Aigerim Sultanova", true, "Manager", 50000.0f);
        Student student = new Student(20, "Yerzhan Omarov", true, "Computer Science", 3.5f);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age for new student:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name for new student:");
        String name = sc.nextLine();
        System.out.println("Enter major for new student:");
        String major = sc.nextLine();
        System.out.println("Enter GPA for new student:");
        float gpa = sc.nextFloat();
        Student inputStudent = new Student(age, name, true, major, gpa);

        employee.setSalary(55000.0f);
        System.out.println("Updated employee salary: " + employee.getSalary());

        student.setGpa(3.8f);
        System.out.println("Updated student GPA: " + student.getGpa());

        human.introduce();
        human.describe();

        employee.introduce();
        employee.describe();

        student.introduce();
        student.describe();

        inputStudent.introduce();
        inputStudent.describe();
    }
}