package B2;
import java.util.Scanner;

public class NumEntero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Pedir numero
        System.out.println("Ingrese un numero");

        //Se almacena el numero
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.print("El número ingresado es positivo");
        } else if (num < 0) {
            System.out.print("El número ingresado es negativo");
        } else {
            System.out.print("El número ingresado es 0");
        }
    }
}






