/**
 * Clase Ataque. Para programa que simula una batalla pokemon.
 * Autor: Alfredo A. Villegas
 * Version: 1.1
 * Fecha: 01-08-2017
 */
 
 public class Ataque
 {
	 //Atributos
	 String nombreAtaque;
	 char tipoAtaque;
     int dano;
	 int PP;
	 
	 //Constructor
	 Ataque(String nombreAtaque, char tipoAtaque, int dano, int PP) 
	 {
		 this.nombreAtaque = nombreAtaque; // ojo con esto
		 this.tipoAtaque = tipoAtaque;
		 this.dano = dano;
		 this.PP = PP;
	 }
	 
	public String getNombreAtaque() {
		return nombreAtaque;
	}
	 
	 //Metodo
	 public void hizoAtaque()
	 {
		 PP = PP - 1; /// No puse "this"... No hizo falta!
	 }
	 
 
 }