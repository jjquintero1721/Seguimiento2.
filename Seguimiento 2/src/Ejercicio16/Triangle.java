package Ejercicio16;

import javax.swing.JOptionPane;

public class Triangle {
    private int angle1;
    private int angle2;
    private int angle3;

    public Triangle() {
        this.angle1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first angle: "));
        this.angle2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second angle: "));
        this.angle3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the third angle: "));
    }

    public int getAngle1() {
        return angle1;
    }

    public void setAngle1(int angle1) {
        this.angle1 = angle1;
    }

    public int getAngle2() {
        return angle2;
    }

    public void setAngle2(int angle2) {
        this.angle2 = angle2;
    }

    public int getAngle3() {
        return angle3;
    }

    public void setAngle3(int angle3) {
        this.angle3 = angle3;
    }

    public void validateTriangle() {
        int sumAngles = this.angle1 + this.angle2 + this.angle3;
        if (sumAngles == 180) {
            System.out.println("The triangle is correct");
        } else if (sumAngles != 180) {
            System.out.println("The triangle is not correct");
        }
    }
}

