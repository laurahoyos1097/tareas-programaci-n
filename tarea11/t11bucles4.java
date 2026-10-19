
/* Realizar con el operador not. Pedir un número por pantalla, y comprobar que 
es distinto de cero y mayor que cero.
a. Si se cumple la condición, se calcula si el número es par o impar
b. Si no se cumple la condición, se muestra un mensaje de error */
import java.util.Scanner;

public class t11bucles4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();

        if (!(numero <= 0)) {
            if (numero % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número es impar.");
            }
        } else {
            System.out.println("Error.");
        }
        scanner.close();
    }
}