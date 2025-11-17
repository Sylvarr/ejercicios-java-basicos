public class B05_TrianguloDePalabras {

  public static void main(String[] args) {

    // Nos dan un String
    String frase = "Dame un grr, un que, un grr, un que un que ?!";
    // Creamos un array a partir de cada elemento o palabra
    String[] fraseArray = frase.split(" ");

    /*
     * Creamos un bucle que recoge las iteraciones a un número igual que los
     * elementos del array
     * En cada iteracion, el array es con un elemento más corto
     */
    for (int i = fraseArray.length; i > 0; i--) {

      // En cada iteración se crea un string vacio
      String fraseNueva = "";

      // Este bucle recorre los elementos del array hasta i (numero total de elementos
      // actuales del array)
      for (int j = 0; j < i; j++) {

        // Se rellena el nuevo String con cada elemento del array separado por espacios
        fraseNueva += fraseArray[j] + " ";

      }

      System.out.println(fraseNueva);

    }

  }
}
