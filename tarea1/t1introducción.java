// importar scanner para que el usuario pueda introducir los datos y nombrar la clase
import java.util.Scanner;

public class t1introducción {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // mensajes a mostrar y variables
        System.out.print("¿Qué edad tienes? ");
        int edad = scanner.nextInt();

        // condiciones
        if (edad < 18) {
            System.out.println("No se puede calcular el salario de un menor de edad.");
        }   {
            System.out.print("Número de horas trabajadas esta semana: ");
            double numHoras = scanner.nextDouble();
            System.out.print("Salario por hora (en euros): ");
            double salarioHora = scanner.nextDouble();

            double salarioBruto = numHoras * salarioHora;
            double porcentajeDescuento;

            if (salarioBruto < 300) {
                porcentajeDescuento = 0;
            }   if (salarioBruto <= 600) {
                porcentajeDescuento = 0.10;
            }   {
                porcentajeDescuento = 0.15;
            }

            // cálculos del salario
            double descuento = salarioBruto * porcentajeDescuento;
            double salarioNeto = salarioBruto - descuento;

            // resultados finales
            System.out.println("Salario bruto: " + salarioBruto + "€");
            System.out.println("Descuento aplicado: " + (porcentajeDescuento * 100) + "%");
            System.out.println("Salario neto: " + salarioNeto + "€");
        }
        scanner.close();
    }
}