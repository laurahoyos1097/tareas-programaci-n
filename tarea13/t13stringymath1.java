
/*Diseña un objeto de tipo String que pide por teclado un grupo de dos-tres palabras.
Implementar los siguientes métodos:
• Imprimir la primera mitad de los caracteres de la cadena
• Imprimir el último carácter
• Imprimir la cadena de forma inversa
• Imprimir cada carácter del String separado por un guión
• Imprimir la cantidad de vocales almacenadas*/
import java.util.Scanner;

public class t13stringymath1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String palabras;

        System.out.print("Introduce palabras: ");
        palabras = scanner.nextLine();

        primeraM(palabras);
        ultimoC(palabras);
        inversa(palabras);
        guiones(palabras);
        vocales(palabras);
        leer(palabras);

        scanner.close();
    }

    public static void primeraM(String palabras) {
        int mitad = palabras.length() / 2;
        System.out.println("Primera mitad: " + palabras.substring(0, mitad));
    }

    public static void ultimoC(String palabras) {
        char ultimo = palabras.charAt(palabras.length() - 1);
        System.out.println("Último carácter: " + ultimo);
    }

    public static void inversa(String palabras) {
        String inversa = "";
        for (int i = palabras.length() - 1; i >= 0; i--) {
            inversa = inversa + palabras.charAt(i);
        }
        System.out.println("Cadena a la inversa: " + inversa);
    }

    public static void guiones(String palabras) {
        String guionesF = "";
        for (int i = 0; i < palabras.length(); i++) {
            guionesF += palabras.charAt(i);
            if (i < palabras.length() - 1) {
                guionesF = guionesF + "-";
            }
        }
        System.out.println("Con guiones: " + guionesF);
    }

    public static void vocales(String palabras) {
        int contador = 0;
        for (int i = 0; i < palabras.length(); i++) {
            char c = Character.toLowerCase(palabras.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' ||
                    c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("Cantidad de vocales: " + contador);
    }

    public static void leer(String palabras) {
        String limpiar = palabras.replaceAll("\\s+", "").toLowerCase();
        String inversa = "";

        for (int i = limpiar.length() - 1; i >= 0; i--) {
            inversa += limpiar.charAt(i);
        }
        if (limpiar.equals(inversa)) {
            System.out.println("La cadena se lee igual a la inversa.");
        } else {
            System.out.println("La cadena no se lee igual a la inversa.");
        }
    }
}