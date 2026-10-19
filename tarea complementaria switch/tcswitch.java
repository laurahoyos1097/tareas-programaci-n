/* Haz un programa que pida un número al usuario un número de día de la semana (del 1 al 7) y
escriba el nombre de ese día (por ejemplo, "martes" para el día 2). Debes emplear la orden
SWITCH. */

import java.util.Scanner;

public class tcswitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número del 1 al 7: ");
        int dia = scanner.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
        scanner.close();
    }
}