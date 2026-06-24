package com.java8.streams.scenario;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeQueries {

    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeData.addEmployeeData();


        System.out.println("How many male and female employees are there in the organization?");
        Map<String, Long> noOfMaleFemaleEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleFemaleEmployees);


        System.out.println("Print the name of all departments in the organization?");
        employeeList.stream().map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);


        System.out.println("What is the average age of male and female employees?");
        Map<String, Double> avgAgeOfMaleAndFemale = employeeList.stream()
                .collect(
                        Collectors
                                .groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("Average ages are: " + avgAgeOfMaleAndFemale);


        System.out.println("Get the details of highest paid employee in the organization?");
        // Use Optional<Employee> when object can be null
        Employee highestPaidEmployee = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
        System.out.println("Details of highest paid employee is: " + highestPaidEmployee);

    }
}