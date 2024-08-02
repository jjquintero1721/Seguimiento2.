package Ejercicio8;

import javax.swing.*;

public class CompanyPayment {
    private String employeeName = "jose";
    private int hoursWorked = Integer.parseInt(JOptionPane.showInputDialog(null, "How many hours did Jose work?"));
    private int salary;

    public CompanyPayment() {
        // Constructor remains empty as initial values are set directly
        this.hoursWorked = hoursWorked;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int calculateTotalSalary() {
        if (hoursWorked < 10) {
            salary = 30000;
            System.out.println("Dear " + employeeName + ", the number of hours worked is " + hoursWorked + " and your salary is " + salary * hoursWorked);
        } else {
            salary = 33000;
            System.out.println("Dear " + employeeName + ", the number of hours worked is " + hoursWorked + " and your salary is " + salary * hoursWorked);
        }
        return 0;
    }
}
