package fr.eni.ecole.pokedex.bll.managers;

import java.util.List;

import fr.eni.ecole.pokedex.bll.bo.Pokemon;

public interface PokedexManager {
	List<Pokemon> findAll();
}
