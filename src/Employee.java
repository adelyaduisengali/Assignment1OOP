public class Employee extends Human {
    private String position;
    private float salary;
    private static int employeeCount = 0;

    public Employee() {
        super();
        employeeCount++;
    }

    public Employee(int age, String name, boolean isAlive, String position, float salary) {
        super(age, name, isAlive);
        this.position = position;
        this.salary = salary;
        employeeCount++;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void describe() {
        System.out.println("This is an employee in position " + position + " with salary " + salary + ".");
    }
}