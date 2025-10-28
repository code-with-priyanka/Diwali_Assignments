package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();
        int choice;

        do {
            System.out.println("\n--- Employee Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Show All Employees");
            System.out.println("4. Show Employees in Sorted Order (by ID)");
            System.out.println("5. Find Employee by Name");
            System.out.println("6. Save Employees to File");
            System.out.println("7. Quit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("1. Default");
                    System.out.println("2. With ID and Name");
                    System.out.println("3. With ID, Name, and Role");
                    System.out.print("Enter option: ");
                    int op = sc.nextInt();
                    sc.nextLine();

                    Employee e = null;
                    if (op == 1) {
                        e = new Employee();
                    } else if (op == 2) {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        e = new Employee(id, name);
                    } else if (op == 3) {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Role: ");
                        String role = sc.nextLine();
                        e = new Employee(id, name, role);
                    } else {
                        System.out.println("Invalid option!");
                    }

                    if (e != null) service.addEmployee(e);
                }

                case 2 -> {
                    System.out.print("Enter Employee ID to remove: ");
                    int id = sc.nextInt();
                    service.removeEmployee(id);
                }

                case 3 -> service.showAllEmployees();
                case 4 -> service.sortEmployees();
                case 5 -> {
                    System.out.print("Enter name to search: ");
                    String name = sc.nextLine();
                    service.findByName(name);
                }
                case 6 -> service.saveEmployees();
                case 7 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}
