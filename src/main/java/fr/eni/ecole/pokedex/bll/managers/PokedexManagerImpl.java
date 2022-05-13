package fr.eni.ecole.pokedex.bll.managers;

import java.util.List;

import fr.eni.ecole.pokedex.bll.bo.Pokemon;

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
		// TODO Auto-generated method stub
		return null;
	}

}
