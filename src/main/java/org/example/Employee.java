package org.example;

public abstract class Employee {
    protected String position = "this is position from employee super class";

    public String getPosition() {
        return position;
    }

    public abstract double salary();

}
