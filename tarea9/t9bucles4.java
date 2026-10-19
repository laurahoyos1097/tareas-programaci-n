/*Escribe un programa en Java que utilice un bucle do-while para crear un menú 
interactivo en consola. El programa debe mostrar al usuario las siguientes opciones:
-Sumar dos números
-Restar dos números
-Multiplicar dos números
-Salir
El programa debe ejecutar la opción seleccionada y volver a mostrar el menú después de 
realizar la operación, hasta que el usuario seleccione la opción "4. Salir" */

import java.util.Scanner;

public class t9bucles4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Elige una de las siguientes opciones: ");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("Introduce dos números: ");
                int numero = scanner.nextInt();
                int numero2 = scanner.nextInt();
                System.out.println("El resultado de la suma es: " + (numero + numero2));
                opcion = 0;
            }
            if (opcion == 2) {
                System.out.println("Introduce dos números: ");
                int numero3 = scanner.nextInt();
                int numero4 = scanner.nextInt();
                System.out.println("El resultado de la resta es: " + (numero3 - numero4));
                opcion = 0;
            }
            if (opcion == 3) {
                System.out.println("Introduce dos números: ");
                int numero5 = scanner.nextInt();
                int numero6 = scanner.nextInt();
                System.out.println("El resultado de la multiplicación es: " + (numero5 * numero6));
                opcion = 0;
            }
        } while (opcion == 0);

        scanner.close();
    }
}