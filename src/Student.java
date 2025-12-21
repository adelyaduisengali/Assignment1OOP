public class Student extends Human {
    private String major;
    private float gpa;

    public Student() {
        super();
    }

    public Student(int age, String name, boolean isAlive, String major, float gpa) {
        super(age, name, isAlive);
        this.major = major;
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public void describe() {
        System.out.println("This is a student majoring in " + major + " with GPA " + gpa + ".");
    }
}