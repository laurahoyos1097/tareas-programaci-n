
/*Diseña un programa para primaria, que les permita repasar la tabla del multiplicar del número
que quiera el usuario*/
import java.util.Scanner;

public class tcbucles1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        System.out.println("Tabla del número " + numero + ": ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}