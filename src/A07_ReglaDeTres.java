/*
 * Si 3 manzanas cuestan 5€, ¿cuánto cuestan X manzanas?
 * Fórmula:
 * precioTotal = (precioUnidad / cantidadBase) * cantidadUsuario;
 */

import java.util.Scanner;

public class A07_ReglaDeTres {

  public static void main(String[] args) {

    // Inicializamos el Scanner para leer la entrada del usuario.
    Scanner sc = new Scanner(System.in);

    // Definimos el precio y la cantidad base para el cálculo.
    double precioUnidad = 5.0;
    int cantidadBase = 3;

    // Pedimos al usuario que introduzca la cantidad de manzanas que quiere comprar.
    System.out.println("Cuantas manzanas quieres comprar ? ");
    int cantidadUsuario = sc.nextInt();

    // Calculamos el precio total aplicando la regla de tres.
    double precioTotal = (precioUnidad / cantidadBase) * cantidadUsuario;
    // Redondeamos el resultado a dos decimales para que se muestre como un precio.
    precioTotal = Math.round(precioTotal * 100.0) / 100;

    // Mostramos el precio total al usuario.
    System.out.println("El precio total es: " + precioTotal + "€");

    // Cerramos el Scanner para liberar recursos.
    sc.close();

  }

}
