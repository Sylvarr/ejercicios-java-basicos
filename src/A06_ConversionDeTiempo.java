/*
 * Programa para convertir segundos a formato horas:minutos:segundos
 * Fórmulas:
 * horas = segundos / 3600;
 * minutos = (segundos % 3600) / 60;
 * restoSegundos = segundos % 60;
 */

import java.util.Scanner;

public class A06_ConversionDeTiempo {

  public static void main(String[] args) {
    // Inicializar scanner para entrada de usuario
    Scanner sc = new Scanner(System.in);

    // Solicitar y leer cantidad de segundos
    System.out.println("Por favor introduce una cantidad en segundos: ");
    int segundos = sc.nextInt();

    // Validar que el número sea positivo
    if (segundos >= 0) {
      // Calcular conversiones
      int horas = segundos / 3600;
      int minutos = (segundos % 3600) / 60;
      int restoSegundos = segundos % 60;

      // Mostrar resultado en formato H:M:S
      System.out.println();
      System.out.println("RESULTADOS");
      System.out.println("------------");
      System.out.println(horas + "H:" + minutos + "M:" + restoSegundos + "S");

    } else {
      System.out.println("Por favor introduce un número positivo.");
    }

    // Cerrar scanner
    sc.close();
  }

}
