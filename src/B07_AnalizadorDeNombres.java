/*
* El Analizador de Nombres
* Descripción: Crea un programa que pida al usuario su nombre completo.
* El programa debe imprimir:
*   El nombre todo en mayúsculas.
*   El nombre todo en minúsculas.
*   El número total de caracteres (longitud).
*   La primera letra y la última letra del nombre.
*/

import java.util.Scanner;

public class B07_AnalizadorDeNombres {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor introduce un nombre: ");
    String nombre = sc.nextLine();

    System.out.println("RESULTADOS");
    System.out.println("----------");
    System.out.println("1. El nombre en mayúsculas sería: " + nombre.toUpperCase());
    System.out.println("2. El nombre en minúsculas sería: " + nombre.toLowerCase());
    System.out.println("3. El número total de caracteres sería: " + nombre.length());
    char primeraLetra = nombre.charAt(0), ultmaLetra = nombre.charAt(nombre.length() - 1);

    System.out.println("4. La primera y la última letra del nombre serían " + "'" + primeraLetra + "'" + " y " + "'"
        + ultmaLetra + "'" + ".");

    sc.close();

  }

}
