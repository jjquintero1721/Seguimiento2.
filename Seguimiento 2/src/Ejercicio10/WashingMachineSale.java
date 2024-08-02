package Ejercicio10;

import javax.swing.JOptionPane;

public class WashingMachineSale {
    private String washingMachineType;
    public int quantityOfWashingMachines;
    private int costLargeWashingMachine = 4000;
    private int costSmallWashingMachine = 3000;

    public WashingMachineSale() {
        this.washingMachineType = JOptionPane.showInputDialog(null, "Choose the type of washing machine: 1 = large washing machine, 2 = small washing machine");
        this.quantityOfWashingMachines = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the quantity of washing machines"));
    }

    public String getWashingMachineType() {
        return washingMachineType;
    }

    public void setWashingMachineType(String washingMachineType) {
        this.washingMachineType = washingMachineType;
    }

    public int getQuantityOfWashingMachines() {
        return quantityOfWashingMachines;
    }

    public void setQuantityOfWashingMachines(int quantityOfWashingMachines) {
        this.quantityOfWashingMachines = quantityOfWashingMachines;
    }

    public int getCostLargeWashingMachine() {
        return costLargeWashingMachine;
    }

    public void setCostLargeWashingMachine(int costLargeWashingMachine) {
        this.costLargeWashingMachine = costLargeWashingMachine;
    }

    public int getCostSmallWashingMachine() {
        return costSmallWashingMachine;
    }

    public void setCostSmallWashingMachine(int costSmallWashingMachine) {
        this.costSmallWashingMachine = costSmallWashingMachine;
    }

    public void calculateCost() {
        int unitCost;
        if (washingMachineType.equals("1")) {
            unitCost = costLargeWashingMachine;
        } else if (washingMachineType.equals("2")) {
            unitCost = costSmallWashingMachine;
        } else {
            System.out.println("Invalid washing machine type.");
            return;
        }

        float totalCost;
        if (quantityOfWashingMachines <= 3) {
            totalCost = unitCost * quantityOfWashingMachines;
        } else {
            totalCost = (unitCost * quantityOfWashingMachines) * 0.97f; // Apply 3% discount
        }

        System.out.println("The total amount to pay is " + totalCost);
    }
}
