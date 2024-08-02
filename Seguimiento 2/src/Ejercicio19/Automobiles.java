package Ejercicio19;

import javax.swing.JOptionPane;

public class Automobiles {
    private int carModel;

    public Automobiles() {
        this.carModel = Integer.parseInt(JOptionPane.showInputDialog(null, "To check if your car is defective, enter the model of your vehicle:"));
    }

    public int getCarModel() {
        return carModel;
    }

    public void setCarModel(int carModel) {
        this.carModel = carModel;
    }

    public void checkCarDefect() {
        if (this.carModel == 119 || this.carModel == 179 || this.carModel == 189 || this.carModel == 195 || this.carModel == 221 || this.carModel == 780) {
            JOptionPane.showMessageDialog(null, "The car is defective, please visit the nearest dealership.");
        } else {
            JOptionPane.showMessageDialog(null, "The car is not defective.");
        }
    }
}

