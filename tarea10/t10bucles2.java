/*Imprimir los números del 10000 al 1, con decremento de 10*/
public class t10bucles2 {
    public static void main(String[] args) {
        for (int numero = 10000; numero >= 1; numero -= 10) {
            System.out.println("Número " + numero);
        }
        System.out.println("Número 1");
    }
}