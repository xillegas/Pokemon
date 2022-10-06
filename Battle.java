/**
 * Programa que simula una batalla pokemon.
 * Autor: Alfredo A. Villegas
 * Version: 1.1
 * Fecha: 01-08-2017
 */

 import java.util.Scanner;
 
 public class Battle
 {
	 //Metodo principal
	 public static void main (String[] args) 
	 {
		 // Creando buffer de lectura de datos
		 Scanner reader = new Scanner(System.in);
		
		 int golpe = 0;
		 //Creando pokemones y ataques
		 //Pokemon(String nombrePokemon, char tipo, int HP) 
		 Pokemon pokemon1 = new Pokemon("bulbasaur", 'h', 120);
		 Pokemon pokemon2 = new Pokemon("charmander", 'f', 90);
		 Pokemon pokemon3 = new Pokemon("Squirtle", 'a', 600);
		 Pokemon pokemon4 = new Pokemon("Charizard", 'f', 900);
		 //Ataque(String nombreAtaque, char tipoAtaque, int dano, int PP) 
		 Ataque ataque1 = new Ataque("Hojas navaja", 'h', 40, 10);
		 Ataque ataque2 = new Ataque("Lanzallamas", 'f', 40, 10);
		 Ataque ataque3 = new Ataque("Chorro de agua", 'a', 40, 10);
		 
		 boolean combat = true;
		 
		 //Eleccion de los pokemones a combatir
		 Pokemon poke1 = pokemon3;
		 Pokemon poke2 = pokemon4;
		 
		 
		 
		while (combat) 
		{
			for (int i=1; i <100; i++) System.out.println(); 

			System.out.println("===============================================================");
			System.out.println("\tCombate Pokemon entre " + poke1.getNombrePokemon() + " y " + poke2.getNombrePokemon());  
			System.out.println("===============================================================");

			System.out.println(poke1.getNombrePokemon() + " HP: " + poke1.HP); 
			System.out.println(poke2.getNombrePokemon() + " HP: " + poke2.HP); 			 
			
				//Ataque poke1 a poke2
				System.out.println(poke1.getNombrePokemon() +" Ataca con " + ataque3.getNombreAtaque());
				golpe = poke1.hacerDano(ataque3, poke2);
				poke2.setHp(golpe);
				if(ataque3.PP < 1)
				{
					System.out.println(poke1.getNombrePokemon() +" No puede usar " + ataque3.getNombreAtaque() + "! En su lugar le metio un lepe");
				}

				//Ataque poke2 a poke1
				System.out.println(poke2.getNombrePokemon() +" Ataca con " + ataque2.getNombreAtaque());
				golpe = poke2.hacerDano(ataque2, poke1);
				poke1.setHp(golpe);
				if(ataque2.PP < 1)
				{
					System.out.println(poke2.getNombrePokemon() +" No puede usar " + ataque2.getNombreAtaque() + "! En su lugar le zampo una mano");
				}
				
				
			System.out.println(poke1.getNombrePokemon() + " HP: " + poke1.HP); 
			System.out.println(poke2.getNombrePokemon() + " HP: " + poke2.HP); 
			String opcion = reader.next();   
			
			System.out.println(); 
			if(poke1.HP < 1 || poke2.HP < 1)
			{
				System.out.println("El combate ha terminado!"); 
				combat = false;
				if(poke1.HP < poke2.HP)
				{
					System.out.println(poke2.getNombrePokemon() + " Ha ganado el combate!!"); 
				}
				else
				{
					System.out.println(poke1.getNombrePokemon() + " Ha ganado el combate!!"); 
				}
			}
		}
	 }
	 
 }