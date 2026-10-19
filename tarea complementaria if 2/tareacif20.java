
/*Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1
y n que son primos.*/
import java.util.Scanner;

public class tareacif20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int totalp = 0;

        System.out.println("Introduce un número: ");
        numero = scanner.nextInt();

        for (int i = 2; i <= numero; i++) {
            boolean primo = true;
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                totalp++;
            }
        }
        System.out.println("Entre 1 y " + numero + " hay " + totalp + " números primos.");
        scanner.close();
    }
}