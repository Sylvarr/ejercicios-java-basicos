/*
 * Métodos clave: .trim(), .equals(), .equalsIgnoreCase()
 * Ejercicio 2: El Login Seguro
 * Descripción: Simula un sistema de entrada. Tienes una contraseña guardada en una variable: String passSistema = "Secreto123";.
 * Tarea: Pide al usuario que introduzca la contraseña.
 * Requisito 1: Si el usuario mete espacios al principio o al final por error
 * (ej: " Secreto123 "), el programa debe ignorarlos (usar trim).
 * Requisito 2: Debe comparar si la contraseña es exacta.
 * Extra: Crea una segunda versión que acepte la contraseña aunque el usuario la
 * escriba en mayúsculas o minúsculas (ej: "SECRETO123").
 */

import java.util.Scanner;

public class B08_LimpiezaYComparacion {

  public static void main(String[] args) {

    // Contraseña fija del sistema (constante)
    final String passSistema = "Secreto123";
    // Scanner para leer la entrada del usuario desde consola
    Scanner sc = new Scanner(System.in);
    // Pide la contraseña al usuario
    System.out.println("Por favor introduce tu contraseña:");
    // Leer la línea completa y eliminar espacios al inicio/fin
    String passHumano = sc.nextLine().trim();

    // ! Caso case sensitive
    // Comparación exacta: diferencia entre mayúsculas y minúsculas
    if (passSistema.equals(passHumano)) {
      System.out.println("Acceso autorizado.");
    } else {
      System.out.println("Acceso denegado.");
    }

    // ! Caso case insensitive
    // Alternativa: comparar ignorando mayúsculas/minúsculas
    // if (passSistema.equalsIgnoreCase(passHumano)) {
    // System.out.println("Acceso autorizado.");
    // } else {
    // System.out.println("Acceso denegado.");
    // }

    // Cerrar recursos
    sc.close();
  }

}
