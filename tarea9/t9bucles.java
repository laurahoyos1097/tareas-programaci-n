/* Diseña un programa que imprime los números del 1-100. 
Realiza el mismo ejercicio con un
bucle for y un bucle while. */

public class t9bucles {
    public static void main(String[] args) {
        int numero = 1;

        while (numero <= 100) {
            System.out.println("Número " + numero);
            ++numero;
        }
    }
}