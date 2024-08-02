package Ejercicio20;

import javax.swing.JOptionPane;

public class MobilePhone {
    private int operator;
    private int fixedCharge;
    private int minutesUsed;

    public MobilePhone() {
        this.operator = Integer.parseInt(JOptionPane.showInputDialog(null, "!!February 2023 Promotion!!" +
                " Enter your operator: 1 = Tigo, 2 = Claro, 3 = Movistar"));
        this.minutesUsed = Integer.parseInt(JOptionPane.showInputDialog(null, "How many minutes have you used?"));
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public int getFixedCharge() {
        return fixedCharge;
    }

    public void setFixedCharge(int fixedCharge) {
        this.fixedCharge = fixedCharge;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public void validateCharge() {
        if (this.operator == 1) {
            int a = fixedCharge = 45000 + (200 * this.minutesUsed) + 12000;
            System.out.println("Your cost will be " + a);
        } else if (this.operator == 2) {
            int b = fixedCharge = 30000 + (100 * this.minutesUsed) + 18000;
            System.out.println("Your cost will be " + b);
        } else if (this.operator == 3) {
            int c = fixedCharge = 40000 + (250 * this.minutesUsed) + 8000;
            System.out.println("Your cost will be " + c);
        }
    }
}


