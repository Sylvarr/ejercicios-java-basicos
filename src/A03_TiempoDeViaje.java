/*
 * Ejercicio 3: Tiempo de viaje
 * Pide la distancia (en km) y la velocidad media (en km/h). Calcula el tiempo que
 * tardará el viaje.
 * Fórmula:
 * tiempo = distancia / velocidad;
 */

import java.util.Scanner;

public class A03_TiempoDeViaje {

  public static void main(String[] args) {
    // Creamos el Scanner para leer datos del usuario
    Scanner sc = new Scanner(System.in);

    // Pedimos y guardamos la distancia
    System.out.println("Por favor indica la distancia (km): ");
    int distancia = sc.nextInt();

    // Declaramos velMedia fuera del if para poder usarla en todo el programa.
    // La inicializamos a 0 porque Java requiere dar un valor inicial a las
    // variables.
    // Si la declarásemos dentro del else, solo podríamos usarla en ese bloque.
    int velMedia = 0;

    // Validamos que la distancia sea positiva
    if (distancia <= 0) {
      System.out.println("Por favor introduce un número mayor que cero.");
    } else {
      // Si la distancia es válida, pedimos la velocidad
      System.out.println("Por favor indica la velocidad media (km/h): ");
      velMedia = sc.nextInt();

      // Validamos que la velocidad sea positiva
      if (velMedia <= 0) {
        System.out.println("Por favor introduce un número mayor que cero.");
      } else {
        // Realizamos los cálculos del tiempo
        float tiempoDeViaje = (float) distancia / velMedia; // Convertimos a float para tener decimales
        int horas = (int) tiempoDeViaje; // Obtenemos las horas completas
        int minutos = (int) ((tiempoDeViaje - horas) * 60); // Convertimos la parte decimal a minutos

        // Mostramos el resultado con formato
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("--------------");
        System.out.println("Tu viaje va a tardar " + horas + " horas y " + minutos + " minutos en completarse.");
      }

    }

    // Cerramos el Scanner para liberar recursos
    sc.close();
  }
}
