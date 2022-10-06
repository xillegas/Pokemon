/**
 * Clase Pokemon. Para programa que simula una batalla pokemon.
 * Autor: Alfredo A. Villegas
 * Version: 1.0
 * Fecha: 01-08-2017
 */
 
 public class Pokemon
 {
	 //Atributos
	 String nombrePokemon;
	 char tipo; // f=fuego, a=agua, h=hierba.
     int HP;	
	 
	 //Constructor
	  Pokemon() {}
	 //Constructor
	 Pokemon(String nombrePokemon, char tipo, int HP) 
	 {
		this.nombrePokemon = nombrePokemon; // ojo con esto
		this.tipo = tipo;
		this.HP = HP;
	 }
	 
	 public String getNombrePokemon() {
		return nombrePokemon;
	}
	
	 //Metodo: disminuye HP hecho por un daño
	 public void setHp(int dano)
	 {
		 if(HP > 0)
		 {
		 this.HP = this.HP - dano;
		 }
	 }
	 
	 //Metodo: devuelve el daño a infligir
	 public int hacerDano(Ataque ataque, Pokemon oponente)
	 {
		 int dano = 0;
		 char tipoOponente = oponente.tipo;
		 char tipodeAtaque = ataque.tipoAtaque;
		 if(ataque.PP > 0)
		 {
			 if(tipodeAtaque == tipoOponente) //Probar si asi se comparan los "char"
			 {
				 dano = ataque.dano;
			 }		 
		 }
		 ataque.hizoAtaque();
		 return dano;
	 }
	
 }