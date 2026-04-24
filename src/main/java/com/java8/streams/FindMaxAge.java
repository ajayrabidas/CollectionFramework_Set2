package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class FindMaxAge {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Rahul", 23),
                new Person("Anish", 19),
                new Person("Kajal", 44)
        );

        // Getting maximum aged person details from the list of persons
        Person maxAgedPerson = persons.stream().max(Comparator.comparing(Person::getAge)).orElse(null);
        System.out.println("Maximum aged person is: " + maxAgedPerson.getName() + " age: " + maxAgedPerson.getAge());

        // Getting maximum age only from the given list of persons
        OptionalInt maxAge = persons.stream().mapToInt(Person::getAge).max();
        maxAge.ifPresent(age -> System.out.println("Getting just Max age: " + age));

        // Using Java 7
        Person oldest = persons.get(0);
        for (Person p : persons) {
            if (p.getAge() > oldest.getAge()) {
                oldest = p;
            }
        }
        System.out.println("Oldest person is [Java 7]: " + oldest.getName() + " age: " + oldest.getAge());
    }

}


class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
