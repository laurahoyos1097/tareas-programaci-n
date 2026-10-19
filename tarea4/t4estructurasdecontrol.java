import java.util.Scanner;

public class t4estructurasdecontrol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Introduce 3 números: ");
        int numero = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        int mayor = 0;
        int menor = 0;

        if (numero >= numero2 && numero >= numero3) {
            mayor = numero;
        }
        else if (numero2 >= numero && numero2 >= numero3) {
            mayor = numero2;
        }
        else {
            mayor = numero3; 
        }

        System.out.println("El número mayor es: " + mayor);

        if (numero <= numero2 && numero <= numero3) {
            menor = numero;
        }
        else if (numero2 <= numero && numero2 <= numero3) {
            menor = numero2;
        }
        else {
            menor = numero3; 
        }

        System.out.print("El número menor es: " + menor);

        scanner.close();
    }
}