/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Prueba2 {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner manuel = new Scanner(System.in);
        double[] consumoMensual = new double[12];
        double consumoTotal = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese el consumo de agua para el mes(litros) " + (i + 1) + ": ");
            consumoMensual[i] = manuel.nextDouble();
            consumoTotal += consumoMensual[i];
        }

        double promedioMensual = consumoTotal / 12;

        System.out.printf(ANSI_GREEN+"El consumo total anual es: %.2f litros%n", consumoTotal);
        System.out.printf(ANSI_GREEN+"El promedio mensual es: %.2f litros%n", promedioMensual);
        
        manuel.close();
    }
}