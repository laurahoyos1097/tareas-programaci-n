
/*Pedir 10 números. Mostrar la media de los números positivos, la media de los números
negativos y la cantidad de ceros.*/
import java.util.Scanner;

public class tareacif14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int positivos = 0;
        int totalp = 0;
        int negativos = 0;
        int totaln = 0;
        double media = 0;
        int ceros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce el número " + i + " de 10:");
            numero = scanner.nextInt();

            if (numero > 0) {
                positivos = positivos + numero;
                totalp++;
            } else if (numero < 0) {
                negativos = negativos + numero;
                totaln++;
            } else {
                ceros++;
            }
        }
        if (positivos > 0) {
            media = positivos / totalp;
            System.out.println("La media de los números positivos introducidos es: " + media);
        }
        if (negativos < 0) {
            media = negativos / totaln;
            System.out.println("La media de los números negativos introducidos es: " + media);
        }
        System.out.println("Cantidad total de ceros: " + ceros);
        scanner.close();
    }
}