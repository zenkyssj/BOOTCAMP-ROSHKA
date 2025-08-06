 import java.util.Scanner;

public class JuegoNim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pilas = {3, 4, 5}; // A, B, C
        System.out.print("Jugador 1, ingrese su nombre: ");
        String jugador1 = scanner.nextLine();
        System.out.print("Jugador 2, ingrese su nombre: ");
        String jugador2 = scanner.nextLine();
        String jugadorActual = jugador1;
        String otroJugador = jugador2;
        while (!juegoTerminado(pilas)) {
            mostrarPilas(pilas);
            System.out.print(jugadorActual + ", elija una pila: ");
            String pila = scanner.nextLine().toUpperCase();
            int indicePila = -1;
            if (pila.equals("A")) indicePila = 0;
            else if (pila.equals("B")) indicePila = 1;
            else if (pila.equals("C")) indicePila = 2;
            else {
                System.out.println("Pila inválida. Intenta de nuevo.");
                continue;
            }
            if (pilas[indicePila] == 0) {
                System.out.println("Esa pila está vacía. Elige otra.");
                continue;
            }
            System.out.print("Cuantos quitara de la pila " + pila + ": ");
            int cantidad;
            try {
                cantidad = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un número válido.");
                continue;
            }

            if (cantidad < 1 || cantidad > pilas[indicePila]) {
                System.out.println("Cantidad inválida. Intenta de nuevo.");
                continue;
            }
            pilas[indicePila] -= cantidad;
            if (juegoTerminado(pilas)) {
                mostrarPilas(pilas);
                System.out.println(jugadorActual + ", ya no quedan contadores, asi que... " + otroJugador + ", Ganaste!");
                break;
            }
            String temp = jugadorActual;
            jugadorActual = otroJugador;
            otroJugador = temp;
        }
        scanner.close();
    }
    public static void mostrarPilas(int[] pilas) {
        System.out.println("A: " + pilas[0] + "   B: " + pilas[1] + "   C: " + pilas[2]);
    }
    public static boolean juegoTerminado(int[] pilas) {
        return pilas[0] == 0 && pilas[1] == 0 && pilas[2] == 0;
    }
}
