package Ejercicio12;

import javax.swing.JOptionPane;

public class SubjectGrades {
    private int physics;
    private int chemistry;
    private int biology;
    private int mathematics;
    private int computerScience;

    public SubjectGrades() {
        this.physics = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your physics grade between 0 and 10"));
        this.chemistry = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your chemistry grade between 0 and 10"));
        this.biology = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your biology grade between 0 and 10"));
        this.mathematics = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your mathematics grade between 0 and 10"));
        this.computerScience = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your computer science grade between 0 and 10"));
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getBiology() {
        return biology;
    }

    public void setBiology(int biology) {
        this.biology = biology;
    }

    public int getMathematics() {
        return mathematics;
    }

    public void setMathematics(int mathematics) {
        this.mathematics = mathematics;
    }

    public int getComputerScience() {
        return computerScience;
    }

    public void setComputerScience(int computerScience) {
        this.computerScience = computerScience;
    }

    public double calculateAverageGrade() {
        return (physics + chemistry + biology + mathematics + computerScience) / 5.0;
    }

    public void checkGrade() {
        double average = calculateAverageGrade();
        if (average >= 0 && average <= 5.99) {
            System.out.println("The average is: " + average + " which is a poor average.");
        } else if (average >= 6 && average <= 8) {
            System.out.println("The average is: " + average + " which is a good average.");
        } else if (average > 8) {
            System.out.println("The average is: " + average + " which is an excellent average.");
        }
    }
}
