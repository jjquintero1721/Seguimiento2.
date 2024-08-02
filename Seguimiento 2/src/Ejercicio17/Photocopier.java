package Ejercicio17;

import javax.swing.JOptionPane;

public class Photocopier {
    private int numberOfCopies;
    public int priceCopies1; // price for 0 to 499 copies
    public int priceCopies2; // price for 500 to 749 copies
    public int priceCopies3; // price for 750 to 999 copies
    public int priceCopies4; // price for 1000 or more copies

    public Photocopier() {
        this.numberOfCopies = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of copies:"));
        this.priceCopies1 = 120;
        this.priceCopies2 = 100;
        this.priceCopies3 = 80;
        this.priceCopies4 = 50;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public int getPriceCopies1() {
        return priceCopies1;
    }

    public void setPriceCopies1(int priceCopies1) {
        this.priceCopies1 = priceCopies1;
    }

    public int getPriceCopies2() {
        return priceCopies2;
    }

    public void setPriceCopies2(int priceCopies2) {
        this.priceCopies2 = priceCopies2;
    }

    public int getPriceCopies3() {
        return priceCopies3;
    }

    public void setPriceCopies3(int priceCopies3) {
        this.priceCopies3 = priceCopies3;
    }

    public int getPriceCopies4() {
        return priceCopies4;
    }

    public void setPriceCopies4(int priceCopies4) {
        this.priceCopies4 = priceCopies4;
    }

    public void calculateCost() {
        if (this.numberOfCopies >= 1 && this.numberOfCopies <= 499) {
            int costCopies1 = this.numberOfCopies * this.priceCopies1;
            JOptionPane.showMessageDialog(null, "Each copy costs 120, so you will have to pay: " + costCopies1);
        } else if (this.numberOfCopies >= 500 && this.numberOfCopies <= 749) {
            int costCopies2 = this.numberOfCopies * this.priceCopies2;
            JOptionPane.showMessageDialog(null, "Each copy costs 100, so you will have to pay: " + costCopies2);
        } else if (this.numberOfCopies >= 750 && this.numberOfCopies <= 999) {
            int costCopies3 = this.numberOfCopies * this.priceCopies3;
            JOptionPane.showMessageDialog(null, "Each copy costs 80, so you will have to pay: " + costCopies3);
        } else if (this.numberOfCopies >= 1000) {
            int costCopies4 = this.numberOfCopies * this.priceCopies4;
            JOptionPane.showMessageDialog(null, "Each copy costs 50, so you will have to pay: " + costCopies4);
        }
    }
}

