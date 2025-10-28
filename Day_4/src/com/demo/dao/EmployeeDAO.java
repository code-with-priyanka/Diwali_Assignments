package com.demo.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import com.demo.beans.Employee;

public class EmployeeDAO {
    private final ArrayList<Employee> list = new ArrayList<>();

    public void addEmployee(Employee e) {
        list.add(e);
    }

    public boolean removeEmployee(int id) {
        return list.removeIf(e -> e.getEmpID() == id);
    }

    public List<Employee> getAllEmployees() {
        return list;
    }

    public void sortById() {
        list.sort(Comparator.comparingInt(Employee::getEmpID));
    }

    public List<Employee> findByName(String name) {
        List<Employee> result = new ArrayList<>();
        for (Employee e : list) {
            if (e.getEmpName().equalsIgnoreCase(name)) {
                result.add(e);
            }
        }
        return result;
    }

    public void saveToFile() {
        try (FileWriter fw = new FileWriter("employees.txt")) {
            for (Employee e : list) {
                fw.write(e.getEmpID() + "," + e.getEmpName() + "," + e.getEmpRole() + "\n");
            }
            System.out.println("Employees saved to 'employees.txt' successfully!");
        } catch (IOException e) {
            System.out.println("Error while saving file: " + e.getMessage());
        }
    }
}
