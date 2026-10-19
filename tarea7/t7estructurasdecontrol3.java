import java.util.Scanner;

public class t7estructurasdecontrol3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce cuatro números:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int mayor = 0;
        int menor = 0;

        if (a > mayor) {
            mayor = a;
        }
        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }
        if (d > mayor) {
            mayor = d;
        }
        System.out.println("El mayor es: " + mayor);
        System.out.println("El resultado de la suma es: " + (mayor + b));

        menor = a;

        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }
        if (d < menor) {
            menor = d;
        }
        System.out.println("El menor es: " + menor);
        System.out.println("El resultado de la multiplicación es: " + (menor * a));

        scanner.close();
    }
}