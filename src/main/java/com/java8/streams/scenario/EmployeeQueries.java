package com.java8.streams.scenario;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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


        System.out.println("Count the number of employees in each department?");
        Map<String, Long> countOfEmployeesEachDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("Department wise count of employees:");

        for (Map.Entry<String, Long> me : countOfEmployeesEachDepartment.entrySet()) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }


        System.out.println("What is the average salary of each department?");
        Map<String, Double> avgSalaryOfEachDepartment = employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)));
        for (Map.Entry<String, Double> me : avgSalaryOfEachDepartment.entrySet()) {
            System.out.println(me.getKey() + ":\t Average Salary: " + me.getValue());
        }


        System.out.println("Get the details of youngest male employee in the product development department?");
        Optional<Employee> youngestMaleEmployeeProductDevelopmentDepartment = employeeList.stream()
                .filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
                .min(Comparator.comparing(Employee::getAge));
        Employee e = youngestMaleEmployeeProductDevelopmentDepartment.get();
        System.out.println("Details of Youngest Male Employee in Product Development Department");
        System.out.println("Employee Details: " + e.toString());
    }
}