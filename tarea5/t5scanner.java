import java.util.Scanner;

public class t5scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tus apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Buenos días " + nombre + " " + apellidos);

        scanner.close();
    }
}