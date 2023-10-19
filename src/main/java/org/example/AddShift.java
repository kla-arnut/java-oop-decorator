package org.example;

public class AddShift extends SalaryAddon{
    public AddShift(Employee employee){
        super(employee);
    }

    public String getPosition() {
        return employee.getPosition() + " + shift";
    }

    public double salary() {
        return 500.00 + employee.salary();
    }
}
