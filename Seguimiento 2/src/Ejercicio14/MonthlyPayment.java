package Ejercicio14;

import javax.swing.JOptionPane;

public class MonthlyPayment {
    private int gender;
    private int age;

    public MonthlyPayment() {
        this.gender = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your gender: 1 = female, 2 = male"));
        this.age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int validateGender() {
        if (this.gender == 1) {
            return calculateMonthlyPayment();
        } else if (this.gender == 2) {
            JOptionPane.showMessageDialog(null, "You will receive monthly payments of " + 40000);
        }
        return 0;
    }

    public int calculateMonthlyPayment() {
        if (this.age > 50) {
            JOptionPane.showMessageDialog(null, "You will receive monthly payments of 120000");
        } else if (this.age >= 30 && this.age <= 50) {
            JOptionPane.showMessageDialog(null, "You will receive monthly payments of 100000");
        }

        return 0;
    }
}

