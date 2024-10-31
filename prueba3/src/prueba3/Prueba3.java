/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Prueba3 {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner camilo = new Scanner(System.in);

        String[] productos = new String[100];
        int[] cantidades = new int[100];
        int totalProductos = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese el nombre del producto: ");
            String producto = camilo.nextLine();

            System.out.print("Ingrese la cantidad a registrar: ");
            int cantidad = camilo.nextInt();
            camilo.nextLine();

            boolean encontrado = false;
            for (int i = 0; i < totalProductos; i++) {
                if (productos[i].equalsIgnoreCase(producto)) {
                    cantidades[i] += cantidad;
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                productos[totalProductos] = producto;
                cantidades[totalProductos] = cantidad;
                totalProductos++;
            }

            System.out.print("Quiere ingresar otro producto? (s/n): ");
            String respuesta = camilo.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        System.out.println("\nInventario final:");
        for (int i = 0; i < totalProductos; i++) {
            System.out.println(productos[i] + ": " + cantidades[i] + " unidades");
        }
        System.out.println(ANSI_GREEN+"La cantidad total de productos registrados: " + totalProductos);

        camilo.close();
    }
}