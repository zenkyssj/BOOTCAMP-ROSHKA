import java.util.Scanner;
public class RelojDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese segundos desde medianoche: ");
        int segundos = scanner.nextInt();
        Reloj reloj1 = new Reloj(segundos);
        System.out.println("Aumentando el reloj 10 veces: ");
        for (int a = 0; a < 10; a++) {
            reloj1.tick();
            System.out.println(reloj1);
        }
        System.out.println("Ingrese segundos para el siguiente reloj: ");
        int segundos2 = scanner.nextInt();
        Reloj reloj2 = new Reloj(segundos2);
        int diferencia = reloj1.restaReloj(reloj2);
        System.out.println("La diferencia en segundos entre el primer reloj y el segundo reloj es: " + diferencia);
        scanner.close();
    }
}
