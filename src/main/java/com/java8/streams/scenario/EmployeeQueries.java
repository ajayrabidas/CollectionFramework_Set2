package com.java8.streams.scenario;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeQueries {

    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeData.addEmployeeData();


        System.out.println("\n\nHow many male and female employees are there in the organization?");
        Map<String, Long> noOfMaleFemaleEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleFemaleEmployees);


        System.out.println("\n\nPrint the name of all departments in the organization?");
        employeeList.stream().map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);


        System.out.println("\n\nWhat is the average age of male and female employees?");
        Map<String, Double> avgAgeOfMaleAndFemale = employeeList.stream()
                .collect(
                        Collectors
                                .groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("Average ages are: " + avgAgeOfMaleAndFemale);


        System.out.println("\n\nGet the details of highest paid employee in the organization?");
        // Use Optional<Employee> when object can be null
        Employee highestPaidEmployee = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
        System.out.println("Details of highest paid employee is: " + highestPaidEmployee);


        System.out.println("\n\nCount the number of employees in each department?");
        Map<String, Long> countOfEmployeesEachDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("Department wise count of employees:");

        for (Map.Entry<String, Long> me : countOfEmployeesEachDepartment.entrySet()) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }


        System.out.println("\n\nWhat is the average salary of each department?");
        Map<String, Double> avgSalaryOfEachDepartment = employeeList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)));
        for (Map.Entry<String, Double> me : avgSalaryOfEachDepartment.entrySet()) {
            System.out.println(me.getKey() + ":\t Average Salary: " + me.getValue());
        }


        System.out.println("\n\nGet the details of youngest male employee in the product development department?");
        Optional<Employee> youngestMaleEmployeeProductDevelopmentDepartment = employeeList.stream()
                .filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
                .min(Comparator.comparing(Employee::getAge));
        Employee e = youngestMaleEmployeeProductDevelopmentDepartment.get();
        System.out.println("Details of Youngest Male Employee in Product Development Department");
        System.out.println("Employee Details: " + e.toString());


        System.out.println("\n\nWho has the most working experience in the organization?");
        Employee mostExperienced = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst().get();
        System.out.println("Most experienced employee is:\n" + mostExperienced.getName() + "\nJoined in: " + mostExperienced.getYearOfJoining());


        System.out.println("\n\nHow many male and female employees are there in the sales and marketing team?");
        Map<String, Long> countMaleFemaleInSalesMarketing = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        for (Map.Entry<String, Long> me : countMaleFemaleInSalesMarketing.entrySet()) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }


        System.out.println("\n\nWhat is the average salary of male and female employees?");
        Map<String, Double> avgSalaryMaleFemale = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        for (Map.Entry<String, Double> me : avgSalaryMaleFemale.entrySet()) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }


        System.out.println("\n\nList down the names of all employees in each department?");
        Map<String, List<Employee>> employeeAllDepartments = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        Set<Map.Entry<String, List<Employee>>> entrySet = employeeAllDepartments.entrySet();
        for (Map.Entry<String, List<Employee>> entry : entrySet) {
            System.out.println("--------------------------------------");
            System.out.println("Employees in department: " + entry.getKey());
            for (Employee employee : entry.getValue()) {
                System.out.println(employee.getName());
            }
        }


        System.out.println("\n\nWhat is the average salary and total salary of the whole organization?");
        DoubleSummaryStatistics employeeSalaryStatics = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Employee average salary: " + employeeSalaryStatics.getAverage());
        System.out.println("Total salary of whole organization: " + employeeSalaryStatics.getSum());


        System.out.println("\n\nSeparate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");
        Map<Boolean, List<Employee>> employeesByAge = employeeList.stream().collect(Collectors.partitioningBy(emp -> emp.getAge() > 25));

        for (Map.Entry<Boolean, List<Employee>> me : employeesByAge.entrySet()) {
            if (me.getKey()) {
                System.out.println("Employees older than 25 are: ");
            } else {
                System.out.println("Employees younger than or equal to 25 are: ");
            }
            for (Employee employee : me.getValue()) {
                System.out.println("Employee: " + employee.getName());
            }
        }


        System.out.println("\n\nWho is the oldest employee in the organization? What is his age and which department he belongs to?");
        Optional<Employee> oldestEmployee = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        System.out.println("Oldest employee is: " + oldestEmployee.get().getName() + " Age: " + oldestEmployee.get().getAge() + " Department: " + oldestEmployee.get().getDepartment());

    }
}