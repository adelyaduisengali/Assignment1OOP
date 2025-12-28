package model;

public abstract class Human {
    // 6. Protected поля
    protected int age;
    protected String name;
    protected boolean isAlive;

    public Human(int age, String name, boolean isAlive) {
        this.age = age;
        this.name = name;
        this.isAlive = isAlive;
    }

    public void greet() {
        System.out.println("Hello, my name is " + name);
    }

    // 4. Абстрактный метод
    public abstract void getInfo();
}