/*
 * Ejercicio 1: Área y perímetro de un círculo
 * Pide el radio de un círculo y calcula su área y perímetro.
 *  Fórmulas:
 * area = Math.PI * radio * radio;
 * perimetro = 2 * Math.PI * radio;
 */

import java.util.Scanner;

public class A01_AreaYPerimetro {

  public static void main(String[] args) {

    // Crear un objeto Scanner para leer la entrada desde la consola (System.in)
    Scanner sc = new Scanner(System.in);

    // Pedimos al usuario que introduzca el radio del círculo
    System.out.println("Por favor introduce un radio: ");

    // Leemos un número de tipo double desde la entrada estándar
    double radio = sc.nextDouble();

    // Calculamos el área usando la constante Math.PI y la fórmula área = PI * r^2
    double area = Math.PI * radio * radio;

    // Calculamos el perímetro (circunferencia) con la fórmula perímetro = 2 * π * r
    double perimetro = 2 * Math.PI * radio;

    // Mostramos los resultados por pantalla
    System.out.println("El area del circulo es " + area + " y su perimetro es: " + perimetro + ".");

    // Cerramos el Scanner para liberar el recurso asociado a System.in
    sc.close();

  }
}
