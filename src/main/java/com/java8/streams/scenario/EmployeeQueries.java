package com.java8.streams.scenario;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeQueries {

    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeData.addEmployeeData();

//      How many male and female employees are there in the organization?
        Map<String, Long> noOfMaleFemaleEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleFemaleEmployees);
    }
}