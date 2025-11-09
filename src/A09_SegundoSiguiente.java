/*
* Pedir una hora de la forma hora, minutos y segundos, y mostrar la
* hora en el segundo siguiente. Recordamos que de las 23:59:59 se
* pasa a las 0:0:0. Se hace con enteros, y se muestra con enteros.
*/

import java.util.Scanner;

public class A09_SegundoSiguiente {

  public static void main(String[] args) {

    // Se crea un objeto Scanner para leer la entrada del usuario desde la consola.
    Scanner sc = new Scanner(System.in);

    // Se solicita al usuario que introduzca la hora, minutos y segundos.
    System.out.println("Introduce la hora, minutos y segundos para calcular el segundo siguiente.");

    System.out.println("Por favor introduce la hora: ");
    int hora = sc.nextInt(); // Lee la hora introducida por el usuario.
    System.out.println("Por favor introduce los minutos: ");
    int minutos = sc.nextInt(); // Lee los minutos introducidos por el usuario.
    System.out.println("Por favor introduce los segundos: ");
    int segundos = sc.nextInt(); // Lee los segundos introducidos por el usuario.

    // Se comprueba si los valores de hora, minutos y segundos son válidos.
    if (hora >= 0 && hora < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {

      // Se incrementa el segundo en uno.
      segundos++;

      // Si los segundos llegan a 60, se reinician a 0 y se incrementa un minuto.
      if (segundos == 60) {
        segundos = 0;
        minutos++;
        // Si los minutos llegan a 60, se reinician a 0 y se incrementa una hora.
        if (minutos == 60) {
          minutos = 0;
          hora++;
          // Si la hora llega a 24, se reinicia a 0 (medianoche).
          if (hora == 24) {
            hora = 0;
          }
        }
      }

      // Se muestra la hora calculada para el siguiente segundo.
      System.out.println("La hora en el segundo siguiente es: " + hora + ":" + minutos + ":" + segundos);
    } else {
      // Si los valores no son válidos, se muestra un mensaje de error.
      System.out.println(
          "Error: Los valores introducidos no son válidos. Asegúrate de que la hora esté entre 0 y 23, y los minutos/segundos entre 0 y 59.");
    }

    // Se cierra el objeto Scanner para liberar recursos.
    sc.close();

  }

}