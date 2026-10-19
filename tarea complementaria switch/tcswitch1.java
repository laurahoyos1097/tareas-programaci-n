/*Haz un programa que pida un número al usuario un número de día de la semana (del 1 al 7) y
escriba el nombre de ese día (por ejemplo, "martes" para el día 2). Debes emplear la orden
SWITCH. Crea una variante del ejercicio, en la que emplees varios SI-ENTONCES en vez de SWITCH. */
import java.util.Scanner;

public class tcswitch1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce un número del 1 al 7: ");
    int dia = scanner.nextInt();

    if (dia == 1) {
      System.out.println("Lunes");
    } else if (dia == 2) {
      System.out.println("Martes");
    } else if (dia == 3) {
      System.out.println("Miércoles");
    } else if (dia == 4) {
      System.out.println("Jueves");
    } else if (dia == 5) {
      System.out.println("Viernes");
    } else if (dia == 6) {
      System.out.println("Sábado");
    } else if (dia == 7) {
      System.out.println("Domingo");
    }
    scanner.close();
  }
}