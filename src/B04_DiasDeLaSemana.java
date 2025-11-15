/*
 * Pide al usuario un número del 1 al 7 e imprime el día de la semana correspondiente (1 = "Lunes", 2 = "Martes", ... 7 = "Domingo"). 
 * Si introduce otro número, muestra "Número no válido".
 */

import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario.

public class B04_DiasDeLaSemana {

  public static void main(String[] args) {

    // Crea un objeto Scanner para leer la entrada de la consola.
    Scanner sc = new Scanner(System.in);

    // Pide al usuario que introduzca un número.
    System.out.println("Por favor escribe un número entre 1 y 7: ");

    // Lee el número entero introducido por el usuario.
    int dia = sc.nextInt();

    // Utiliza una declaración switch para asociar el número del día con su nombre.
    switch (dia) {
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("Martes");
        break;
      case 3:
        System.out.println("Miercoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      case 5:
        System.out.println("Viernes");
        break;
      case 6:
        System.out.println("Sábado");
        break;
      case 7:
        System.out.println("Domingo");
        break;

      // Si el número no está entre 1 y 7, se ejecuta el caso por defecto.
      default:
        System.out.println("Por favor escribe un número válido.");
        break;
    }

    // Cierra el objeto Scanner para liberar recursos.
    sc.close();
  }

}
