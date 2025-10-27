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

    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor introduce un radio: ");
    double radio = sc.nextDouble();

    double area = Math.PI * radio * radio;
    double perimetro = 2 * Math.PI * radio;

    System.out.println("El area del circulo es " + area + " y su perimetro es: " + perimetro + ".");

    sc.close();

  }
}
