
/* Se pide por pantalla un número entero
a. Se comprueba que es un número positivo y distinto de cero.
i. Si además es de dos cifras, se muestra si es par o impar
ii. Si es de tres cifras se muestra el resto de dividir este número entre 2
b. Si no se cumplen las condiciones, aparece un mensaje de error.*/
import java.util.Scanner;

public class t11bucles3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int numero = scanner.nextInt();
       
        if (numero > 0 && numero <= 999) {
            System.out.println("El número es positivo y distinto de 0.");
            if (numero >= 10 && numero <= 99) {
                if (numero % 2 == 0) {
                    System.out.println("El número es par.");
                } else {
                    System.out.println("El número es impar.");
                }
            } else if (numero >= 100 && numero <= 999) {
                System.out.println("El resto es " + (numero % 2));
            } else {
                System.out.println("Error.");
            }
        } else {
            System.out.println("Error.");
        }
        scanner.close();
    }
}
