package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDAO;

public class EmployeeService {
    private final EmployeeDAO dao = new EmployeeDAO();

    public void addEmployee(Employee e) {
        dao.addEmployee(e);
        System.out.println("Employee added successfully!");
    }

    public void removeEmployee(int id) {
        boolean removed = dao.removeEmployee(id);
        System.out.println(removed ? "Employee removed!" : "Employee not found!");
    }

    public void showAllEmployees() {
        List<Employee> list = dao.getAllEmployees();
        if (list.isEmpty())
            System.out.println("No employees found!");
        else
            list.forEach(System.out::println);
    }

    public void sortEmployees() {
        dao.sortById();
        System.out.println("--- Sorted Employees ---");
        dao.getAllEmployees().forEach(System.out::println);
    }

    public void findByName(String name) {
        List<Employee> result = dao.findByName(name);
        if (result.isEmpty())
            System.out.println("No employee found!");
        else
            result.forEach(System.out::println);
    }

    public void saveEmployees() {
        dao.saveToFile();
    }
}
