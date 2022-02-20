package view;

import controller.Method;
import model.Employee;
import model.ParttimeEmployee;
import model.FullttimeEmployee;
import java.util.Scanner;

import static controller.Method.displayEmployee;

public class Main {
    public static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[0];
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Employee Management");
            System.out.println("1. Display all employee information");
            System.out.println("2. Add new full time employee");
            System.out.println("3. Add new part time employee");
            System.out.println("4. Display full time employee have under average salary");
            System.out.println("5. Calculate salary for all part time employee");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    Method.displayEmployee(employees);
                    break;
                case 2:
                    Employee newFulltimeEmployee = createNewFulltimeEmployee();
                    employees = Method.addNewEmployee(employees, newFulltimeEmployee);
                    break;
                case 3:
                    Employee newParttimeEmployee = createNewParttimeEmployee();
                    employees = Method.addNewEmployee(employees,newParttimeEmployee);
                    break;
                case 4:
                    Method.displayUnderAverageSalaryFulltimeEmployee(employees);
                    break;
                case 5:
                    Method.getParttimeEmployeeTotalSalary(employees);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }

    public static Employee createNewFulltimeEmployee() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee ID: ");
        String employeeID = input.nextLine();
        System.out.println("Enter employee full name: ");
        String fullName = input.nextLine();
        System.out.println("Enter employee age: ");
        int age = input.nextInt();
        System.out.println("Enter employee phone number: ");
        String phoneNumber = input.nextLine();
        System.out.println("Enter employee email: ");
        String email = input.nextLine();
        System.out.println("Enter employee bonus: ");
        double bonus = input.nextDouble();
        System.out.println("Enter employee fine: ");
        double fine = input.nextDouble();
        System.out.println("Enter employee salary: ");
        double salary = input.nextDouble();
        Employee newFulltimeEmployee = new FullttimeEmployee(employeeID, fullName, age, phoneNumber, email, bonus, fine, salary);
        return newFulltimeEmployee;
    }

    public static Employee createNewParttimeEmployee() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee ID: ");
        String employeeID = input.nextLine();
        System.out.println("Enter employee full name: ");
        String fullName = input.nextLine();
        System.out.println("Enter employee age: ");
        int age = input.nextInt();
        System.out.println("Enter employee phone number: ");
        String phoneNumber = input.nextLine();
        System.out.println("Enter employee email: ");
        String email = input.nextLine();
        System.out.println("Enter employee work hour: ");
        double workHour = input.nextDouble();
        Employee newParttimeEmployee = new ParttimeEmployee(employeeID, fullName, age, phoneNumber, email, workHour);
        return newParttimeEmployee;
    }
}
