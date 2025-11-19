/*
* Escribe un programa Java que funcione de acuerdo con las siguientes
* especificaciones:
* ▸ Debe permitir al usuario introducir un texto por teclado.
* ▸ Se mostrará en pantalla la longitud del texto (número de caracteres).
* ▸ Se mostrará el texto en mayúsculas.
* ▸ Se mostrará el texto separado por palabras (cada palabra en una línea) usando el
* método split().
* ▸ Se contará el número de letras minúsculas.
* ▸ Se mostrará un triángulo con el texto introducido.
*/

import java.util.Scanner;

public class B06_ActividadTrimestralUno {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor introduce un texto: ");
    String texto = sc.nextLine();
    String[] textoEnArray = texto.split(" ");

    System.out.println();
    System.out.println("RESULTADOS");
    System.out.println("----------");

    int numeroDeCaracteres = 0;
    int letrasMinusculas = 0;

    System.out.println("1. El texto en mayúsculas seria: " + texto.toUpperCase());
    System.out.println("2. El texto separado por palabras y por fila seria: ");
    System.out.println();

    for (int i = 0; i < textoEnArray.length; i++) {
      System.out.println("--> " + textoEnArray[i]);

      for (int j = 0; j < textoEnArray[i].length(); j++) {

        numeroDeCaracteres++;

        if (textoEnArray[i].charAt(j) >= 'a' && textoEnArray[i].charAt(j) <= 'z') {
          letrasMinusculas++;
        }
      }
    }
    System.out.println();
    System.out.println("3. La longitud del texto es de " + numeroDeCaracteres + " caracteres.");
    System.out.println("4. El número de letras minúsculas sería " + letrasMinusculas + ".");
    System.out.println("5. El triángulo con el texto introducido sería: ");
    System.out.println();

    for (int i = textoEnArray.length; i > 0; i--) {
      String fraseCompuesta = "";

      for (int j = 0; j < i; j++) {
        fraseCompuesta += textoEnArray[j] + " ";
      }

      System.out.println("--> " + fraseCompuesta);
    }

    sc.close();
  }
}