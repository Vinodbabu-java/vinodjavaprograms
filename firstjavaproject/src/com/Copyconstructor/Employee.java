package com.Copyconstructor;

class Employee {
    int empId;
    String empName;
    double salary;

    // Parameterized constructor
    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Copy constructor calling parameterized constructor
    Employee(Employee e) {
        this(e.empId, e.empName, e.salary);
    }

    void display() {
        System.out.println(empId + " " + empName + " " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ravi", 45000);
        Employee e2 = new Employee(e1);

        e1.display();
        e2.display();
    }
}
