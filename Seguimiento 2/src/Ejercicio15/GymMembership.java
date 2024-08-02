package Ejercicio15;

import javax.swing.JOptionPane;

public class GymMembership {
    private int daysAttended;
    private int monthlyFee;

    public GymMembership() {
        this.daysAttended = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of days attended at the gym: 15, 30, or 3 months"));
        calculateMonthlyFee();
    }

    public int getDaysAttended() {
        return daysAttended;
    }

    public void setDaysAttended(int daysAttended) {
        this.daysAttended = daysAttended;
    }

    public int getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(int monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public void calculateMonthlyFee() {
        if (daysAttended == 15) {
            monthlyFee = 18000;
        } else if (daysAttended == 30) {
            monthlyFee = 35000;
        } else if (daysAttended == 3) {
            monthlyFee = 86000;
        }
    }

    public void displayMonthlyFee() {
        System.out.println("The value of your membership fee is: " + monthlyFee);
    }
}

