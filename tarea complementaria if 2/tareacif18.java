/*Realizar un programa que muestre las tablas de multiplicar del 1 al 10.*/
public class tareacif18 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del número " + i + ":");
            for (int m = 1; m <= 10; m++) {
                System.out.println(i + " x " + m + " = " + (i * m));
            }
        }
    }
}