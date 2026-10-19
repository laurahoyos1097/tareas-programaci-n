/*Preguntar por pantalla tu nombre y el número de veces que deseamos imprimir el
nombre*/

import java.util.Scanner;

public class t10bucles3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce el número de veces que se desee repetir: ");
        int numero = scanner.nextInt();
        for (int inicio = 1; inicio <= numero; inicio++) {
            System.out.println(inicio + " " + nombre);
        }
        scanner.close();
    }
}