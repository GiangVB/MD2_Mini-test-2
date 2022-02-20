package model;

public class ParttimeEmployee extends Employee{
    public static final int SALARYPERHOUR = 100000;
    private double workHour;

    public ParttimeEmployee() {
    }

    public ParttimeEmployee(double workHour) {
        this.workHour = workHour;
    }

    public ParttimeEmployee(String emloyeeID, String fullName, int age, String phoneNumber, String email, double workHour) {
        super(emloyeeID, fullName, age, phoneNumber, email);
        this.workHour = workHour;
    }

    public double getWorkHour() {
        return workHour;
    }

    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }

    @Override
    public double getNetSalary() {
        double netSalary = workHour * SALARYPERHOUR;
        return netSalary;
    }
}
