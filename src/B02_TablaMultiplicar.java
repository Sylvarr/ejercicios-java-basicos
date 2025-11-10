/*
 * Pide al usuario un número (por ejemplo, el 8) y muestra su tabla de multiplicar del 1 al 10. 
 * Reto extra: Muestra las tablas de multiplicar de todos los números del 1 al 10.
 */

import java.util.Scanner;

public class B02_TablaMultiplicar {

  public static void main(String[] args) {

    // Se crea un objeto Scanner para leer la entrada del usuario desde la consola.
    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor introduce un número: ");
    // Se lee el número entero introducido por el usuario.
    int numero = sc.nextInt();

    System.out.println("RESULTADO");
    System.out.println("Tabla de multiplicar del numero " + numero + ": ");

    // Bucle 'for' que itera del 1 al 10 para generar la tabla.
    for (int i = 1; i <= 10; i++) {

      // Se imprime cada línea de la tabla de multiplicar.
      System.out.println(i + " * " + numero + " = " + (i * numero));

    }

    // Se cierra el objeto Scanner para liberar recursos.
    sc.close();
  }
}
