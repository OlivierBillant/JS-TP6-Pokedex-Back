package fr.eni.ecole.pokedex.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.eni.ecole.pokedex.bll.bo.Pokemon;
import fr.eni.ecole.pokedex.bll.managers.ManagerFactory;
import fr.eni.ecole.pokedex.bll.managers.PokedexManager;

@RestController
@CrossOrigin(origins = "*")
public class PokedexRestApi {
	//Il faut indiquer a SpringBoot qu'il s'agit d'une API en le precisant par une annotation
	//Il faut l'autoriser a accepter des requetes de toutes les sources
	private PokedexManager pokedexManager = ManagerFactory.getPokedexManager(); 

	@GetMapping("/pokemons")
	public List<Pokemon> getPokemons(){
		return pokedexManager.findAll();
		
	}
}
