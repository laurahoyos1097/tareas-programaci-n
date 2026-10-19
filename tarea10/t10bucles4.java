/*Se piden números por pantalla al usuario, hasta que se teclea el valor 0*/
import java.util.Scanner;

public class t10bucles4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
       do { 
        System.out.println("Introduce un número: ");
        numero = scanner.nextInt();
       } while (numero > 0);

    }
}