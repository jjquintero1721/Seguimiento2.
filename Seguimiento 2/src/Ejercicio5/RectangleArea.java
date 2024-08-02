package Ejercicio5;

public class RectangleArea {
    public int base = -1;
    public int height = -2;

    public int validateInputData(){
        if(base >= 0 && height >= 0){
            return calculateArea();

        } else if(base < 0 && height < 0){
            System.out.println("Invalid values");
        }
        return 0;
    }

    public int calculateArea(){
        System.out.println(base * height);
        return 0;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

