import model.*;

public class Main {
    public static void main(String[] args) {
        // 7. Разные типы ссылок (Полиморфизм)

        // Ссылка на сам класс
        Student student = new Student(18, "Aruzhan", true, "S123", 3.5f, "KBTU");
        Employee employee = new Employee(30, "Dias", true, "Engineer", 500000);

        // Ссылка на суперкласс (Абстрактный класс)
        Human human1 = new Student(19, "Aliya", true, "S999", 3.8f, "SDU");
        Human human2 = new Employee(40, "Marat", true, "Manager", 700000);

        // Ссылка на интерфейсы
        IStudyable studyRef = student;
        IWorkable workRef = employee;

        // 8. Использование всех методов
        System.out.println("--- Student Methods ---");
        student.greet();
        student.study();
        student.doHomework();
        student.showUniversity();
        student.getInfo();

        System.out.println("\n--- Employee Methods ---");
        employee.greet();
        employee.work();
        employee.getSalary();
        employee.study();
        employee.doHomework();
        employee.getInfo();

        System.out.println("\n--- Polymorphism (Human references) ---");
        human1.getInfo();
        human2.getInfo();

        System.out.println("\n--- Interface references ---");
        studyRef.study();
        workRef.work();
    }
}