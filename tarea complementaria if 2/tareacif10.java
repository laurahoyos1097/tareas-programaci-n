/*Pedir números hasta que se introduzca uno negativo, y calcular la media de los números
positivos. El 0 se considera número positivo*/
import java.util.Scanner;

public class tareacif10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int suma = 0;
        int totaln = 0;
        double media = 0;
        do {
            System.out.println("Introduce un número: ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                suma = suma + numero;
                totaln++;
            }
        } while (numero >= 0);

        if (suma > 0) {
            media = suma / totaln;
            System.out.println("La media de los números positivos introducidos es: " + media);
        }
        scanner.close();
    }
}