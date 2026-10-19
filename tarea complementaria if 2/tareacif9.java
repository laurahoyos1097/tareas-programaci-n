/*Pedir números hasta que se teclee un 0, mostrar la suma de todos los números
introducidos.*/
import java.util.Scanner;

public class tareacif9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int total = 0;
        do {
            System.out.println("Introduce un número: ");
            numero = scanner.nextInt();
            total = total + numero;
        } while (numero != 0);
        System.out.println("La suma de los números es: " + total);
        scanner.close();
    }
}