package org.example;

public class AddOverTime extends SalaryAddon{
    public AddOverTime(Employee employee){
        super(employee);
    }

    public String getPosition() {
        return employee.getPosition() + " + overtime";
    }

    public double salary() {
        return  1000.00 + employee.salary();
    }
}
