/*Diseña un código de programación para crear una estructura de la siguiente forma, 
se debe de pedir por pantalla:
Se pide por pantalla el número de filas
Se pide por pantalla el carácter a utilizar.
#
##
###
####
##### */
import java.util.Scanner;

public class t11bucles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de filas: ");
        int filas = scanner.nextInt();
        System.out.println("Introduce el carácter: ");
        String caracter = scanner.next();

        for (int inicio = 1; inicio <= filas; inicio++) {
            System.out.println();
            for (int relleno = 0; relleno < inicio; relleno++) {
                System.out.print(caracter);
            }
        }
        scanner.close();
    }
}