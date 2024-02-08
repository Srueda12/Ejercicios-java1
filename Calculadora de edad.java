package B5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalcularEdad {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        //Pedimos fecha de nacimiento y la pasamos a cadena de texto
        System.out.println("Ingresa tu fecha de nacimiento en años, meses, dias (YYYY-MM-DD)");
        String fecha = scanner.nextLine();

        //Convertimos la cadena de texto fecha a LocalDate
        LocalDate fechaNacim = LocalDate.parse(fecha, DateTimeFormatter.ISO_LOCAL_DATE);

        //Obtenemos la fecha actual
        LocalDate fechaAct = LocalDate.now();

        //Calculamos la edad
        Period periodo = Period.between(fechaNacim, fechaAct);

        System.out.println("Tu edad es: "+periodo.getYears() + " años");
    }
}
