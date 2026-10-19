import java.util.Scanner;

public class t7estructurasdecontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a + " es mayor");
        } else if (b > a) {
            System.out.println(b + " es mayor");
        }

        scanner.close();
    }
}