
/*Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y
suspensos.*/
import java.util.Scanner;

public class tareacif17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota = 0;
        int aprobados = 0;
        int cond = 0;
        int suspensos = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Introduce la " + i + " de 6 notas:");
            nota = scanner.nextDouble();

            if (nota >= 5) {
                aprobados++;
            } else if (nota >= 4 && nota < 5) {
                cond++;
            } else {
                suspensos++;
            }
        }

        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos condicionados: " + cond);
        System.out.println("Alumnos suspensos: " + suspensos);

        scanner.close();
    }
}