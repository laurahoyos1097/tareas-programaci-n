/*Pedir tres números y mostrarlos ordenados de mayor a menor.*/
import java.util.Scanner;

public class tareacif4 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce 3 números: ");
    int numero = scanner.nextInt();
    int numero2 = scanner.nextInt();
    int numero3 = scanner.nextInt();

    int mayor = 0;
    int menor = 0;
    int medio = 0;

    if (numero >= numero2 && numero >= numero3) {
      mayor = numero;
    } else if (numero2 >= numero && numero2 >= numero3) {
      mayor = numero2;
    } else {
      mayor = numero3;
    }

    if (numero <= numero2 && numero <= numero3) {
      menor = numero;
    } else if (numero2 <= numero && numero2 <= numero3) {
      menor = numero2;
    } else {
      menor = numero3;
    }

    if (numero != mayor && numero != menor) {
      medio = numero;
    } else if (numero2 != mayor && numero2 != menor) {
      medio = numero2;
    } else {
      medio = numero3;
    }

    System.out.print("De mayor a menor: " + mayor + " " + medio + " " + menor);

    scanner.close();
  }
}