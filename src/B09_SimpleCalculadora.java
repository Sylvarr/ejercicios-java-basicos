/*
* Crear una calculadora simple usando funciones
 */

import java.util.Scanner;

public class B09_SimpleCalculadora {

  // Variables globales para almacenar estado de la calculadora
  static Scanner sc;
  static int numero;
  static double num1, num2, resultado;
  static boolean jugar;
  static String respuesta;

  // Bloque estático: inicializa variables globales al cargar la clase
  static {
    numero = 0;
    sc = new Scanner(System.in);
    num1 = 0;
    num2 = 0;
    resultado = 0;
    jugar = true;
    respuesta = "";
  }

  // Muestra el menú de opciones disponibles
  private static void menu() {
    System.out.println("Por favor elige una opción: ");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    System.out.println("5. Salir");
  }

  // Solicita y lee dos números del usuario
  private static void obtenerNumeros() {
    System.out.println("Por favor dame el primer numero: ");
    num1 = sc.nextDouble();
    sc.nextLine();
    System.out.println("Por favor dame el segundo numero: ");
    num2 = sc.nextDouble();
    sc.nextLine();
  }

  // Métodos de operaciones: realizan cálculos básicos
  private static void sumar() {
    resultado = num1 + num2;
  }

  private static void restar() {
    resultado = num1 - num2;
  }

  private static void multiplicar() {
    resultado = num1 * num2;
  }

  // División con validación: evita división por cero
  private static void dividir() {

    if (num2 == 0) {
      System.out.println("Error: No se puede dividir entre cero.");
      resultado = 0;
    } else {
      resultado = num1 / num2;
    }
  }

  // Bucle principal: controla el flujo de la calculadora
  public static void main(String[] args) {

    while (jugar) {
      // Mostrar menú y obtener opción del usuario
      menu();
      numero = sc.nextInt();
      sc.nextLine();

      // Salir si el usuario elige opción 5
      if (numero == 5) {
        break;
      }

      // Validar que la opción esté en rango válido (1-4)
      if (numero >= 1 && numero <= 4) {
        obtenerNumeros();
      } else {
        System.out.println("Por favor introduce un número válido.");
        continue;
      }

      // Ejecutar operación según la opción seleccionada
      switch (numero) {
        case 1:
          sumar();
          break;
        case 2:
          restar();
          break;
        case 3:
          multiplicar();
          break;
        case 4:
          dividir();
          break;
        default:
          System.out.println("Por favor introduce un número correcto.");
      }

      // Mostrar resultado de la operación
      System.out.println("El resultado es " + resultado);

      // Preguntar si continuar jugando
      System.out.println("Quieres volver a jugar (s/n) ?");
      respuesta = sc.nextLine().trim().toLowerCase();
      if (respuesta.startsWith("n")) {
        jugar = false;
        System.out.println("Juego finalizado.");
      }

    }

  }

}
