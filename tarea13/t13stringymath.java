/*Desarrollar un programa que solicita la contraseña o pass. Se debe comprobar:
• Que la longitud de la cadena no es superior a 25 caracteres.
• No debe contener caracteres especiales:@,.,$,#,&,/
• Se debe almacenar la primera letra y la última en mayúsculas*/

import java.util.Scanner;

public class t13stringymath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass;
        boolean passok = false;

        while (!passok) {
            System.out.print("Introduce una contraseña: ");
            pass = scanner.nextLine();

            if (pass.length() > 25) {
                System.out.println("La contraseña no puede superar 25 caracteres.");
            } else if (!pass.matches("[a-zA-Z0-9]+")) {
                System.out.println("La contraseña no puede contener caracteres especiales.");
            } else {
                char primeraL = Character.toUpperCase(pass.charAt(0));
                char ultimaL = Character.toUpperCase(pass.charAt(pass.length() - 1));

                if (pass.length() > 1) {
                    pass = primeraL + pass.substring(1, pass.length() - 1) + ultimaL;
                } else {
                    pass = String.valueOf(primeraL);
                }
                System.out.println("Contraseña guardada: " + pass);
                passok = true;
            }
        }
        scanner.close();
    }
}