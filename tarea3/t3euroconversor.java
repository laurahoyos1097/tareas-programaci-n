import java.util.Scanner;

public class t3euroconversor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double libras = 0;
        
        System.out.print("Cantidad en euros: ");
        double euros = scanner.nextDouble();

        libras = euros * 0.8781;

        System.out.print("Cantidad en libras: " + libras);
        
        scanner.close();
    }
}