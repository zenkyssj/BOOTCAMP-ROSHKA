import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do{
            System.out.println("Favor ingrese un numero mayor que cero: ");
            num = scanner.nextInt();
            if (num <= 0) {
                System.out.println("El numero debe ser mayor a cero");
            }
        } while (num <= 0);
        System.out.println("El numero que se ingreso es: " + num);
        scanner.close();

    }
    
}
