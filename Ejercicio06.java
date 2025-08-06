import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
         float PrecioBase = scanner.nextFloat();
         float iva = PrecioBase * 0.10f;
         float Final = PrecioBase + iva;
         System.out.println("Precio con IVA: " + Final);
        scanner.close();

    }
}
