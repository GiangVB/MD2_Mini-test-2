package model;

public abstract class Employee {
    private String emloyeeID;
    private String fullName;
    private int age;
    private String phoneNumber;
    private String email;

    public Employee() {
    }

    public Employee(String emloyeeID, String fullName, int age, String phoneNumber, String email) {
        this.emloyeeID = emloyeeID;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getEmloyeeID() {
        return emloyeeID;
    }

    public void setEmloyeeID(String emloyeeID) {
        this.emloyeeID = emloyeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double getNetSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "emloyeeID='" + emloyeeID + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
