/**
 * Clase Pokemon. Para programa que simula una batalla pokemon.
 * Autor: Alfredo A. Villegas
 * Version: 1.1
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
		if(HP < 0)
		{
			this.HP = 0;
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
			 /* f vence h 
			  * h vence a
			  * a vence f
			  */
			if(tipodeAtaque == tipoOponente) //Probar si asi se comparan los "char"
			{
				 dano = ataque.dano;
				 //Normal Efectivo
			}
			 //Oponente tipo Hierba
			 else if(tipoOponente == 'h'){
				 if(tipodeAtaque == 'a'){
					 dano = ataque.dano / 2; 
					 //Poco Efectivo
				 }
				 else if(tipodeAtaque == 'f'){
					 dano = ataque.dano * 2; 
					 //Super Efectivo
				 }
			}
			 //Oponente tipo Agua
			 else if(tipoOponente == 'a'){
				 if(tipodeAtaque == 'f'){
					 dano = ataque.dano / 2; 
					 //Poco Efectivo
				 }
				 else if(tipodeAtaque == 'h'){
					 dano = ataque.dano * 2; 
					 //Super Efectivo
				 }
			}
			 //Oponente tipo Fuego
			 else if(tipoOponente == 'f'){
				 if(tipodeAtaque == 'h'){
					 dano = ataque.dano / 2; 
					 //Poco Efectivo
				 }
				 else if(tipodeAtaque == 'a'){
					 dano = ataque.dano * 2;
					 //Super Efectivo
				 }
			}

		}
		else
		{
			dano = 20;
			setHp(10);
		}
		 ataque.hizoAtaque();
		 return dano;
	 }
	
 }