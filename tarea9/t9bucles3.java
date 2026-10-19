/* Práctica while
Escribe un programa en Java que utilice un bucle while para solicitar al usuario 
que ingrese números enteros positivos. El programa debe sumar estos números y mostrar 
el resultado acumulado en cada iteración.
El bucle debe finalizar cuando el usuario ingrese un número negativo, momento en el 
cual se mostrará el total de la suma y el programa terminará.
 */

import java.util.Scanner;

public class t9bucles3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int total = 0;

        while (numero >= 0) {
            System.out.println("Introduce los números (deben ser enteros y positivos):");
            numero = scanner.nextInt();
            if (numero >= 0) {
                total = numero + total;
                System.out.println("El resultado de la suma es: " + total);
            } else {
                System.out.println("La suma total es: " + total);
            }
        }
        scanner.close();
    }
}
