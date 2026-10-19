
/*Se quiere un bucle que genere una lista con todos los números pares positivos por debajo del
número tecleado por el usuario. Los números se aparecerán en una ventana alert con cambios
de linea (carácter '\n')*/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class tcbucles4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        String resultado = "";
        for (int i = 2; i < numero; i += 2) {
            resultado = resultado + i + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);

        scanner.close();
    }
}