/*Pedir dos números y decir si uno es múltiplo del otro*/
import java.util.Scanner;

public class tareacif2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a != 0 && b % a == 0) {
            System.out.println(b + " es múltiplo de " + a);
        } else if (b != 0 && a % b == 0) {
            System.out.println(a + " es múltiplo de " + b);
        } else {
            System.out.println("No son múltiplos");
        }
        scanner.close();
    }
}