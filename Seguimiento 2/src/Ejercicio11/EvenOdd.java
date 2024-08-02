package Ejercicio11;

import javax.swing.JOptionPane;

public class EvenOdd {
    private int enteredNumber;

    public EvenOdd() {
        this.enteredNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
    }

    public int getEnteredNumber() {
        return enteredNumber;
    }

    public void setEnteredNumber(int enteredNumber) {
        this.enteredNumber = enteredNumber;
    }

    public void print() {
        int remainder = enteredNumber % 2;
        if (remainder == 0) {
            System.out.println("The entered number: " + enteredNumber + " is even");
        } else {
            System.out.println("The entered number: " + enteredNumber + " is odd");
        }
    }
}
