package model;

public class FullttimeEmployee extends Employee{
    private double bonus;
    private double fine;
    private double salary;

    public FullttimeEmployee() {
    }

    public FullttimeEmployee(double bonus, double fine, double salary) {
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public FullttimeEmployee(String emloyeeID, String fullName, int age, String phoneNumber, String email, double bonus, double fine, double salary) {
        super(emloyeeID, fullName, age, phoneNumber, email);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getNetSalary() {
        double netSalary = salary + (bonus - fine);
        return netSalary;
    }

}
