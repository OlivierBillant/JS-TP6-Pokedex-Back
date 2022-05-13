package fr.eni.ecole.pokedex.bll.managers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.eni.ecole.pokedex.bll.bo.Pokemon;
import fr.eni.ecole.pokedex.bll.bo.Type;

public class PokedexManagerImpl implements PokedexManager {
	private static PokedexManager instance = null;
	
	public static PokedexManager getInstance() {
		if(instance == null) {
			instance = new PokedexManagerImpl();
		}
		return instance;
	}
	
	private PokedexManagerImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Pokemon> findAll() {
		List<Pokemon> pokemons = new ArrayList<Pokemon>();
		pokemons.add(new Pokemon(1, "Bulbizarre", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/001.png",
				Arrays.asList(Type.PLANTE, Type.POISON)));
		pokemons.add(new Pokemon(2, "Herbizarre", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/002.png",
				Arrays.asList(Type.PLANTE, Type.POISON)));
		pokemons.add(new Pokemon(3, "Florizarre", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/003.png",
				Arrays.asList(Type.PLANTE, Type.POISON)));
		pokemons.add(new Pokemon(4, "Salamèche", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/004.png",
				Arrays.asList(Type.FEU)));
		pokemons.add(new Pokemon(5, "Reptincel", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/005.png",
				Arrays.asList(Type.FEU)));
		pokemons.add(new Pokemon(6, "Dracaufeu", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/006.png",
				Arrays.asList(Type.FEU, Type.VOL)));
		pokemons.add(new Pokemon(7, "Carapuce", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/007.png",
				Arrays.asList(Type.EAU)));
		pokemons.add(new Pokemon(8, "Carabaffe", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/008.png",
				Arrays.asList(Type.EAU)));
		pokemons.add(new Pokemon(9, "Tortank", "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/009.png",
				Arrays.asList(Type.EAU)));
		return pokemons;
	}

}
