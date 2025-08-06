public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Estoy aprendiendo Java");
        System.out.println("Este es mi primer codigo en Java");
        System.out.print("Hello World ");
        System.out.print("I will print on the same line. ");
        System.out.println(13);
        System.out.println(22);
        System.out.println(5+5);
        System.out.println(5*2);
        //Esto es un comentario
        /*Esto es para un comentario largo de mas de una linea */
        //Sintaxis para definir variable: type variableName = value;
        String name = "John";
        System.out.println(name);
        //int myNum = 13;
        //System.out.println(myNum);
        int myNum = 15;
        myNum = 20; //myNum ahora vale 20
        System.out.println(myNum);
        final int myNum = 15;
        myNum = 20; //Causara un error porque myNum es final y no se puede cambiar
        //Demostracion de como declarar variables de diferentes tipos
        int myNum = 5; //Entero
        float myFloatNum = 5.99f; //Decimal
        char myLetter = 'D'; //Caracter
        boolean myBool = true; //Booleano
        String myText = "Hello"; //Cadena de texto
        String name = "John";
        System.out.println("Hello " + name);
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        int x = 5;
        int y = 6;    
        System.out.println(x + y);
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);
        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);
        

    }
    
}
