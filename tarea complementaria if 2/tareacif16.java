
/* Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho
número.*/
import java.util.Scanner;

public class tareacif16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.println("Introduce un número entre 0 y 10:");
            numero = scanner.nextInt();
        } while (numero < 0 || numero > 10);

        System.out.println("Tabla de multiplicar del número " + numero + ":");

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}