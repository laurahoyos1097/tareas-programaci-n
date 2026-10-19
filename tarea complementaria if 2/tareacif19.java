/*Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números
del 0-0-0-0-0 al 9-9-9-9-9, con la particularidad que cada vez que aparezca un 3 lo
sustituya por una E.*/

public class tareacif19 {
    public static void main(String[] args) {
        for (int n1 = 0; n1 <= 9; n1++) {
            for (int n2 = 0; n2 <= 9; n2++) {
                for (int n3 = 0; n3 <= 9; n3++) {
                    for (int n4 = 0; n4 <= 9; n4++) {
                        for (int n5 = 0; n5 <= 9; n5++) {

                            String d1 = (n1 == 3) ? "E" : Integer.toString(n1);
                            String d2 = (n2 == 3) ? "E" : Integer.toString(n2);
                            String d3 = (n3 == 3) ? "E" : Integer.toString(n3);
                            String d4 = (n4 == 3) ? "E" : Integer.toString(n4);
                            String d5 = (n5 == 3) ? "E" : Integer.toString(n5);

                            System.out.println(d1 + "-" + d2 + "-" + d3 + "-" + d4 + "-" + d5);
                        }
                    }
                }
            }
        }
    }
}