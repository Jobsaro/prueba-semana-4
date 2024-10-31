/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Prueba4 {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pan = new Scanner(System.in);

        System.out.print("Ingrese el numero de empleados: ");
        int numeroEmpleados = pan.nextInt();
        pan.nextLine();

        String[] empleados = new String[numeroEmpleados];
        int[][] horasTrabajadas = new int[numeroEmpleados][7];

        for (int i = 0; i < numeroEmpleados; i++) {
            System.out.print("Ingresa el nombre del empleado " + (i + 1) + ": ");
            empleados[i] = pan.nextLine();

            for (int j = 0; j < 7; j++) {
                System.out.print("Horas trabajadas el día " + (j + 1) + ": ");
                horasTrabajadas[i][j] = pan.nextInt();
            }
            pan.nextLine();
        }

        System.out.println("\n====horas trabajadas====");
        for (int i = 0; i < numeroEmpleados; i++) {
            int totalHoras = 0;
            for (int j = 0; j < 7; j++) {
                totalHoras += horasTrabajadas[i][j];
            }
            double promedioHoras = totalHoras / 7;
            System.out.println(ANSI_GREEN+"Empleado: " + empleados[i]);
            System.out.println(ANSI_YELLOW+"Total de horas trabajadas: " + totalHoras);
            System.out.printf(ANSI_YELLOW+"Promedio de horas trabajadas por día: %.2f%n", promedioHoras);
        }

        pan.close();
    }
}
