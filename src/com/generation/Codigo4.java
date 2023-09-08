/*
 * Juego: Piedra, papel o tijeras
 * El código lo que hace es pedir dos datos de tipo String al usuario, los cuales
 * por el momento no se verifican que sean exactamente igual a piedra, papel o tijeras.
 * Después de pedir los datos, se primero a comparar si ambos datos son iguales, si es 
 * cierta esta comparación entonces código acaba e imprime "Empate".
 * 
 * Se iguala una variable con el número 1, está será la que guarda el número del ganador
 * 
 * Depués se empieza a comparar a partir de switch el j1 vs j2, danodonos 3 casos
 * case "piedra", que se comparará con tijeras y papel, si es con tijeras seguira 
 * siendo el ganador el jugador 2, después si se compara con papel. rompiendo el 
 * switch y quedando g=2;
 * Y depúes se comparan papel con piedra y tijeras con papel.
 */

package com.generation;
import java.util.Scanner; // Se importa el paquete de Scanner

public class Codigo4 {
	public static void main(String[] args) { // Se agrega el método main para que se ejecute el progaram 
		// Empiezo a ordenar un poco el código para que sea más facil de leer
		// Se Cambia el nombre de la variable para mejorar la legibilidad
	Scanner s1 = new Scanner(System.in); // Se le da un valor al constructor
	Scanner s2 = new Scanner(System.in); 
	
	System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	String j1 = s1.nextLine();

	System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	String j2 = s1.nextLine();

	if(j1.equals(j2)){ // Se cambian todos los == por .equals() ya que se estan comparando strings
		System.out.println("Empate");
	}else{
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) {
            g = 1;
          }
          if(j2.equals("papel")) {
        	  break;
          }
          break;
          // Se agrega otro if para comparar piedra con papel, para que en este 
          // caso haya un quiebre del switch y se quede con el valor g = 2.
          // porque si esta el caso de que j1 = piedra y j2 = papel, ganaría j1 y
          // no es correto
        case "papel":
          if (j2.equals("piedra")) {
            g = 1;
          }
          break;
          
        case "tijeras": // agregar una s
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
	}
    } // Cierre del método ´main
	
}// Cierre de la clase
