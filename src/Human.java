public class Human {
    private int age;
    private String name;
    private boolean isAlive;

    public Human() {
    }

    public Human(int age, String name, boolean isAlive) {
        this.age = age;
        this.name = name;
        this.isAlive = isAlive;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }

    public void describe() {
        System.out.println("This is a general human description.");
    }
}