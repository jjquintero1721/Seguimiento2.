package Ejercicio1;

public class User {

    public String baseUser;
    public String enteredUser;
    public String basePassword;
    public String enteredPassword;
    public String systemStatus;

    public String validateStatus(){
        return systemStatus;
    }
    public String allowAccess(){
        return baseUser;
    }

    public String getBaseUser() {
        return baseUser;
    }

    public void setBaseUser(String baseUser) {
        this.baseUser = baseUser;
    }

    public String getEnteredUser() {
        return enteredUser;
    }

    public void setEnteredUser(String enteredUser) {
        this.enteredUser = enteredUser;
    }

    public String getBasePassword() {
        return basePassword;
    }

    public void setBasePassword(String basePassword) {
        this.basePassword = basePassword;
    }

    public String getEnteredPassword() {
        return enteredPassword;
    }

    public void setEnteredPassword(String enteredPassword) {
        this.enteredPassword = enteredPassword;
    }

    public String getSystemStatus() {
        return systemStatus;
    }

    public void setSystemStatus(String systemStatus) {
        this.systemStatus = systemStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "baseUser='" + baseUser + '\'' +
                '}';
    }
}

