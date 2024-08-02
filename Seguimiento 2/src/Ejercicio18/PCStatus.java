package Ejercicio18;

import javax.swing.*;

public class PCStatus {
    private Boolean startupBeep;
    private Boolean hardDriveSpinning;

    public PCStatus() {
        this.startupBeep = true;
        this.hardDriveSpinning = true;
    }

    public Boolean getStartupBeep() {
        return startupBeep;
    }

    public void setStartupBeep(Boolean startupBeep) {
        this.startupBeep = startupBeep;
    }

    public Boolean getHardDriveSpinning() {
        return hardDriveSpinning;
    }

    public void setHardDriveSpinning(Boolean hardDriveSpinning) {
        this.hardDriveSpinning = hardDriveSpinning;
    }

    public void showPCStatus() {
        if (startupBeep == true && hardDriveSpinning == true) {
            JOptionPane.showMessageDialog(null, "Contact technical support.");
        } else if (startupBeep == true && hardDriveSpinning == false) {
            JOptionPane.showMessageDialog(null, "Check the unit's connections.");
        } else if (startupBeep == false && hardDriveSpinning == false) {
            JOptionPane.showMessageDialog(null, "Bring the computer in for repair at the central office.");
        } else if (startupBeep == false && hardDriveSpinning == true) {
            JOptionPane.showMessageDialog(null, "Check the speaker connections.");
        }
    }
}

