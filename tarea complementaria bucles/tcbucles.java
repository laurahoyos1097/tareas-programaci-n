
/*Diseña un programa que cuente (mostrando los números por pantalla) hasta el número que
quiera el usuario.*/
import java.util.Scanner;

public class tcbucles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}