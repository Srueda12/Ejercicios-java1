package B4;

import java.util.Scanner;

public class PromEstudiantesCiclo {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[5];
        String[] telefonos = new String[5];
        double[][] notas = new double[5][5];
        double[] promedio = new double[5];

        //Ahora solicitamos y guardamos los datos nombre, telefono y notas con ciclo FOR
        for (int i = 0; i < 5; i++){
            System.out.println("Nombre del estudiante #" + (i+1));
            nombres[i] = scanner.nextLine();

            System.out.println("Telefono del estudiante #" + (i+1));
            telefonos[i] = scanner.nextLine();

            for (int j = 0; j < 5 ; j++){
                System.out.println("Nota #"+(j+1));
                notas[i][j] = scanner.nextDouble();
            }

            scanner.nextLine();

            // Calculamos el promedio de notas
            promedio[i] = calcularPromedio(notas[i]);

        }

        //Imprimimos los resultados
        System.out.println("*********************************");
        System.out.println("Informacion de los estudiantes: ");
        System.out.println("*********************************");

        for (int i = 0; i < 5; i++) {
            System.out.println("Estudiante #" + (i + 1));
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Telefono: " + telefonos[i]);
            System.out.println("Promedio: " + promedio[i]);
            System.out.println("---------------");

        }

        scanner.close();

    }

    //Funcion para calcular promedio

    private static double calcularPromedio(double[] notas) {
        double sumaNotas = 0;

        for (double nota : notas) {
            sumaNotas = sumaNotas + nota;
        }
        return  sumaNotas / notas.length;

    }
}
