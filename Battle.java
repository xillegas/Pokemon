/**
 * Programa que simula una batalla pokemon.
 * Autor: Alfredo A. Villegas
 * Version: 1.0
 * Fecha: 01-08-2017
 */
 
 public class Battle
 {
	 //Metodo principal
	 public static void main (String[] args) 
	 {
		 int golpe = 0;
		 //Creando pokemones
		 //Pokemon(String nombrePokemon, char tipo, int HP) 
		 Pokemon poke1 = new Pokemon("bulbasaur", 'h', 100);
		 Pokemon poke2 = new Pokemon("chikorita", 'h', 120);
		 //Ataque(String nombreAtaque, char tipoAtaque, int dano, int PP) 
		 Ataque ataque1 = new Ataque("Hojas navaja", 'h', 40, 10);
		 
		 boolean combat = true;
		 
		 while (combat) 
		 {
			for (int i=1; i <100; i++) System.out.println(); 

			System.out.println("===============================================================");
			System.out.println("\tCombate Pokemon entre " + poke1.getNombrePokemon() + " y " + poke2.getNombrePokemon());  
			System.out.println("===============================================================");
			
			for (int i=1; i <5; i++)
			{
				System.out.println(poke1.getNombrePokemon() +" Ataca con " + ataque1.getNombreAtaque());
				golpe = poke1.hacerDano(ataque1, poke2);
				poke2.setHp(golpe);
				System.out.println(poke1.getNombrePokemon() + " HP: " + poke1.HP); 
				System.out.println(poke2.getNombrePokemon() + " HP: " + poke2.HP); 
				
				System.out.println(poke2.getNombrePokemon() +" Ataca con " + ataque1.getNombreAtaque());
				golpe = poke2.hacerDano(ataque1, poke1);
				poke1.setHp(golpe);
				System.out.println(poke1.getNombrePokemon() + " HP: " + poke1.HP); 
				System.out.println(poke2.getNombrePokemon() + " HP: " + poke2.HP); 
			}
			
			System.out.println(); 
			
			combat = false;
		 }
	 }
	 
 }