package Ejercicio9;

import javax.swing.JOptionPane;

public class NumberCheck {
    private int enteredNumber;

    public NumberCheck() {
        this.enteredNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number"));
    }

    public int getEnteredNumber() {
        return enteredNumber;
    }

    public void setEnteredNumber(int enteredNumber) {
        this.enteredNumber = enteredNumber;
    }

    public void checkEnteredNumber() {
        if (enteredNumber > 0) {
            System.out.println("The number " + enteredNumber + " is positive");
        } else if (enteredNumber < 0) {
            System.out.println("The number " + enteredNumber + " is negative");
        } else {
            System.out.println("The number is 0");
        }
    }
}

