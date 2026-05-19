package com.sample.questions;

public class OverrideMethodsObjectClass {
    public static void main(String[] args) {
        Employee e1 = new Employee(100, "Ajay");
        Employee e2 = new Employee(100, "Ajay");

        // Using overridden toString() method
        System.out.println(e1);

        // Using overridden equals() method
        System.out.println(e1.equals(e2));

        // Using overridden hashCode() method
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

    }
}

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Employee e = (Employee) obj;
        return id == e.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

}