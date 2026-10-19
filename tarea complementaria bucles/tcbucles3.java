
/*Se trata de que dado un número entero el script muesre una cuenta atrás, es decir, una lista
de numeros separados por coma desde el número tecleado hasta el 0*/
import java.util.Scanner;

public class tcbucles3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        for (int i = numero; i >= 0; i--) {
            if (i > 0) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }

        scanner.close();
    }
}