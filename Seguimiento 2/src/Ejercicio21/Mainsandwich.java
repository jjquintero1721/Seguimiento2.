package Ejercicio21;
import java.util.Scanner;

public class Mainsandwich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del sándwich (pequeño o grande):");
        String size = scanner.nextLine();

        System.out.println("¿Desea agregar tocineta? (true/false):");
        boolean bacon = scanner.nextBoolean();

        System.out.println("¿Desea agregar jalapeño? (true/false):");
        boolean jalapeno = scanner.nextBoolean();

        System.out.println("¿Desea agregar pavo? (true/false):");
        boolean turkey = scanner.nextBoolean();

        System.out.println("¿Desea agregar queso? (true/false):");
        boolean cheese = scanner.nextBoolean();

        SandwichOrder order = new SandwichOrder(size, bacon, jalapeno, turkey, cheese);
        int totalPrice = order.calculateTotalPrice();

        System.out.println("El precio total del pedido es: $" + totalPrice);
    }
}

