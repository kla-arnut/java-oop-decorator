package org.example;

public abstract class Employee {
    public String name;
    protected String position = "this is position from employee super class";

    // salary addon
//    boolean addShift;
//    boolean addRisk;
//    boolean addOverTime;
//    private double shiftCost = 500.00;
//    private double riskCost = 1000.00;
//    private double overTimeCost = 1500.00;

    public String getPosition() {
        return position;
    }

    public  double salary() {
//        double startSalary = 0;
//        if (isAddOverTime()) startSalary = startSalary + overTimeCost;
//        if (isAddRisk()) startSalary = startSalary + riskCost;
//        if (isAddShift()) startSalary = startSalary + riskCost;
//        return startSalary;
        return 0;
    }

//    public void setAddShift(boolean addShift) {
//        this.addShift = addShift;
//    }
//
//    public void setAddRisk(boolean addRisk) {
//        this.addRisk = addRisk;
//    }
//
//    public void setAddOverTime(boolean addOverTime) {
//        this.addOverTime = addOverTime;
//    }
//
//    public boolean isAddShift() {
//        return addShift;
//    }
//
//    public boolean isAddRisk() {
//        return addRisk;
//    }
//
//    public boolean isAddOverTime() {
//        return addOverTime;
//    }
}
