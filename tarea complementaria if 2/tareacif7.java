
/*Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.*/
import java.util.Scanner;

public class tareacif7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.println("Introduce un número: ");
            numero = scanner.nextInt();
            if (numero != 0) {
                if (numero % 2 == 0) {
                    System.out.println("El número es par.");
                } else {
                    System.out.println("El número es impar.");
                }
            }
        } while (numero != 0);

        scanner.close();
    }
}