
/*Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir
pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto
a N. El proceso termina cuando el usuario acierta*/
import java.util.Scanner;

public class tareacif8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int nprueba = 0;

        System.out.println("Introduce el número a adivinar: ");
        n = scanner.nextInt();

        do {
            System.out.println("Introduce un número: ");
            nprueba = scanner.nextInt();
            if (n < nprueba) {
                System.out.println("El número es menor");
            }
            else if (n > nprueba) {
                    System.out.println("El número es mayor");
                }
        } while (nprueba != n);
        System.out.println("Acertaste el número :)");
        scanner.close();
    }
}