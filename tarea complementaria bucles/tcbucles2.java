/*Usando un bucle for escribir un script que pida un valor entero y muestre en pantalla una lista
de números desde el 0 al valor tecleado. Los números se separarán por comas*/
import java.util.Scanner;

public class tcbucles2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        for (int i = 0; i <= numero; i++) {
            if (i < numero) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }

        scanner.close();
    }
}