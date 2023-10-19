package org.example;

public class Accounting extends Employee {
    public Accounting() {
        position = "this is position Accounting extended class";
    }

    @Override
    public double salary() {
        return 20000.00;
    }
}
