package Ejercicio4;

public class EmployeePayment {
    public int employeeCode;
    private int basicSalary;
    public int extraHours;
    private int numberOfHours;
    private int discount;
    private int loanDiscount;
    private int bonus;
    private int net;

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getExtraHours() {
        return extraHours;
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getLoanDiscount() {
        return loanDiscount;
    }

    public void setLoanDiscount(int loanDiscount) {
        this.loanDiscount = loanDiscount;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getNet() {
        return net;
    }

    public void setNet(int net) {
        this.net = net;
    }

    public void calculateExtraHoursValue(){
        int extraHoursValue = extraHours * basicSalary;
    }
    public int calculateEarned(){
        return discount;
    }
    public int calculateDeducted(){
        return loanDiscount;
    }
    public int calculateNet(){
        return net;
    }
}
