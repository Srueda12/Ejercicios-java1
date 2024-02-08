package B3;

import java.util.Scanner;

public class PromedioEstudiantes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Definimos nuestro arreglo
        String[] nombres = new String[5];
        String[] telefonos = new String[5];
        double[][] notas = new double[5][5];
        double[] promedio = new double[5];

        //Ahora solicitamos y guardamos los datos nombre, telefono y notas
        System.out.println("Nombre del estudiante #1: ");
        nombres[0] = scanner.nextLine();

        System.out.println("Telefono del estudiante #1: ");
        telefonos[0] = scanner.nextLine();

        System.out.println("1ra nota del estudiante #1: ");
        notas[0][0] = scanner.nextDouble();

        System.out.println("2da nota del estudiante #1: ");
        notas[0][1] = scanner.nextDouble();

        System.out.println("3ra nota del estudiante #1: ");
        notas[0][2] = scanner.nextDouble();

        System.out.println("4ta nota del estudiante #1: ");
        notas[0][3] = scanner.nextDouble();

        System.out.println("5ta nota del estudiante #1: ");
        notas[0][4] = scanner.nextDouble();

        scanner.nextLine();

        // Calculamos el promedio de notas para el estudiante 1
        promedio[0] = calcularPromedio(notas[0]);

        //2do estudiante
        System.out.println("Nombre del estudiante #2: ");
        nombres[1] = scanner.nextLine();

        System.out.println("Telefono del estudiante #2: ");
        telefonos[1] = scanner.nextLine();

        System.out.println("1ra nota del estudiante #2: ");
        notas[1][0] = scanner.nextDouble();

        System.out.println("2da nota del estudiante #2: ");
        notas[1][1] = scanner.nextDouble();

        System.out.println("3ra nota del estudiante #2: ");
        notas[1][2] = scanner.nextDouble();

        System.out.println("4ta nota del estudiante #2: ");
        notas[1][3] = scanner.nextDouble();

        System.out.println("5ta nota del estudiante #2: ");
        notas[1][4] = scanner.nextDouble();

        scanner.nextLine();

        // Calculamos el promedio de notas para el estudiante 2
        promedio[1] = calcularPromedio(notas[1]);

        //3er estudiante
        System.out.println("Nombre del estudiante #3: ");
        nombres[2] = scanner.nextLine();

        System.out.println("Telefono del estudiante #3: ");
        telefonos[2] = scanner.nextLine();

        System.out.println("1ra nota del estudiante #3: ");
        notas[2][0] = scanner.nextDouble();

        System.out.println("2da nota del estudiante #3: ");
        notas[2][1] = scanner.nextDouble();

        System.out.println("3ra nota del estudiante #3: ");
        notas[2][2] = scanner.nextDouble();

        System.out.println("4ta nota del estudiante #3: ");
        notas[2][3] = scanner.nextDouble();

        System.out.println("5ta nota del estudiante #3: ");
        notas[2][4] = scanner.nextDouble();

        scanner.nextLine();

        // Calculamos el promedio de notas para el estudiante 3
        promedio[2] = calcularPromedio(notas[2]);

        //4to estudiante
        System.out.println("Nombre del estudiante #4: ");
        nombres[3] = scanner.nextLine();

        System.out.println("Telefono del estudiante #4: ");
        telefonos[3] = scanner.nextLine();

        System.out.println("1ra nota del estudiante #4: ");
        notas[3][0] = scanner.nextDouble();

        System.out.println("2da nota del estudiante #4: ");
        notas[3][1] = scanner.nextDouble();

        System.out.println("3ra nota del estudiante #4: ");
        notas[3][2] = scanner.nextDouble();

        System.out.println("4ta nota del estudiante #4: ");
        notas[3][3] = scanner.nextDouble();

        System.out.println("5ta nota del estudiante #4: ");
        notas[3][4] = scanner.nextDouble();

        scanner.nextLine();

        // Calculamos el promedio de notas para el estudiante 4
        promedio[3] = calcularPromedio(notas[3]);

        //5to estudiante
        System.out.println("Nombre del estudiante #5: ");
        nombres[4] = scanner.nextLine();

        System.out.println("Telefono del estudiante #5: ");
        telefonos[4] = scanner.nextLine();

        System.out.println("1ra nota del estudiante #5: ");
        notas[4][0] = scanner.nextDouble();

        System.out.println("2da nota del estudiante #5: ");
        notas[4][1] = scanner.nextDouble();

        System.out.println("3ra nota del estudiante #5: ");
        notas[4][2] = scanner.nextDouble();

        System.out.println("4ta nota del estudiante #5 ");
        notas[4][3] = scanner.nextDouble();

        System.out.println("5ta nota del estudiante #5: ");
        notas[4][4] = scanner.nextDouble();

        scanner.nextLine();

        // Calculamos el promedio de notas para el estudiante 5
        promedio[4] = calcularPromedio(notas[4]);

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




