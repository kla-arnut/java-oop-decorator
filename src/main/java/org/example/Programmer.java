package org.example;

public class Programmer extends Employee{
    public Programmer() {
        position = "this is position Programmer extended class";
    }

    @Override
    public double salary() {
        return 10000.00;
    }
}
