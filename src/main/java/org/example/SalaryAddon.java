package org.example;
//docorator class
public abstract class SalaryAddon extends Employee {
    protected Employee employee;

    public SalaryAddon(Employee employee) {
        this.employee = employee;
    }

    public abstract String getPosition();
}
