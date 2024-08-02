package Ejercicio21;

import javax.swing.*;

import java.util.Scanner;

public class SandwichOrder {
    private String size;
    private boolean bacon;
    private boolean jalapeno;
    private boolean turkey;
    private boolean cheese;

    private static final int SMALL_PRICE = 6000;
    private static final int LARGE_PRICE = 12000;
    private static final int BACON_PRICE = 3000;
    private static final int TURKEY_PRICE = 3000;
    private static final int CHEESE_PRICE = 2500;

    public SandwichOrder(String size, boolean bacon, boolean jalapeno, boolean turkey, boolean cheese) {
        this.size = size;
        this.bacon = bacon;
        this.jalapeno = jalapeno;
        this.turkey = turkey;
        this.cheese = cheese;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean isJalapeno() {
        return jalapeno;
    }

    public void setJalapeno(boolean jalapeno) {
        this.jalapeno = jalapeno;
    }

    public boolean isTurkey() {
        return turkey;
    }

    public void setTurkey(boolean turkey) {
        this.turkey = turkey;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public int calculateTotalPrice() {
        int totalPrice = 0;
        if (size.equalsIgnoreCase("pequeño")) {
            totalPrice += SMALL_PRICE;
        } else if (size.equalsIgnoreCase("grande")) {
            totalPrice += LARGE_PRICE;
        }
        if (bacon) {
            totalPrice += BACON_PRICE;
        }
        if (turkey) {
            totalPrice += TURKEY_PRICE;
        }
        if (cheese) {
            totalPrice += CHEESE_PRICE;
        }
        return totalPrice;
    }
}
