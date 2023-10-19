package org.example;

public class AddRisk extends SalaryAddon{

    public AddRisk(Employee employee) {
        super(employee);
    }

    public String getPosition() {
        return employee.getPosition() + " + risk ";
    }

    public double salary() {
        return  1500.00 + employee.salary();
    }
}
