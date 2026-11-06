# OOP in Java – Human, Student & Employee

A Java project demonstrating the core principles of object-oriented programming:
abstraction, inheritance, interfaces, polymorphism, encapsulation and the `final` keyword.

## Class structure
- `Human` – abstract base class with common fields (name, age, isAlive)
  and shared methods such as `greet()`
- `Student` – extends `Human`, implements `IStudyable`;
  stores student ID, GPA and university
- `Employee` – extends `Human`, implements both `IWorkable` and `IStudyable`;
  stores position and salary
- `IStudyable` – interface with `study()` and `doHomework()`
- `IWorkable` – interface with `work()` and `getSalary()`
- `Main` – creates objects and demonstrates all methods and reference types

## OOP concepts used
- **Abstraction** – `Human` is an abstract class that cannot be instantiated directly
- **Inheritance** – `Student` and `Employee` reuse fields and constructor of `Human` via `super`
- **Interfaces** – one class can implement several interfaces (`Employee`)
- **Polymorphism** – objects are accessed through their own class, through the
  abstract superclass (`Human human = new Student(...)`) and through interface
  references (`IStudyable`, `IWorkable`); each class overrides `getInfo()`
- **Encapsulation** – private fields such as `salary`, `gpa` and `position`
- **`final` keyword** – `Student` is a final class with a final field (`university`)
  and a final method (`showUniversity()`)

## Tech stack
Java · IntelliJ IDEA

## How to run
Open the project in IntelliJ IDEA and run `src/Main.java`.

## Author
Duisengaliyeva Adel, Astana IT University (ST-2502)
