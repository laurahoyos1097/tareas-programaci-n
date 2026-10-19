/*Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...*/
import java.util.Scanner;

public class tareacif5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número del 0 al 10: ");
        int nota = scanner.nextInt();

        if (nota <= 4) {
            System.out.println("Insuficiente");
        }
        else if (nota == 5) {
            System.out.println("Suficiente");
        }
        else if (nota == 6) {
            System.out.println("Bien");
        }
        else if (nota == 7 || nota == 8) {
            System.out.println("Notable");
        }
        else {
            System.out.println("Sobresaliente");
        }
        scanner.close();
    }
}