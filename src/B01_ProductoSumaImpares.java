/*
* Diseñar un programa que muestre el producto y la suma de los 10
* primeros números impares de un array de n longitud.
*/

public class B01_ProductoSumaImpares {

  public static void main(String[] args) {

    // Declaración e inicialización del array con 20 números
    int[] numeros = { 5, 92, 13, 78, 45, 61, 8, 33, 27, 50, 1, 88, 19, 72, 3, 66, 40, 99, 10, 55 };

    // Variables para almacenar resultados
    int contador = 0; // Contador de números impares encontrados
    int suma = 0; // Almacenará la suma de los impares
    long producto = 1L; // Usamos long para evitar desbordamiento en multiplicaciones grandes

    // Recorremos el array mientras no hayamos encontrado 10 impares
    for (int i = 0; i < numeros.length && contador < 10; i++) {

      // Verificamos si el número actual es impar
      if (numeros[i] % 2 == 1) {
        producto *= numeros[i]; // Multiplicamos el número impar al producto
        suma += numeros[i]; // Sumamos el número impar
        contador++; // Incrementamos el contador de impares
      }

    }

    // Mostramos los resultados
    System.out.println();
    System.out.println("El resultado de los diez primeros números impares es: ");
    System.out.println("Producto: " + producto);
    System.out.println("Suma: " + suma);

  }
}
