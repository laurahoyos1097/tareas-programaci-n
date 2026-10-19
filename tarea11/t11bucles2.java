
/*Diseña un código de programación para crear una estructura de la siguiente forma, 
se debe de pedir por pantalla:
Se pide por pantalla el número de filas
Se pide por pantalla el carácter a utilizar.
#
##
###
####
#####
Realizar el ejercicio anterior, pero con números del 1-10 exclusivamente.
1
12
123
1234
12345 */
import java.util.Scanner;

public class t11bucles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 10;
        for (int inicio = 1; inicio <= numero; inicio++) {
            System.out.println();
            for (int relleno = 1; relleno <= inicio; relleno++) {
                System.out.print(relleno);
            }
        }
        scanner.close();
    }
}