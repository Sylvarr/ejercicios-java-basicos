/*
* Dado un carácter, determina si es:
* o Una letra mayúscula.
* o Una letra minúscula.
* o Un dígito.
* o Otro símbolo.
*/

import java.util.Scanner;

public class A08_ClasificacionDeCaracteres {
  public static void main(String[] args) {

    // Crea un objeto Scanner para leer la entrada del usuario.
    Scanner sc = new Scanner(System.in);
    // Pide al usuario que introduzca un carácter.
    System.out.println("Por favor introduce un caracter: ");
    // Lee la primera letra de la entrada del usuario y la guarda como un carácter.
    char caracter = sc.next().charAt(0);

    // Comprueba si el carácter es una letra mayúscula (entre 'A' y 'Z').
    if (caracter >= 'A' && caracter <= 'Z') {
      System.out.println("El caracter " + caracter + " es una letra mayúscula.");
      // Comprueba si el carácter es una letra minúscula (entre 'a' y 'z').
    } else if (caracter >= 'a' && caracter <= 'z') {
      System.out.println("El caracter " + caracter + " es una letra minúscula.");
      // Comprueba si el carácter es un dígito (entre '0' y '9').
    } else if (caracter >= '0' && caracter <= '9') {
      System.out.println("El caracter " + caracter + " es un dígito.");
      // Si no es letra mayúscula, minúscula o dígito, es otro símbolo.
    } else {
      System.out.println("El caracter " + caracter + " es otro símbolo");
    }

    // Cierra el objeto Scanner para liberar recursos.
    sc.close();
  }
}
