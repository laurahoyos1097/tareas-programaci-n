public class t2variables {
    public static void main(String[] args) {
        String nombreJuego = "DayZ";
        int jugadoresMax = 127;
        float version = 1.29f;
        boolean online = true;
        char tier = 'S';
        long descargas = 10000000L;
        short añoLanzamiento = 2013;
        byte edadMedia = 30;
        double puntuacion = 3.5;

        System.out.println("Nombre: " + nombreJuego);
        System.out.println("Parche actual: " + version);
        System.out.println("Jugadores máximos: " + jugadoresMax);
        if (online) {
            System.out.println("¿Online?: Sí");
        }
          {
            System.out.println("¿Online?: No");
        }
        System.out.println("Tier: " + tier);
        System.out.println("Descargas totales: " + descargas);
        System.out.println("Año lanzamiento: " + añoLanzamiento);
        System.out.println("Edad media del jugador: " + edadMedia);
        System.out.println("Puntuación Steam: " + puntuacion);
    }
}
