/*Pedir dos números y decir cual es el mayor o si son iguales.*/
import java.util.Scanner;

public class tareacif3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b)
            System.out.println(a + " es mayor");
        else if (b > a)
            System.out.println(b + " es mayor");
        else
            System.out.println("Son iguales");
        scanner.close();
    }
}