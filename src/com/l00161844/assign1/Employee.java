package com.l00161844.assign1;

/**
 * @author Paulo Jardim
 */
public class Employee extends Person implements Comparable<Employee> {
    private int employeeId;
    private static int idGenerator;
    private double salary;

    /**
     * default constructor and set salary to 0.0
     */
    public Employee(){
        super();
        salary = 0.0;
        idGenerator++;
    }

    /**
     * initialize all employee instance fields
     * @param n the employee name
     * @param a the employee age
     * @param s the employee salary
     */
    public Employee(String n, int a, double s){
        super(n,a);
        salary = s;
        idGenerator++;
    }

    /**
     *
     * @return the employee ID
     */
    public int getEmployeeId(){
        return this.employeeId;
    }

    /**
     *
     * @return the employee salary
     */
    public double getSalary(){
        return this.salary;
    }

    /**
     *
     * @return the employee description and instance fields
     */
    @Override
    public String getDescription() {
        return "name: " + getName() + " age: " + getAge() + " salary: " + getSalary();
    }

    /**
     * Compare employees based on salary
     * @param other the employee object
     * @return negative integer if object is smaller, zero if object is equal and positive integer if object is greater
     */
    @Override
    public int compareTo(Employee other) {
        if (this.salary - other.salary > 0)
            return 1;
        if (this.salary - other.salary < 0)
            return -1;
        return 0;
    }

    /**
     * Compare two employees
     * @param otherObj the other employee object
     * @return true if the name, age and salary are the same, return false otherwise
     */
    @Override
    public boolean equals(Object otherObj) {
        Employee other;

        if (otherObj instanceof Employee)
            other = (Employee) otherObj;
        else
            return false;

        if (this.getName().equals(other.getName()) &&
                (this.getAge() == other.getAge()) &&
                (this.salary == other.salary))
            return true;
        return false;
    }
}
