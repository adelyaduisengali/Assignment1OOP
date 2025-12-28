package model;

// 2. Student реализует только один интерфейс
// 5. Класс final
public final class Student extends Human implements IStudyable {
    private String studentId;
    private float gpa;
    // 5. Final поле
    private final String university;

    public Student(int age, String name, boolean isAlive, String studentId, float gpa, String university) {
        super(age, name, isAlive);
        this.studentId = studentId;
        this.gpa = gpa;
        this.university = university;
    }

    // 5. Final метод
    public final void showUniversity() {
        System.out.println("University: " + university);
    }

    @Override
    public void study() {
        System.out.println(name + " is studying.");
    }

    @Override
    public void doHomework() {
        System.out.println(name + " is doing homework.");
    }

    @Override
    public void getInfo() {
        System.out.println("Student: " + name + ", Age: " + age + ", GPA: " + gpa);
    }
}