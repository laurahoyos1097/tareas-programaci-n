/*Pedir un número e indicar si es positivo o negativo*/
import java.util.Scanner;

public class tareacif1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
        scanner.close();
    }
}