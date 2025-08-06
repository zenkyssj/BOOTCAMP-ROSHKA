import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseña = "miContraseña123";
        String intento;
        for (int a = 1; a <= 3; a++) {
            System.out.print("Introduce la contraseña (Intento " + a + " de 3): ");
            intento = scanner.nextLine().trim();  
            if (intento.equals(contraseña)) {
                System.out.println("Correcto!");
                break;  
            } else {
                System.out.println("Contraseña incorrecta.");
            }
        }
        System.out.println("Fallaste jaja!!");
        scanner.close();
    }
}


