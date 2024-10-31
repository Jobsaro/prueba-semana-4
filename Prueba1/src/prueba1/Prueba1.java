/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Prueba1 {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantiada de productos que va a registrar: ");
        int cantidadProductos = entrada.nextInt();

        double costoTotal = 0;

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.print("Ingrese el precio del producto #" + i + ": ");
            double precio = entrada.nextDouble();

            System.out.print("Ingresae la cantidad del producto #" + i + ": ");
            int cantidad = entrada.nextInt();

            costoTotal += precio * cantidad;
        }

        System.out.printf(ANSI_GREEN+"El total a pagar es: %.2f%n", costoTotal);
        entrada.close();
    }
}