package B1;
import java.util.Scanner;
public class Calculadora {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el 1er numero
        System.out.println("Ingrese el primer numero: ");

        // Se guarda el numero en num1
        Integer num1 = scanner.nextInt();

        // Pedir al usuario que ingrese el 2do numero
        System.out.println("Ingrese el segundo numero: ");

        // Se guarda el numero en num2
        Integer num2 = scanner.nextInt();

        //Efectuo operaciones
        System.out.println("El resultado de la suma es: " + (num1 + num2));
        System.out.println("El resultado de la resta es: " + (num1 - num2));
        System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
        System.out.println("El resultado de la division es: " + (num1 / num2));

    }
}
