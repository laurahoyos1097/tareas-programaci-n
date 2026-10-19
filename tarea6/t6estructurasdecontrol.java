import java.util.Scanner;

public class t6estructurasdecontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("El número " + a + " es mayor que el número " + b);
            System.out.println("El número " + b + " es menor que el número " + a);
        }
        else if (b > a) {
            System.out.println("El número " + b + " es mayor que el número " + a);
            System.out.println("El número " + a + " es menor que el número " + b);
        }
        scanner.close();
    }
}