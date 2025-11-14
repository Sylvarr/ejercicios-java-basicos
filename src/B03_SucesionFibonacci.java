/*
 * Muestra los primeros 'N' números de la sucesión de Fibonacci.
 * El usuario debe introducir 'N', que es la cantidad de números de la sucesión que se desean ver.
 *
 * La sucesión de Fibonacci es una serie de números donde cada número es la suma de los dos anteriores.
 * Comienza con 0 y 1: 0, 1, 1, 2, 3, 5, 8, 13, ...
 */

import java.util.Scanner; // Importa la clase Scanner para poder leer la entrada del usuario.

public class B03_SucesionFibonacci {

  public static void main(String[] args) {

    // Crea un objeto Scanner para leer la entrada de datos desde la consola.
    Scanner sc = new Scanner(System.in);

    System.out.println("Sucesión de Fibonacci");
    System.out.println("---------------------");
    System.out.println("Por favor introduce un número: ");

    // Lee el número entero introducido por el usuario, que será 'N'.
    int numero = sc.nextInt();

    System.out.println("La sucesion sería: ");

    // Inicializa los dos primeros términos de la sucesión de Fibonacci.
    // t1 representa el término actual y t2 el siguiente en la lógica de actualización.
    int t1 = 0, t2 = 1;

    // Bucle para generar y mostrar los 'N' primeros números de la sucesión.
    // El bucle se ejecuta 'numero' veces, una por cada término que queremos mostrar.
    for (int i = 1; i <= numero; ++i) {
      // Imprime el término actual (t1).
      System.out.println(t1);

      // Calcula el siguiente término de la sucesión sumando los dos anteriores (t1 y t2).
      int suma = t1 + t2;

      // Actualiza los términos para la siguiente iteración:
      // El 'nuevo' t1 será el 'viejo' t2.
      t1 = t2;
      // El 'nuevo' t2 será la 'suma' que acabamos de calcular.
      t2 = suma;
    }

    // Cierra el objeto Scanner para liberar los recursos del sistema.
    // Es una buena práctica cerrar los recursos que se abren.
    sc.close();

  }
}
