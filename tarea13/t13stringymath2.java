/*Diseña un programa que pide un texto por pantalla y se muestra de la siguiente
manera:
Por ejemplo se teclea: Buenas tardes Lola
Debe aparecer:
Buenas
Tardes
Lola*/

import java.util.Scanner;

public class t13stringymath2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String texto = scanner.nextLine();

        String[] palabras = texto.split("\\s+");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        scanner.close();
    }
}