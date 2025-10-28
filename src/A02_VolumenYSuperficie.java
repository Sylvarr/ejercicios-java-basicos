/*
 * Pide largo, ancho y alto. Calcula el volumen y la superficie total.
 * Fórmulas:
 * volumen = largo * ancho * alto;
 * superficie = 2 * (largo * ancho + largo * alto + ancho * alto);
 */

import java.util.Scanner;

public class A02_VolumenYSuperficie {

  public static void main(String[] args) {

    // Scanner para leer desde la consola
    Scanner sc = new Scanner(System.in);

    // Pedir y leer el largo (entero)
    System.out.println("Por favor introduce el largo: ");
    int largo = sc.nextInt();

    // Pedir y leer el ancho (entero)
    System.out.println("Por favor introduce el ancho: ");
    int ancho = sc.nextInt();

    // Pedir y leer el alto (entero)
    System.out.println("Por favor introeduce el alto: ");
    int alto = sc.nextInt();

    // Calcular volumen
    int volumen = largo * ancho * alto;

    // Calcular volumen
    int superficie = 2 * ((largo * ancho) + (largo * alto) + (ancho * alto));

    // Mostrar resultados formateados
    System.out.println();
    System.out.println("RESULTADO");
    System.out.println("-----------");
    System.out.println("Volumen: " + volumen + "m³");
    System.out.println("Superficie: " + superficie + "m²");

    // Cerrar el Scanner para liberar el recurso
    sc.close();

  }

}