/*Desarrollar una aplicación en Java que permita gestionar el inventario de una librería,
utilizando estructuras de control como if anidados, bucles for, while y do-while
1. Menú Principal:
o Mostrar un menú con las opciones:
1. Agregar nuevo libro
2. Mostrar todos los libros
3. Buscar libro por título
4. Salir
2. Agregar Nuevo Libro:
o Solicitar al usuario los siguientes datos del libro:
▪ Título
▪ Autor
▪ Año de publicación
▪ Precio
o Almacenar la información en una estructura adecuada (por ejemplo, un
ArrayList).
3. Mostrar Todos los Libros:
o Recorrer la lista de libros utilizando un bucle for y mostrar la información de
cada libro.
4. Buscar Libro por Título:
o Solicitar al usuario que ingrese el título del libro que desea buscar.
o Utilizar un bucle while para recorrer la lista de libros y encontrar el que coincida
con el título ingresado.
o Si se encuentra el libro, mostrar su información; de lo contrario, indicar que el
libro no está en el inventario.
5. Salir:
o Finalizar el programa.
Requisitos Técnicos:
• Utilizar estructuras if anidadas para manejar las opciones del menú y validar entradas
del usuario.
• Implementar bucles for para recorrer y mostrar la lista de libros.
• Emplear bucles while para buscar libros por título.
• Utilizar un bucle do-while para mostrar el menú principal y repetir las operaciones hasta
que el usuario decida salir.
• Validar que el año de publicación y el precio sean datos numéricos positivos.
Consideraciones Adicionales:
• Asegurarse de que el programa maneje adecuadamente entradas inválidas o
inesperadas por parte del usuario.
• Comentar el código para explicar la lógica implementada y facilitar su comprensión.
• Probar el programa con diferentes escenarios para garantizar su correcto
funcionamiento. */


/* importo scanner para que el usuario pueda introducir los datos y arraylist para poder almacenar los datos mientras esté abierta la consola */
import java.util.Scanner;
import java.util.ArrayList;

public class t12bucles {
    static class Libro { /* creo una clase interna que contenga los diferentes tipos de variables de un libro*/
        String titulo;
        String autor;
        int pub;
        float precio;
    }

    public static void main(String[] args) { /* creo el objeto scanner */
        Scanner scanner = new Scanner(System.in);

        ArrayList<Libro> libros = new ArrayList<Libro>();
        int opcion; /* creo el arraylist, nombrándolo y creando una variable para guardar la opción del menú */

        do { /* aquí comienza el bucle principal que se repetirá hasta elegir salir*/
            System.out.println("Menú principal. \n" +
                    "1. Agregar nuevo libro \n" +
                    "2. Mostrar todos los libros \n" +
                    "3. Buscar libro por títulos \n" +
                    "4. Salir \n" +
                    "Introduce el número correspondiente a la opción deseada: ");
            opcion = scanner.nextInt(); /* aquí le doy valor a la variable opcion (elegida por el usuario). los n son saltos de línea y el siguiente nextline limpia el scanner*/
            scanner.nextLine();

            if (opcion == 1) { 
                Libro auxlibros = new Libro(); /* crea un nuevo libro con los datos que introduzca el usuario a continuación*/
                System.out.println("Introduce el título:");
                auxlibros.titulo = scanner.nextLine();
                System.out.println("Introduce el autor:");
                auxlibros.autor = scanner.nextLine();
                while (true) { /* guarda también los datos del año de publicación y precio solo si son enteros y positivos, de lo contrario muestra error pero deja rectificarlo sin cerrar la consola o tener que empezar de nuevo */
                    System.out.println("Introduce el año de publicación:");
                    if (scanner.hasNextInt()) { 
                        int anio = scanner.nextInt(); /* variable temporal para comprobar los datos antes de guardarlos definitivamente */
                        scanner.nextLine();
                        if (anio > 0) {
                            auxlibros.pub = anio;
                            break; /*si el año es positivo lo almacena en la variable y sale del bucle*/ 
                        } else {
                            System.out.println("Escribe un año válido."); /* si no es positivo pide otro número */
                        }
                    } else {
                        System.out.println("Escribe un número válido."); /* si no es un número entero o el usuario escribe texto, pide otro número, limpiando el scanner */
                        scanner.nextLine();
                    }
                }
                while (true) {
                    System.out.println("Introduce el precio:");
                    if (scanner.hasNextFloat()) {
                        float precio = scanner.nextFloat();
                        scanner.nextLine();
                        if (precio > 0) {
                            auxlibros.precio = precio;
                            break;
                        } else {
                            System.out.println("Introduce un número válido.");
                        }
                    } else {
                        System.out.println("Introduce un número válido.");
                        scanner.nextLine();
                    }
                }
                System.out.println("Información del libro guardado:");
                System.out.println("Título: " + auxlibros.titulo);
                System.out.println("Autor: " + auxlibros.autor);
                System.out.println("Año de publicación: " + auxlibros.pub);
                System.out.println("Precio: " + auxlibros.precio);

                libros.add(auxlibros); /*guarda el libro en el array*/
            }
            if (opcion == 2) {
                for (int i = 0; i <= libros.size() - 1; i++) { /*la variable i la uso como índice, empezando de 0 e incrementando de uno en uno la posición del array hasta recorrerlas todas*/
                    System.out.println("Información del libro " + i + ": ");
                    System.out.println("Título: " + libros.get(i).titulo); /*muestra los datos en cada posición del array*/
                    System.out.println("Autor: " + libros.get(i).autor);
                    System.out.println("Año de publicación: " + libros.get(i).pub);
                    System.out.println("Precio: " + libros.get(i).precio);
                }
            }
            if (opcion == 3) {
                System.out.println("Introduce el título que desea buscar: ");
                String tituloL = scanner.nextLine();

                int i = 0;
                while (i < libros.size()) {
                    if (libros.get(i).titulo.equals(tituloL)) { /* compara el título introducido con el resto de títulos en cada posición del array */
                        System.out.println("Información del libro " + i + ": ");
                        System.out.println("Título: " + libros.get(i).titulo);
                        System.out.println("Autor: " + libros.get(i).autor);
                        System.out.println("Año de publicación: " + libros.get(i).pub);
                        System.out.println("Precio: " + libros.get(i).precio);
                        break;
                    }
                    if (i == libros.size() - 1) { /* llega al final */
                        System.out.println("No se ha podido encontrar el libro.");
                    }
                    i++;
                }
            }
            if (opcion == 4) { /* no es necesario porque después de cada opción se finaliza el proceso pero por poner un mensajito que valide la opción */
                System.out.println("Saliendo...");
            }
        } while (opcion != 4); /* mientras no se elija salir, se repite el bucle anterior :) */
        scanner.close(); /* cerrar el scanner que se me suele olvidar */
    }
}