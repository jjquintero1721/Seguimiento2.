package Ejercicio13;

import javax.swing.JOptionPane;

public class LargestNumber {
    private int num1;
    private int num2;
    private int num3;

    public LargestNumber(){
        this.num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number"));
        this.num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number"));
        this.num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the third number"));
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public void checkLargest(){
        if(this.num1 > this.num2 && this.num1 > this.num3){
            JOptionPane.showMessageDialog(null, "The largest number is " + this.num1);
        } else if(this.num2 > this.num1 && this.num2 > this.num3){
            JOptionPane.showMessageDialog(null, "The largest number is " + this.num2);
        } else if(this.num3 > this.num1 && this.num3 > this.num2){
            JOptionPane.showMessageDialog(null, "The largest number is " + this.num3);
        } else if(this.num1 == this.num2 && this.num2 == this.num3){
            JOptionPane.showMessageDialog(null, "All numbers are equal");
        }
    }
}

