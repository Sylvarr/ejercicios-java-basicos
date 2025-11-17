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

    System.out.println();
    System.out.println("RESULTADOS");
    System.out.println("----------");
    System.out.println();
    System.out.println("1. La longitud del texto es de " + texto.length() + " caracteres.");
    System.out.println("2. El texto en mayúsculas seria: " + texto.toUpperCase());

    String[] textoEnArrray = texto.split(" ");

    System.out.println("3. El texto separado por palabras y por fila seria: ");
    System.out.println();

    int letrasMinusculas = 0;
    for (int i = 0; i < textoEnArrray.length; i++) {
      System.out.println("--> " + textoEnArrray[i]);

      for (int j = 0; j < textoEnArrray[i].length(); j++) {

        if (textoEnArrray[i].charAt(j) >= 'a' && textoEnArrray[i].charAt(j) <= 'z') {
          letrasMinusculas++;

        }

      }

    }

    System.out.println("4. El número de letras minúsculas sería " + letrasMinusculas + ".");
    System.out.println();
    System.out.println("5. El triángulo con el texto introducido sería: ");
    System.out.println();

    for (int i = textoEnArrray.length; i > 0; i--) {
      String fraseCompuesta = "";

      for (int j = 0; j < i; j++) {
        fraseCompuesta += textoEnArrray[j] + " ";
      }

      System.out.println("--> " + fraseCompuesta);
    }

    sc.close();

  }

}
