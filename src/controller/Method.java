package controller;

import model.Employee;
import model.FullttimeEmployee;
import model.ParttimeEmployee;

public class Method<employees> {
    public static void displayEmployee(Employee[] employees) {
        if (employees.length != 0) {
            for (Employee e : employees
            ) {
                System.out.println(e);
            }
        }
        else System.out.println("Empty list!");
    }

    public static Employee[] addNewEmployee(Employee[] employees, Employee newEmployee) {
        Employee[] newEmployees = new Employee[employees.length + 1];

        for (int i = 0; i < employees.length; i++) {
            newEmployees[i] = employees[i];
        }

        newEmployees[employees.length] = newEmployee;

        return newEmployees;
    }

    public static void displayUnderAverageSalaryFulltimeEmployee(Employee[] employees) {
        double totalSalary = 0;
        double averageSalary;
        for (Employee e : employees
        ) {
            totalSalary += e.getNetSalary();
        }
        averageSalary = totalSalary / employees.length;

        for (Employee e : employees
        ) {
            if (e instanceof FullttimeEmployee)
                if (e.getNetSalary() < averageSalary) {
                    System.out.println(e);
                }
        }
    }

    public static double getParttimeEmployeeTotalSalary(Employee[] employees) {
        double partimeEmployeeTotalSalary = 0;
        for (Employee e: employees
             ) {
            if (e instanceof ParttimeEmployee) {
                partimeEmployeeTotalSalary += e.getNetSalary();
            }
        }
        return partimeEmployeeTotalSalary;
    }


}