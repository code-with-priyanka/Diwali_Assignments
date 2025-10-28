package com.demo.beans;


public class Employee {
    private String empName;
    private int empID;
    private String empRole;

    // Constructors
    public Employee() {
        this.empName = "Unknown";
        this.empID = 0;
        this.empRole = "Not Assigned";
    }

    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = "Employee";
    }

    public Employee(int empID, String empName, String empRole) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = empRole;
    }

    // Getters and Setters
    public String getEmpName() {
    	return empName; 
    	}
    public void setEmpName(String empName) {
    	this.empName = empName; 
    	}

    public int getEmpID() {
    	return empID; 
    	}
    public void setEmpID(int empID) {
    	this.empID = empID; 
    	}

    public String getEmpRole() {
    	return empRole; 
    	}
    public void setEmpRole(String empRole) {
    	this.empRole = empRole; 
    	}

    @Override
    public String toString() {
        return empID + " - " + empName + " (" + empRole + ")";
    }
}
