package model;

// 2. Employee реализует оба интерфейса
public class Employee extends Human implements IWorkable, IStudyable {
    private String position;
    private float salary;

    public Employee(int age, String name, boolean isAlive, String position, float salary) {
        super(age, name, isAlive);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println(name + " is working as " + position);
    }

    @Override
    public void getSalary() {
        System.out.println(name + " earns " + salary);
    }

    @Override
    public void study() {
        System.out.println(name + " is learning new skills.");
    }

    @Override
    public void doHomework() {
        System.out.println(name + " is practicing work tasks.");
    }

    @Override
    public void getInfo() {
        System.out.println("Employee: " + name + ", Position: " + position);
    }
}