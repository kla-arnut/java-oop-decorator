package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------");
        Employee engineer = new Engineer();
        engineer.name = "แดง";
        System.out.println("engineer:"+engineer.name);
        System.out.println(engineer.getPosition());
        System.out.println("base salary:"+engineer.salary());
        engineer = new AddOverTime(engineer);
        System.out.println("+overtime:"+engineer.salary());
        System.out.println("--------------------------------------");

        System.out.println("--------------------------------------");
        Employee acct = new Accounting();
        acct.name = "เขียว";
        System.out.println("accounting:"+acct.name);
        System.out.println(acct.getPosition());
        System.out.println("base salary:"+acct.salary());
        acct = new AddShift(acct);
        System.out.println("+shift:"+acct.salary());
        System.out.println("--------------------------------------");

        System.out.println("--------------------------------------");
        Employee programmer = new Engineer();
        programmer.name = "ดำ";
        System.out.println("engineer:"+programmer.name);
        System.out.println(programmer.getPosition());
        System.out.println("base salary:"+programmer.salary());
        programmer = new AddRisk(programmer);
        System.out.println("+risk:"+programmer.salary());
        System.out.println("--------------------------------------");
    }
}