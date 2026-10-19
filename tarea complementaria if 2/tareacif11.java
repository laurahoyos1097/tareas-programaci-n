/*11. Pedir un número N, y mostrar todos los números del 1 al N.*/
import java.util.Scanner;

public class tareacif11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        System.out.println("Introduce un número: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}