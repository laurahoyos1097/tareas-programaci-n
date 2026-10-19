import java.util.Scanner;

public class t7estructurasdecontrol2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 3 números: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " es el mayor");
                System.out.println("El resultado de la suma es " + (a + c) );
            } else if (a < c) {
                System.out.println(c + " es el mayor");
                System.out.println("El resultado de la suma es " + (c + c) );
            }
        } else if (b > a) {
            if (b > c) {
                System.out.println(b + " es el mayor");
                System.out.println("El resultado de la suma es " + (b + c) );
            } else if (b < c) {
                System.out.println(c + " es el mayor");
                System.out.println("El resultado de la suma es " + (c + c) );
            }
        } else if (c > a) {
            if (c > b) {
                System.out.println(c + " es el mayor");
                System.out.println("El resultado de la suma es " + (c + c) );
            } else if (c < b) {
                System.out.println(b + " es el mayor");
                System.out.println("El resultado de la suma es " + (b + c) );
            }
        }

        if (a < b) {
            if (a < c) {
                System.out.println(a + " es el menor");
                System.out.println("El resultado de la multiplicación es " + (a * c) );
            } else if (a > c) {
                System.out.println(c + " es el menor");
                System.out.println("El resultado de la multiplicación es " + (c * c) );
            }
        } else if (b < a) {
            if (b < c) {
                System.out.println(b + " es el menor");
                System.out.println("El resultado de la multiplicación es " + (b * c) );
            } else if (b > c) {
                System.out.println(c + " es el menor");
                System.out.println("El resultado de la multiplicación es " + (c * c) );
            }
        } else if (c < a) {
            if (c < b) {
                System.out.println(c + " es el menor");
                System.out.println("El resultado de la multiplicación es " + (c * c) );
            } else if (c > b) {
                System.out.println(b + " es el menor");
                System.out.println("El resultado de la multiplicación es " + (b * c) );
            }
        }

        scanner.close();
    }
}