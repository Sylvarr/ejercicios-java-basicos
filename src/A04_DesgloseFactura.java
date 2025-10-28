/*
 * Ejercicio 4: Desglose de factura
 * Pide el precio de un producto sin IVA. Muestra el IVA (21%) y el total con IVA.
 * Fórmulas:
 * iva = precio * 0.21;
 * total = precio + iva;
 */

import java.util.Scanner;

public class A04_DesgloseFactura {

  public static void main(String[] args) {

    // Creamos el Scanner para leer la entrada
    Scanner sc = new Scanner(System.in);

    // Solicitamos el precio sin IVA
    System.out.println("Por favor indica el precio: ");
    double precio = sc.nextDouble();

    // Validamos que el precio sea positivo
    if (precio <= 0) {
      System.out.println("Por favor introduce un número positivo.");
    } else {
      // Calculamos el IVA (21%) y el total
      double iva = precio * 0.21;
      double total = precio + iva;

      // Redondear a 2 decimales
      iva = Math.round(iva * 100.0) / 100.0;
      total = Math.round(total * 100.0) / 100.0;

      // Mostramos los resultados
      System.out.println();
      System.out.println("RESULTADO");
      System.out.println("--------------");
      System.out.println("IVA: " + iva + "EUR");
      System.out.println("TOTAL: " + total + "EUR");
    }
    // Cerramos el Scanner
    sc.close();
  }
}
