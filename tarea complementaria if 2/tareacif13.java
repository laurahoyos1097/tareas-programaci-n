
/*Pedir un número y calcular su factorial.*/
import java.util.Scanner;

public class tareacif13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        long resultado = 1;
        System.out.println("Introduce un número: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }
        System.out.println("El factorial es: " + resultado);
        scanner.close();
    }
}