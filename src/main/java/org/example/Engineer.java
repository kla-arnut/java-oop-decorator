package org.example;

public class Engineer extends Employee {
    public Engineer() {
        position = "this is position Engineer extended class";
    }

    @Override
    public double salary() {
        return super.salary() + 15000.00;
    }
}
