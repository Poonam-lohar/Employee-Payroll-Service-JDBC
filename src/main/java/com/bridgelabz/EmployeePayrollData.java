package com.bridgelabz;

import java.time.LocalDate;

public class EmployeePayrollData {

    public int id;
    public String name;
    public double salary;
    public LocalDate Start;

    public EmployeePayrollData(int id, String name, double salary, LocalDate Start) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.Start = Start;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", Start=" + Start +
                '}';
    }
}
