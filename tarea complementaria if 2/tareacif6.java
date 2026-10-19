
/*Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se
introduzca un 0.*/
import java.util.Scanner;

public class tareacif6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.println("Introduce un número: ");
            numero = scanner.nextInt();
            if (numero > 0) {
                System.out.println("El número es positivo.");
            } else if (numero < 0) {
                System.out.println("El número es negativo.");
            }
        } while (numero != 0);
        
        scanner.close();
    }
}
