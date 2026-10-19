
/*Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad
de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.*/
import java.util.Scanner;

public class tareacif15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad = 0;
        int sumaedad = 0;
        double estatura = 0;
        double sumaestatura = 0;
        int mayor18 = 0;
        int mayor175 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduce la edad del " + i + " alumno:");
            edad = scanner.nextInt();
            System.out.println("Introduce la estatura (en centímetros) del " + i + " alumno:");
            estatura = scanner.nextDouble();

            sumaedad = sumaedad + edad;
            sumaestatura = sumaestatura + estatura;

            if (edad > 18) {
                mayor18++;
            }
            if (estatura > 175) {
                mayor175++;
            }
        }

        double mediaedad = sumaedad / 5;
        double mediaestatura = sumaestatura / 5;

        System.out.println("Edad media de los alumnos: " + mediaedad);
        System.out.println("Estatura media de los alumnos: " + mediaestatura);
        System.out.println("Alumnos mayores de 18 años: " + mayor18);
        System.out.println("Alumnos que miden más de 1.75: " + mayor175);
        
        scanner.close();
    }
}