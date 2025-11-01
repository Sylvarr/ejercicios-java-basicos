/*
 * Programa para convertir temperaturas de Celsius a Fahrenheit y Kelvin.
 * Fórmulas:
 * fahrenheit = celsius * 9/5 + 32;
 * kelvin = celsius + 273.15
 */

import java.util.Scanner;

public class A05_ConversionDeUnidades {

  public static void main(String[] args) {
    // Crear scanner para entrada de usuario
    Scanner sc = new Scanner(System.in);

    // Solicitar y leer temperatura en Celsius
    System.out.println("Por favor introduce una cantidad en grados Celsius: ");
    double celsius = sc.nextDouble();

    // Realizar conversiones
    double fahrenheit = celsius * 9.0 / 5.0 + 32;
    double kelvin = celsius + 273.15;
    // Redondear kelvin a 2 decimales
    kelvin = Math.round(kelvin * 100.0) / 100.0;

    // Mostrar resultados
    System.out.println();
    System.out.println("RESULTADOS");
    System.out.println("-------------");
    System.out.println("Fahrenheid: " + fahrenheit + "º");
    System.out.println("Kelvin: " + kelvin + "º");

    // Cerrar el scanner
    sc.close();
  }

}
